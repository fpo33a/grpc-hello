package com.example.grpc;

import io.grpc.stub.StreamObserver;


public class KeyValueServiceImpl extends KeyValueServiceGrpc.KeyValueServiceImplBase {

   // @Override
    public void getValue(KeyValueServiceOuterClass.ValueRequest request,
                         StreamObserver<KeyValueServiceOuterClass.ValueResponse> responseObserver) {
        // getValue has toString auto-generated.
        System.out.println(request);

        // You must use a builder to construct a new Protobuffer object
        KeyValueServiceOuterClass.ValueResponse response = KeyValueServiceOuterClass.ValueResponse.newBuilder()
                .setValue("Hello there, " + request.getKey())
                .build();

        // Use responseObserver to send a single response back
        responseObserver.onNext(response);

        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
    }
}
