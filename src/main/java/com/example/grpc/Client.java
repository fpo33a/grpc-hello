/*
 https://codelabs.developers.google.com/codelabs/cloud-grpc-java/index.html?index=..%2F..index#3
 mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.Client

 This client reads some value provided by the Server microservice, reading some data from an inMemory Kafka Store

 C:\jdk1.8\bin\java.exe -javaagent:C:\frank\intellij\lib\idea_rt.jar=64922:C:\frank\intellij\bin -Dfile.encoding=UTF-8 -classpath C:\jdk1.8\jre\lib\charsets.jar;C:\jdk1.8\jre\lib\deploy.jar;C:\jdk1.8\jre\lib\ext\access-bridge-64.jar;C:\jdk1.8\jre\lib\ext\cldrdata.jar;C:\jdk1.8\jre\lib\ext\dnsns.jar;C:\jdk1.8\jre\lib\ext\jaccess.jar;C:\jdk1.8\jre\lib\ext\jfxrt.jar;C:\jdk1.8\jre\lib\ext\localedata.jar;C:\jdk1.8\jre\lib\ext\nashorn.jar;C:\jdk1.8\jre\lib\ext\sunec.jar;C:\jdk1.8\jre\lib\ext\sunjce_provider.jar;C:\jdk1.8\jre\lib\ext\sunmscapi.jar;C:\jdk1.8\jre\lib\ext\sunpkcs11.jar;C:\jdk1.8\jre\lib\ext\zipfs.jar;C:\jdk1.8\jre\lib\javaws.jar;C:\jdk1.8\jre\lib\jce.jar;C:\jdk1.8\jre\lib\jfr.jar;C:\jdk1.8\jre\lib\jfxswt.jar;C:\jdk1.8\jre\lib\jsse.jar;C:\jdk1.8\jre\lib\management-agent.jar;C:\jdk1.8\jre\lib\plugin.jar;C:\jdk1.8\jre\lib\resources.jar;C:\jdk1.8\jre\lib\rt.jar;C:\frank\grpc\grpc-hello-server\target\classes;C:\Users\frank\.m2\repository\org\apache\kafka\kafka-streams\2.4.1\kafka-streams-2.4.1.jar;C:\Users\frank\.m2\repository\org\apache\kafka\connect-json\2.4.1\connect-json-2.4.1.jar;C:\Users\frank\.m2\repository\org\apache\kafka\connect-api\2.4.1\connect-api-2.4.1.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.10.0\jackson-databind-2.10.0.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.0\jackson-annotations-2.10.0.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.10.0\jackson-core-2.10.0.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.10.0\jackson-datatype-jdk8-2.10.0.jar;C:\Users\frank\.m2\repository\org\slf4j\slf4j-api\1.7.28\slf4j-api-1.7.28.jar;C:\Users\frank\.m2\repository\org\rocksdb\rocksdbjni\5.18.3\rocksdbjni-5.18.3.jar;C:\Users\frank\.m2\repository\org\apache\kafka\kafka-clients\2.4.1\kafka-clients-2.4.1.jar;C:\Users\frank\.m2\repository\com\github\luben\zstd-jni\1.4.3-1\zstd-jni-1.4.3-1.jar;C:\Users\frank\.m2\repository\org\lz4\lz4-java\1.6.0\lz4-java-1.6.0.jar;C:\Users\frank\.m2\repository\org\xerial\snappy\snappy-java\1.1.7.3\snappy-java-1.1.7.3.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-netty\1.7.0\grpc-netty-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-core\1.7.0\grpc-core-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-context\1.7.0\grpc-context-1.7.0.jar;C:\Users\frank\.m2\repository\com\google\errorprone\error_prone_annotations\2.0.19\error_prone_annotations-2.0.19.jar;C:\Users\frank\.m2\repository\com\google\code\findbugs\jsr305\3.0.0\jsr305-3.0.0.jar;C:\Users\frank\.m2\repository\com\google\instrumentation\instrumentation-api\0.4.3\instrumentation-api-0.4.3.jar;C:\Users\frank\.m2\repository\io\opencensus\opencensus-api\0.6.0\opencensus-api-0.6.0.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-http2\4.1.16.Final\netty-codec-http2-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-http\4.1.16.Final\netty-codec-http-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec\4.1.16.Final\netty-codec-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-handler\4.1.16.Final\netty-handler-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-buffer\4.1.16.Final\netty-buffer-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-common\4.1.16.Final\netty-common-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-handler-proxy\4.1.16.Final\netty-handler-proxy-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-transport\4.1.16.Final\netty-transport-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-resolver\4.1.16.Final\netty-resolver-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-socks\4.1.16.Final\netty-codec-socks-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-protobuf\1.7.0\grpc-protobuf-1.7.0.jar;C:\Users\frank\.m2\repository\com\google\protobuf\protobuf-java\3.4.0\protobuf-java-3.4.0.jar;C:\Users\frank\.m2\repository\com\google\guava\guava\19.0\guava-19.0.jar;C:\Users\frank\.m2\repository\com\google\protobuf\protobuf-java-util\3.4.0\protobuf-java-util-3.4.0.jar;C:\Users\frank\.m2\repository\com\google\code\gson\gson\2.7\gson-2.7.jar;C:\Users\frank\.m2\repository\com\google\api\grpc\proto-google-common-protos\0.1.9\proto-google-common-protos-0.1.9.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-protobuf-lite\1.7.0\grpc-protobuf-lite-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-stub\1.7.0\grpc-stub-1.7.0.jar com.example.grpc.Client
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Please enter key : bb

value: "123456"

Please enter key : aa

value: "123"

Please enter key : ee

value: "654"

Please enter key : xx

value: "888"

*/
package com.example.grpc;

import io.grpc.*;

import java.util.Scanner;

public class Client {

    public static void main( String[] args ) throws Exception
    {
        // connecting to server in plaintext
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:9080")
                .usePlaintext(true)
                .build();

        // Use a blocking stub.
        KeyValueServiceGrpc.KeyValueServiceBlockingStub stub = KeyValueServiceGrpc.newBlockingStub(channel);

        // reading key from keyboard, and getting value from server
        boolean bStop = false;
        while (!bStop)
        {
            System.out.print ("Please enter key : ");
            Scanner in = new Scanner(System.in);
            String key = in.nextLine();
            System.out.println ("");
            if (key.compareToIgnoreCase("exit") == 0) bStop = true;
            else
            {
                KeyValueServiceOuterClass.ValueRequest request = KeyValueServiceOuterClass.ValueRequest.newBuilder()
                        .setKey(key)
                        .build();

                // Finally, make the call using the stub with the formatted key
                KeyValueServiceOuterClass.ValueResponse response = stub.getValue(request);
                System.out.println(response);
            }
        }

        // A Channel should be shutdown before stopping the process.
        channel.shutdownNow();
    }
}
