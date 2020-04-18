package com.example.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Defining a Service, a Service can have multiple RPC operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: KeyValueService.proto")
public final class KeyValueServiceGrpc {

  private KeyValueServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.KeyValueService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.KeyValueServiceOuterClass.ValueRequest,
      com.example.grpc.KeyValueServiceOuterClass.ValueResponse> METHOD_GET_VALUE =
      io.grpc.MethodDescriptor.<com.example.grpc.KeyValueServiceOuterClass.ValueRequest, com.example.grpc.KeyValueServiceOuterClass.ValueResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.KeyValueService", "getValue"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.KeyValueServiceOuterClass.ValueRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.KeyValueServiceOuterClass.ValueResponse.getDefaultInstance()))
          .setSchemaDescriptor(new KeyValueServiceMethodDescriptorSupplier("getValue"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeyValueServiceStub newStub(io.grpc.Channel channel) {
    return new KeyValueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeyValueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KeyValueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeyValueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KeyValueServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static abstract class KeyValueServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void getValue(com.example.grpc.KeyValueServiceOuterClass.ValueRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.KeyValueServiceOuterClass.ValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_VALUE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.KeyValueServiceOuterClass.ValueRequest,
                com.example.grpc.KeyValueServiceOuterClass.ValueResponse>(
                  this, METHODID_GET_VALUE)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class KeyValueServiceStub extends io.grpc.stub.AbstractStub<KeyValueServiceStub> {
    private KeyValueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValueServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void getValue(com.example.grpc.KeyValueServiceOuterClass.ValueRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.KeyValueServiceOuterClass.ValueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_VALUE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class KeyValueServiceBlockingStub extends io.grpc.stub.AbstractStub<KeyValueServiceBlockingStub> {
    private KeyValueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValueServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.example.grpc.KeyValueServiceOuterClass.ValueResponse getValue(com.example.grpc.KeyValueServiceOuterClass.ValueRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_VALUE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class KeyValueServiceFutureStub extends io.grpc.stub.AbstractStub<KeyValueServiceFutureStub> {
    private KeyValueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KeyValueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeyValueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KeyValueServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.KeyValueServiceOuterClass.ValueResponse> getValue(
        com.example.grpc.KeyValueServiceOuterClass.ValueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_VALUE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VALUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeyValueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeyValueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VALUE:
          serviceImpl.getValue((com.example.grpc.KeyValueServiceOuterClass.ValueRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.KeyValueServiceOuterClass.ValueResponse>) responseObserver);
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

  private static abstract class KeyValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeyValueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.KeyValueServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeyValueService");
    }
  }

  private static final class KeyValueServiceFileDescriptorSupplier
      extends KeyValueServiceBaseDescriptorSupplier {
    KeyValueServiceFileDescriptorSupplier() {}
  }

  private static final class KeyValueServiceMethodDescriptorSupplier
      extends KeyValueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeyValueServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeyValueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeyValueServiceFileDescriptorSupplier())
              .addMethod(METHOD_GET_VALUE)
              .build();
        }
      }
    }
    return result;
  }
}
