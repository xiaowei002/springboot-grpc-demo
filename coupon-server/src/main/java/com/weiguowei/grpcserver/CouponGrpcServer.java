package com.weiguowei.grpcserver;

import com.alibaba.fastjson.JSON;
import com.weiguowei.domain.Coupon;
import com.weiguowei.util.CouponUtil;
import com.weiguowei.grpc.server.CouponServerResponse;
import com.weiguowei.grpc.server.CouponServiceGrpc;
import com.weiguowei.grpc.server.DeductCouponRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CouponGrpcServer extends CouponServiceGrpc.CouponServiceImplBase {

    @Override
    public void deductCouponInventory(DeductCouponRequest request, StreamObserver<CouponServerResponse> responseObserver) {
        int couponId = request.getCouponId();
        //查询数据
        Coupon coupon = CouponUtil.getCouponById(couponId);
        //序列化
        String jsonString = JSON.toJSONString(coupon);
        CouponServerResponse.Builder builder = CouponServerResponse.newBuilder()
                .setCode(200)
                .setMessage("操作成功!")
                .setData(jsonString);

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
