package com.weiguowei.grpc.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * 声明接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: CouponServer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CouponServiceGrpc {

  private CouponServiceGrpc() {}

  public static final String SERVICE_NAME = "com.weiguowei.grpc.server.CouponService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.weiguowei.grpc.server.DeductCouponRequest,
      com.weiguowei.grpc.server.CouponServerResponse> getDeductCouponInventoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deductCouponInventory",
      requestType = com.weiguowei.grpc.server.DeductCouponRequest.class,
      responseType = com.weiguowei.grpc.server.CouponServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.weiguowei.grpc.server.DeductCouponRequest,
      com.weiguowei.grpc.server.CouponServerResponse> getDeductCouponInventoryMethod() {
    io.grpc.MethodDescriptor<com.weiguowei.grpc.server.DeductCouponRequest, com.weiguowei.grpc.server.CouponServerResponse> getDeductCouponInventoryMethod;
    if ((getDeductCouponInventoryMethod = CouponServiceGrpc.getDeductCouponInventoryMethod) == null) {
      synchronized (CouponServiceGrpc.class) {
        if ((getDeductCouponInventoryMethod = CouponServiceGrpc.getDeductCouponInventoryMethod) == null) {
          CouponServiceGrpc.getDeductCouponInventoryMethod = getDeductCouponInventoryMethod =
              io.grpc.MethodDescriptor.<com.weiguowei.grpc.server.DeductCouponRequest, com.weiguowei.grpc.server.CouponServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deductCouponInventory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.weiguowei.grpc.server.DeductCouponRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.weiguowei.grpc.server.CouponServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CouponServiceMethodDescriptorSupplier("deductCouponInventory"))
              .build();
        }
      }
    }
    return getDeductCouponInventoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CouponServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CouponServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CouponServiceStub>() {
        @java.lang.Override
        public CouponServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CouponServiceStub(channel, callOptions);
        }
      };
    return CouponServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CouponServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CouponServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CouponServiceBlockingStub>() {
        @java.lang.Override
        public CouponServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CouponServiceBlockingStub(channel, callOptions);
        }
      };
    return CouponServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CouponServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CouponServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CouponServiceFutureStub>() {
        @java.lang.Override
        public CouponServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CouponServiceFutureStub(channel, callOptions);
        }
      };
    return CouponServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * 声明接口
   * </pre>
   */
  public static abstract class CouponServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deductCouponInventory(com.weiguowei.grpc.server.DeductCouponRequest request,
        io.grpc.stub.StreamObserver<com.weiguowei.grpc.server.CouponServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductCouponInventoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeductCouponInventoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.weiguowei.grpc.server.DeductCouponRequest,
                com.weiguowei.grpc.server.CouponServerResponse>(
                  this, METHODID_DEDUCT_COUPON_INVENTORY)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * 声明接口
   * </pre>
   */
  public static final class CouponServiceStub extends io.grpc.stub.AbstractAsyncStub<CouponServiceStub> {
    private CouponServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CouponServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CouponServiceStub(channel, callOptions);
    }

    /**
     */
    public void deductCouponInventory(com.weiguowei.grpc.server.DeductCouponRequest request,
        io.grpc.stub.StreamObserver<com.weiguowei.grpc.server.CouponServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductCouponInventoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * 声明接口
   * </pre>
   */
  public static final class CouponServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CouponServiceBlockingStub> {
    private CouponServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CouponServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CouponServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.weiguowei.grpc.server.CouponServerResponse deductCouponInventory(com.weiguowei.grpc.server.DeductCouponRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductCouponInventoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * 声明接口
   * </pre>
   */
  public static final class CouponServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CouponServiceFutureStub> {
    private CouponServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CouponServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CouponServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.weiguowei.grpc.server.CouponServerResponse> deductCouponInventory(
        com.weiguowei.grpc.server.DeductCouponRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductCouponInventoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEDUCT_COUPON_INVENTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CouponServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CouponServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEDUCT_COUPON_INVENTORY:
          serviceImpl.deductCouponInventory((com.weiguowei.grpc.server.DeductCouponRequest) request,
              (io.grpc.stub.StreamObserver<com.weiguowei.grpc.server.CouponServerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CouponServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CouponServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.weiguowei.grpc.server.CouponServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CouponService");
    }
  }

  private static final class CouponServiceFileDescriptorSupplier
      extends CouponServiceBaseDescriptorSupplier {
    CouponServiceFileDescriptorSupplier() {}
  }

  private static final class CouponServiceMethodDescriptorSupplier
      extends CouponServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CouponServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CouponServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CouponServiceFileDescriptorSupplier())
              .addMethod(getDeductCouponInventoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
