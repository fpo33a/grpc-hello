// https://codelabs.developers.google.com/codelabs/cloud-grpc-java/index.html?index=..%2F..index#3
// mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.Client
package com.example.grpc;

import io.grpc.*;

public class Client {

    public static void main( String[] args ) throws Exception
    {
        // Channel is the abstraction to connect to a service endpoint
        // Let's use plaintext communication because we don't have certs
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext(true)
                .build();

        // It is up to the client to determine whether to block the call
        // Here we create a blocking stub, but an async stub,
        // or an async stub with Future are always possible.
        KeyValueServiceGrpc.KeyValueServiceBlockingStub stub = KeyValueServiceGrpc.newBlockingStub(channel);
        KeyValueServiceOuterClass.ValueRequest request = KeyValueServiceOuterClass.ValueRequest.newBuilder()
                        .setKey("demo")
                        .build();

        // Finally, make the call using the stub
        KeyValueServiceOuterClass.ValueResponse response = stub.getValue(request);

        System.out.println(response);

        // A Channel should be shutdown before stopping the process.
        channel.shutdownNow();
    }
}
