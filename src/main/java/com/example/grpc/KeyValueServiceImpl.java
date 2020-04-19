package com.example.grpc;

import io.grpc.stub.StreamObserver;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.errors.InvalidStateStoreException;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;

import java.time.LocalDateTime;


public class KeyValueServiceImpl extends KeyValueServiceGrpc.KeyValueServiceImplBase
{
    private String storeName = null;
    private KafkaStreams streams = null;

    //----------------------------------------------------------------------

    public KeyValueServiceImpl (String storeName, KafkaStreams streams)
    {
        this.storeName = storeName;
        this.streams = streams;
    }

    //----------------------------------------------------------------------
    // @Override
    public void getValue(KeyValueServiceOuterClass.ValueRequest request,
                         StreamObserver<KeyValueServiceOuterClass.ValueResponse> responseObserver) {
        // getValue has toString auto-generated.
        System.out.println(request);

        // get Value in kafka store
        final String valueFromStore = this.getValueFromStore(request.getKey());

        // construct a new Protobuffer object with the response
        KeyValueServiceOuterClass.ValueResponse response = KeyValueServiceOuterClass.ValueResponse.newBuilder()
                .setValue(valueFromStore)
                .build();

        // send single response back
        responseObserver.onNext(response);

        // finishing
        responseObserver.onCompleted();
    }

    //----------------------------------------------------------------------

    private ReadOnlyKeyValueStore<String, String> waitUntilStoreIsQueryable(final String storeName, final KafkaStreams streams)
    {
        System.out.println("retrieve store ...");
        while (true)
        {
            try
            {
                return streams.store(storeName, QueryableStoreTypes.<String, String>keyValueStore());
            }
            catch (InvalidStateStoreException ignored)
            {
                System.out.println("still wait for store ..."+ignored.getMessage());
                // store not yet ready for querying
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //----------------------------------------------------------------------

    private String getValueFromStore(String key)
    {
        ReadOnlyKeyValueStore<String, String> kafkaStore = this.waitUntilStoreIsQueryable(this.storeName,this.streams);
        final String value = kafkaStore.get(key);
        if (value == null) System.out.println (LocalDateTime.now()+" : No value found for key : "+key);
        else System.out.println (LocalDateTime.now()+" : value for key "+key+" = "+value);
        return value;
    }

    //----------------------------------------------------------------------

}
