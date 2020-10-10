/*

https://codelabs.developers.google.com/codelabs/cloud-grpc-java/index.html?index=..%2F..index#2
mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.App

This application creates a kafka store on a topic via a kTable ( could have been a GlobalKTable) and allow client to query value by key, reading some data from an inMemory Kafka Store
Notes:

1/ The "key not found" is not managed yet in this code
2/ here is how to update the ktable ( some values where already in the topic )
    C:\frank\apache-kafka-2.4.1\bin\windows>kafka-console-producer.bat --broker-list localhost:9092 --property "parse.key=true" --property "key.separator=:" --topic storeInput
    >bb:123456
3/ output
C:\jdk1.8\bin\java.exe -javaagent:C:\frank\intellij\lib\idea_rt.jar=64828:C:\frank\intellij\bin -Dfile.encoding=UTF-8 -classpath C:\jdk1.8\jre\lib\charsets.jar;C:\jdk1.8\jre\lib\deploy.jar;C:\jdk1.8\jre\lib\ext\access-bridge-64.jar;C:\jdk1.8\jre\lib\ext\cldrdata.jar;C:\jdk1.8\jre\lib\ext\dnsns.jar;C:\jdk1.8\jre\lib\ext\jaccess.jar;C:\jdk1.8\jre\lib\ext\jfxrt.jar;C:\jdk1.8\jre\lib\ext\localedata.jar;C:\jdk1.8\jre\lib\ext\nashorn.jar;C:\jdk1.8\jre\lib\ext\sunec.jar;C:\jdk1.8\jre\lib\ext\sunjce_provider.jar;C:\jdk1.8\jre\lib\ext\sunmscapi.jar;C:\jdk1.8\jre\lib\ext\sunpkcs11.jar;C:\jdk1.8\jre\lib\ext\zipfs.jar;C:\jdk1.8\jre\lib\javaws.jar;C:\jdk1.8\jre\lib\jce.jar;C:\jdk1.8\jre\lib\jfr.jar;C:\jdk1.8\jre\lib\jfxswt.jar;C:\jdk1.8\jre\lib\jsse.jar;C:\jdk1.8\jre\lib\management-agent.jar;C:\jdk1.8\jre\lib\plugin.jar;C:\jdk1.8\jre\lib\resources.jar;C:\jdk1.8\jre\lib\rt.jar;C:\frank\grpc\grpc-hello-server\target\classes;C:\Users\frank\.m2\repository\org\apache\kafka\kafka-streams\2.4.1\kafka-streams-2.4.1.jar;C:\Users\frank\.m2\repository\org\apache\kafka\connect-json\2.4.1\connect-json-2.4.1.jar;C:\Users\frank\.m2\repository\org\apache\kafka\connect-api\2.4.1\connect-api-2.4.1.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.10.0\jackson-databind-2.10.0.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.0\jackson-annotations-2.10.0.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.10.0\jackson-core-2.10.0.jar;C:\Users\frank\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.10.0\jackson-datatype-jdk8-2.10.0.jar;C:\Users\frank\.m2\repository\org\slf4j\slf4j-api\1.7.28\slf4j-api-1.7.28.jar;C:\Users\frank\.m2\repository\org\rocksdb\rocksdbjni\5.18.3\rocksdbjni-5.18.3.jar;C:\Users\frank\.m2\repository\org\apache\kafka\kafka-clients\2.4.1\kafka-clients-2.4.1.jar;C:\Users\frank\.m2\repository\com\github\luben\zstd-jni\1.4.3-1\zstd-jni-1.4.3-1.jar;C:\Users\frank\.m2\repository\org\lz4\lz4-java\1.6.0\lz4-java-1.6.0.jar;C:\Users\frank\.m2\repository\org\xerial\snappy\snappy-java\1.1.7.3\snappy-java-1.1.7.3.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-netty\1.7.0\grpc-netty-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-core\1.7.0\grpc-core-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-context\1.7.0\grpc-context-1.7.0.jar;C:\Users\frank\.m2\repository\com\google\errorprone\error_prone_annotations\2.0.19\error_prone_annotations-2.0.19.jar;C:\Users\frank\.m2\repository\com\google\code\findbugs\jsr305\3.0.0\jsr305-3.0.0.jar;C:\Users\frank\.m2\repository\com\google\instrumentation\instrumentation-api\0.4.3\instrumentation-api-0.4.3.jar;C:\Users\frank\.m2\repository\io\opencensus\opencensus-api\0.6.0\opencensus-api-0.6.0.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-http2\4.1.16.Final\netty-codec-http2-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-http\4.1.16.Final\netty-codec-http-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec\4.1.16.Final\netty-codec-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-handler\4.1.16.Final\netty-handler-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-buffer\4.1.16.Final\netty-buffer-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-common\4.1.16.Final\netty-common-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-handler-proxy\4.1.16.Final\netty-handler-proxy-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-transport\4.1.16.Final\netty-transport-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-resolver\4.1.16.Final\netty-resolver-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-socks\4.1.16.Final\netty-codec-socks-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-protobuf\1.7.0\grpc-protobuf-1.7.0.jar;C:\Users\frank\.m2\repository\com\google\protobuf\protobuf-java\3.4.0\protobuf-java-3.4.0.jar;C:\Users\frank\.m2\repository\com\google\guava\guava\19.0\guava-19.0.jar;C:\Users\frank\.m2\repository\com\google\protobuf\protobuf-java-util\3.4.0\protobuf-java-util-3.4.0.jar;C:\Users\frank\.m2\repository\com\google\code\gson\gson\2.7\gson-2.7.jar;C:\Users\frank\.m2\repository\com\google\api\grpc\proto-google-common-protos\0.1.9\proto-google-common-protos-0.1.9.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-protobuf-lite\1.7.0\grpc-protobuf-lite-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-stub\1.7.0\grpc-stub-1.7.0.jar com.example.grpc.App
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Start running store
Server started
key = bb, value = 123456
key: "bb"

retrieve store ...
2020-04-19T14:04:52.105 : value for key bb = 123456
key: "bb"

retrieve store ...
2020-04-19T14:13:17.305 : value for key bb = 123456
key: "aa"

retrieve store ...
2020-04-19T14:13:20.802 : value for key aa = 123
key: "ee"

retrieve store ...
2020-04-19T14:13:23.573 : value for key ee = 654
key: "xx"

 */
