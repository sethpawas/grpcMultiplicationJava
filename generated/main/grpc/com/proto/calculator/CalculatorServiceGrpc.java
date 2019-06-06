package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: table.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "ayush.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.tableRequest,
      com.proto.calculator.tableResponse> getTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "tables",
      requestType = com.proto.calculator.tableRequest.class,
      responseType = com.proto.calculator.tableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.tableRequest,
      com.proto.calculator.tableResponse> getTablesMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.tableRequest, com.proto.calculator.tableResponse> getTablesMethod;
    if ((getTablesMethod = CalculatorServiceGrpc.getTablesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getTablesMethod = CalculatorServiceGrpc.getTablesMethod) == null) {
          CalculatorServiceGrpc.getTablesMethod = getTablesMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.tableRequest, com.proto.calculator.tableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ayush.CalculatorService", "tables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.tableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.tableResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("tables"))
                  .build();
          }
        }
     }
     return getTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.greetingsRequest,
      com.proto.calculator.greetingsResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greet",
      requestType = com.proto.calculator.greetingsRequest.class,
      responseType = com.proto.calculator.greetingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.greetingsRequest,
      com.proto.calculator.greetingsResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.greetingsRequest, com.proto.calculator.greetingsResponse> getGreetMethod;
    if ((getGreetMethod = CalculatorServiceGrpc.getGreetMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGreetMethod = CalculatorServiceGrpc.getGreetMethod) == null) {
          CalculatorServiceGrpc.getGreetMethod = getGreetMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.greetingsRequest, com.proto.calculator.greetingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ayush.CalculatorService", "greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.greetingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.greetingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("greet"))
                  .build();
          }
        }
     }
     return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.tableRequest,
      com.proto.calculator.divisorResponse> getGCDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GCD",
      requestType = com.proto.calculator.tableRequest.class,
      responseType = com.proto.calculator.divisorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.tableRequest,
      com.proto.calculator.divisorResponse> getGCDMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.tableRequest, com.proto.calculator.divisorResponse> getGCDMethod;
    if ((getGCDMethod = CalculatorServiceGrpc.getGCDMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getGCDMethod = CalculatorServiceGrpc.getGCDMethod) == null) {
          CalculatorServiceGrpc.getGCDMethod = getGCDMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.tableRequest, com.proto.calculator.divisorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ayush.CalculatorService", "GCD"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.tableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.divisorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("GCD"))
                  .build();
          }
        }
     }
     return getGCDMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    return new CalculatorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void tables(com.proto.calculator.tableRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.tableResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTablesMethod(), responseObserver);
    }

    /**
     */
    public void greet(com.proto.calculator.greetingsRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.greetingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     * BiDirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.tableRequest> gCD(
        io.grpc.stub.StreamObserver<com.proto.calculator.divisorResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGCDMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTablesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.tableRequest,
                com.proto.calculator.tableResponse>(
                  this, METHODID_TABLES)))
          .addMethod(
            getGreetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.greetingsRequest,
                com.proto.calculator.greetingsResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGCDMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.calculator.tableRequest,
                com.proto.calculator.divisorResponse>(
                  this, METHODID_GCD)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractStub<CalculatorServiceStub> {
    private CalculatorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void tables(com.proto.calculator.tableRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.tableResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void greet(com.proto.calculator.greetingsRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.greetingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BiDirectional Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.tableRequest> gCD(
        io.grpc.stub.StreamObserver<com.proto.calculator.divisorResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGCDMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.calculator.tableResponse tables(com.proto.calculator.tableRequest request) {
      return blockingUnaryCall(
          getChannel(), getTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.greetingsResponse greet(com.proto.calculator.greetingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.tableResponse> tables(
        com.proto.calculator.tableRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.greetingsResponse> greet(
        com.proto.calculator.greetingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TABLES = 0;
  private static final int METHODID_GREET = 1;
  private static final int METHODID_GCD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TABLES:
          serviceImpl.tables((com.proto.calculator.tableRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.tableResponse>) responseObserver);
          break;
        case METHODID_GREET:
          serviceImpl.greet((com.proto.calculator.greetingsRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.greetingsResponse>) responseObserver);
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
        case METHODID_GCD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.gCD(
              (io.grpc.stub.StreamObserver<com.proto.calculator.divisorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Table.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getTablesMethod())
              .addMethod(getGreetMethod())
              .addMethod(getGCDMethod())
              .build();
        }
      }
    }
    return result;
  }
}
