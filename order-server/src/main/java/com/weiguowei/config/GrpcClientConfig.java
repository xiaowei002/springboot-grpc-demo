package com.weiguowei.config;

import com.weiguowei.grpc.server.CouponServiceGrpc;
import com.weiguowei.grpc.server.ProductServiceGrpc;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * grpc客户端配置
 */
@Configuration
public class GrpcClientConfig {

    @Value("${product.server.address}")
    private String productServerAddress;

    @Value("${coupon.server.address}")
    private String couponServerAddress;


    /**
     * 商品服务grpc-client
     * @return
     */
    @Bean
    public ProductServiceGrpc.ProductServiceBlockingStub getProductServerClient() {
        return ProductServiceGrpc.newBlockingStub(ManagedChannelBuilder.forTarget(productServerAddress).usePlaintext().build());
    }

    /**
     * 优惠卷服务grpc-client
     * @return
     */
    @Bean
    public CouponServiceGrpc.CouponServiceBlockingStub getCouponServerClient() {
        return CouponServiceGrpc.newBlockingStub(ManagedChannelBuilder.forTarget(couponServerAddress).usePlaintext().build());
    }
}
