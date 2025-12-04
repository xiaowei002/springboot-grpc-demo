package com.weiguowei.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.weiguowei.dto.OrderConfirmRequest;
import com.weiguowei.grpc.server.*;
import com.weiguowei.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductServiceGrpc.ProductServiceBlockingStub productService;

    @Autowired
    private CouponServiceGrpc.CouponServiceBlockingStub couponService;

    /**
     * 下单
     *
     * @param request
     */
    @Override
    public void confirmOrder(OrderConfirmRequest request) {
        //1.调用优惠卷服务查询优惠卷
        DeductCouponRequest deductCouponRequest = DeductCouponRequest.newBuilder()
                .setCouponId(request.getCouponRecordId())
                .build();
        CouponServerResponse couponServerResponse;
        try {
            couponServerResponse = couponService.deductCouponInventory(deductCouponRequest);
        } catch (Exception e) {
            log.error("调用优惠卷服务获取的优惠券失败:{}", e.getMessage());
            throw new RuntimeException(e);
        }
        String couponServerResponseData = couponServerResponse.getData();
        JSONObject couponData = JSONObject.parseObject(couponServerResponseData);
        log.info("调用优惠卷服务获取的优惠券信息：{}", couponData);

        //2.调用商品服务查询商品详情
        DeductProductRequest deductProductRequest = DeductProductRequest.newBuilder()
                .setProductId(request.getProductId())
                .build();
        ProductServerResponse productServerResponse;
        try {
            productServerResponse = productService.deductProductInventory(deductProductRequest);
        } catch (Exception e) {
            log.error("调用商品服务查询商品失败: {}", e.getMessage());
            throw new RuntimeException(e);
        }
        String productServerResponseData = productServerResponse.getData();
        JSONObject productData = JSONObject.parseObject(productServerResponseData);
        log.info("调用商品服务查询的商品信息：{}", productData);

        //3.判断优惠券是否在使用范围
        long today = new Date().getTime();
        long startTime = couponData.getDate("startTime").getTime();
        long endTime = couponData.getDate("endTime").getTime();
        if (startTime > today || endTime < today) {
            throw new RuntimeException("当前优惠券不在可用范围内");
        }

        //4.计算金额
        BigDecimal amount = couponData.getBigDecimal("amount");
        BigDecimal price = productData.getBigDecimal("price");
        if (price.subtract(amount).compareTo(request.getTotalAmount()) != 0) {
            throw new RuntimeException("订单验价失败");
        }

        //5.生成订单
        log.info("当前订单购买的商品为:{},原价为:{},本次消耗优惠券:{},实际支付金额:{}",
                productData.getString("name"), productData.getBigDecimal("price"), couponData.getString("name"), request.getTotalAmount());
    }
}
