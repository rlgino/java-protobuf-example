package com.rlgino.protobufexample.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: wishlist.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WishListServiceGrpc {

  private WishListServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.WishListService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq,
      com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq.class,
      responseType = com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq,
      com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp> getCreateMethod() {
    io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq, com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp> getCreateMethod;
    if ((getCreateMethod = WishListServiceGrpc.getCreateMethod) == null) {
      synchronized (WishListServiceGrpc.class) {
        if ((getCreateMethod = WishListServiceGrpc.getCreateMethod) == null) {
          WishListServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq, com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp.getDefaultInstance()))
              .setSchemaDescriptor(new WishListServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq,
      com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq.class,
      responseType = com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq,
      com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp> getAddMethod() {
    io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq, com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp> getAddMethod;
    if ((getAddMethod = WishListServiceGrpc.getAddMethod) == null) {
      synchronized (WishListServiceGrpc.class) {
        if ((getAddMethod = WishListServiceGrpc.getAddMethod) == null) {
          WishListServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq, com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp.getDefaultInstance()))
              .setSchemaDescriptor(new WishListServiceMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq,
      com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq.class,
      responseType = com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq,
      com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp> getListMethod() {
    io.grpc.MethodDescriptor<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq, com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp> getListMethod;
    if ((getListMethod = WishListServiceGrpc.getListMethod) == null) {
      synchronized (WishListServiceGrpc.class) {
        if ((getListMethod = WishListServiceGrpc.getListMethod) == null) {
          WishListServiceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq, com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp.getDefaultInstance()))
              .setSchemaDescriptor(new WishListServiceMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WishListServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WishListServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WishListServiceStub>() {
        @java.lang.Override
        public WishListServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WishListServiceStub(channel, callOptions);
        }
      };
    return WishListServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WishListServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WishListServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WishListServiceBlockingStub>() {
        @java.lang.Override
        public WishListServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WishListServiceBlockingStub(channel, callOptions);
        }
      };
    return WishListServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WishListServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WishListServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WishListServiceFutureStub>() {
        @java.lang.Override
        public WishListServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WishListServiceFutureStub(channel, callOptions);
        }
      };
    return WishListServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WishListServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq request,
        io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void add(com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq request,
        io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void list(com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq request,
        io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq,
                com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp>(
                  this, METHODID_CREATE)))
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq,
                com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp>(
                  this, METHODID_ADD)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq,
                com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class WishListServiceStub extends io.grpc.stub.AbstractAsyncStub<WishListServiceStub> {
    private WishListServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WishListServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WishListServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq request,
        io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq request,
        io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq request,
        io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WishListServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WishListServiceBlockingStub> {
    private WishListServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WishListServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WishListServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp create(com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp add(com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp list(com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WishListServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WishListServiceFutureStub> {
    private WishListServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WishListServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WishListServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp> create(
        com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp> add(
        com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp> list(
        com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_ADD = 1;
  private static final int METHODID_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WishListServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WishListServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListReq) request,
              (io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.CreateWishListResp>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((com.rlgino.protobufexample.protobuf.Wishlist.AddItemReq) request,
              (io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.AddItemResp>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.rlgino.protobufexample.protobuf.Wishlist.ListWishListReq) request,
              (io.grpc.stub.StreamObserver<com.rlgino.protobufexample.protobuf.Wishlist.ListWishListResp>) responseObserver);
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

  private static abstract class WishListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WishListServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.rlgino.protobufexample.protobuf.Wishlist.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WishListService");
    }
  }

  private static final class WishListServiceFileDescriptorSupplier
      extends WishListServiceBaseDescriptorSupplier {
    WishListServiceFileDescriptorSupplier() {}
  }

  private static final class WishListServiceMethodDescriptorSupplier
      extends WishListServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WishListServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WishListServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WishListServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getAddMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