package com.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.errors.InvalidStateStoreException;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.apache.kafka.streams.state.Stores;

import java.io.IOException;
import java.util.Properties;

/**
 * KeyValue demo
 *
 */
public class App 
{
    final static String storeName = "fpStore";

    //----------------------------------------------------------------------

    public static void main( String[] args )
    {
        App app = new App();

        // create the kafka store
        KafkaStreams streams = app.startKafkaStore();

        // Create a new server to listen on port 9080
        Server server = ServerBuilder.forPort(9080)
                .addService(new KeyValueServiceImpl(App.storeName, streams))
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

    //----------------------------------------------------------------------

    private KafkaStreams startKafkaStore ()
    {
        Properties streamsConfig = new Properties();
        // The name must be unique on the Kafka cluster
        streamsConfig.put(StreamsConfig.APPLICATION_ID_CONFIG, "grpc-store-example");
        // Brokers
        streamsConfig.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        // SerDes for key and value
        streamsConfig.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        streamsConfig.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        streamsConfig.put(StreamsConfig.APPLICATION_SERVER_CONFIG, "localhost:9092");
        streamsConfig.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        StreamsBuilder builder = new StreamsBuilder();

        KeyValueBytesStoreSupplier storeSupplier = Stores.inMemoryKeyValueStore(App.storeName);

        KTable<String,String> ktable = builder.table( "storeInput",
                Materialized.<String,String>as(storeSupplier)
                        .withKeySerde(Serdes.String())
                        .withValueSerde(Serdes.String())
                        .withCachingDisabled());
        // the below map purpose is only to track changes detected
        KStream<String,String> data = ktable.toStream().map( (k, v) -> { System.out.println("key = "+k + ", value = "+v); return KeyValue.pair(k,v);});

        System.out.println("Start running store");
        KafkaStreams streams = new KafkaStreams(builder.build(), streamsConfig);
        streams.cleanUp();
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

        return streams;
    }

    //--------------------------------------------------------------------


}
