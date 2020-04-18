// https://codelabs.developers.google.com/codelabs/cloud-grpc-java/index.html?index=..%2F..index#2
// mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.App
package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * KeyValue demo
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // Create a new server to listen on port 8080
        Server server = ServerBuilder.forPort(8080)
                .addService(new KeyValueServiceImpl())
                .build();

        // Start the server
        try {
            server.start();
            // Server threads are running in the background.
            System.out.println("Server started");
            // Don't exit the main thread. Wait until server is terminated.
            server.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
