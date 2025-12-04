package com.weiguowei.grpcserver;

import com.alibaba.fastjson.JSON;
import com.weiguowei.domain.Product;
import com.weiguowei.grpc.server.DeductProductRequest;
import com.weiguowei.grpc.server.ProductServerResponse;
import com.weiguowei.grpc.server.ProductServiceGrpc;
import com.weiguowei.util.ProductUtil;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProductGrpcServer extends ProductServiceGrpc.ProductServiceImplBase{

    @Override
    public void deductProductInventory(DeductProductRequest request, StreamObserver<ProductServerResponse> responseObserver) {
        int productId = request.getProductId();

        //获取商品
        Product product = ProductUtil.getProductById(productId);
        String jsonString = JSON.toJSONString(product);

        ProductServerResponse.Builder builder = ProductServerResponse.newBuilder()
                .setCode(200)
                .setMessage("操作成功!")
                .setData(jsonString);

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
