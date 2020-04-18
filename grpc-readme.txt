-- https://codelabs.developers.google.com/codelabs/cloud-grpc-java/index.html?index=..%2F..index#2

1/ Generate a new project
mvn archetype:generate -DgroupId=com.example.grpc -DartifactId=grpc-hello-server  -DarchetypeArtifactId=maven-archetype-quickstart  -DinteractiveMode=false

C:\frank\grpc>mvn archetype:generate -DgroupId=com.example.grpc -DartifactId=grpc-hello-server  -DarchetypeArtifactId=maven-archetype-quickstart  -DinteractiveMode=false
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/1.3/maven-antrun-plugin-1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/1.3/maven-antrun-plugin-1.3.pom (4.7 kB at 4.7 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/12/maven-plugins-12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/12/maven-plugins-12.pom (12 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/1.3/maven-antrun-plugin-1.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-antrun-plugin/1.3/maven-antrun-plugin-1.3.jar (24 kB at 189 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/2.8/maven-dependency-plugin-2.8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/2.8/maven-dependency-plugin-2.8.pom (11 kB at 92 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/2.8/maven-dependency-plugin-2.8.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-dependency-plugin/2.8/maven-dependency-plugin-2.8.jar (153 kB at 367 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-release-plugin/2.5.3/maven-release-plugin-2.5.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-release-plugin/2.5.3/maven-release-plugin-2.5.3.pom (11 kB at 101 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/release/maven-release/2.5.3/maven-release-2.5.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/release/maven-release/2.5.3/maven-release-2.5.3.pom (5.0 kB at 46 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-release-plugin/2.5.3/maven-release-plugin-2.5.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-release-plugin/2.5.3/maven-release-plugin-2.5.3.jar (53 kB at 340 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-metadata.xml (14 kB at 97 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/mojo/maven-metadata.xml (20 kB at 77 kB/s)
[INFO]
[INFO] ------------------< org.apache.maven:standalone-pom >-------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] --------------------------------[ pom ]---------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.1.0:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.1.0:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.1.0:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Batch mode
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-quickstart/1.0/maven-archetype-quickstart-1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-quickstart/1.0/maven-archetype-quickstart-1.0.pom (703 B at 7.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-bundles/2/maven-archetype-bundles-2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-bundles/2/maven-archetype-bundles-2.pom (1.5 kB at 11 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetype/maven-archetype-parent/1/maven-archetype-parent-1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetype/maven-archetype-parent/1/maven-archetype-parent-1.pom (1.3 kB at 14 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-quickstart/1.0/maven-archetype-quickstart-1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/archetypes/maven-archetype-quickstart/1.0/maven-archetype-quickstart-1.0.jar (4.3 kB at 55 kB/s)
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Old (1.x) Archetype: maven-archetype-quickstart:1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: basedir, Value: C:\frank\grpc
[INFO] Parameter: package, Value: com.example.grpc
[INFO] Parameter: groupId, Value: com.example.grpc
[INFO] Parameter: artifactId, Value: grpc-hello-server
[INFO] Parameter: packageName, Value: com.example.grpc
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] project created from Old (1.x) Archetype in dir: C:\frank\grpc\grpc-hello-server
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 16.408 s
[INFO] Finished at: 2020-04-18T20:29:43+02:00

2/ Create proto directory
C:\frank\grpc\grpc-hello-server>md src\main\proto

3/ create proto file
syntax = "proto3";
package com.example.grpc;

// Request payload
message ValueRequest {
  string key = 1;
}

message ValueResponse {
  string value = 1;
}

// Defining a Service, a Service can have multiple RPC operations
service KeyValueService {
  // Define a RPC operation
  rpc getValue(ValueRequest) returns (ValueResponse);
}

4/ add the gRPC dependencies to the pom.xml:

pom.xml

<project>
  ...
  <dependencies>
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-netty</artifactId>
      <version>1.7.0</version>
    </dependency>
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-protobuf</artifactId>
      <version>1.7.0</version>
    </dependency>
    <dependency>
      <groupId>io.grpc</groupId>
      <artifactId>grpc-stub</artifactId>
      <version>1.7.0</version>
    </dependency>
    ...
  </dependencies>
  ...
</project>

5/ add plugin in pom.xml

  <build>
    <extensions>
      <extension>
        <groupId>kr.motd.maven</groupId>
        <artifactId>os-maven-plugin</artifactId>
        <version>1.5.0.Final</version>
      </extension>
    </extensions>
    <plugins>
      <plugin>
        <groupId>org.xolstice.maven.plugins</groupId>
        <artifactId>protobuf-maven-plugin</artifactId>
        <version>0.5.0</version>
        <configuration>
          <protocArtifact>com.google.protobuf:protoc:3.4.0:exe:${os.detected.classifier}</protocArtifact>
          <pluginId>grpc-java</pluginId>
          <pluginArtifact>io.grpc:protoc-gen-grpc-java:1.7.0:exe:${os.detected.classifier}</pluginArtifact>
        </configuration>
        <executions>
          <execution>
            <goals>
              <goal>compile</goal>
              <goal>compile-custom</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
    </plugins>
  </build>
  
  6/ Generate the stubs
  mvn -DskipTests package
C:\frank\grpc\grpc-hello-server>mvn -DskipTests package
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Detecting the operating system and CPU architecture
[INFO] ------------------------------------------------------------------------
[INFO] os.detected.name: windows
[INFO] os.detected.arch: x86_64
[INFO] os.detected.version: 6.3
[INFO] os.detected.version.major: 6
[INFO] os.detected.version.minor: 3
[INFO] os.detected.classifier: windows-x86_64
[INFO]
[INFO] -----------------< com.example.grpc:grpc-hello-server >-----------------
[INFO] Building grpc-hello-server 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/xolstice/maven/plugins/protobuf-maven-plugin/0.5.0/protobuf-maven-plugin-0.5.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/xolstice/maven/plugins/protobuf-maven-plugin/0.5.0/protobuf-maven-plugin-0.5.0.pom (30 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/xolstice/maven/plugins/protobuf-maven-plugin/0.5.0/protobuf-maven-plugin-0.5.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/xolstice/maven/plugins/protobuf-maven-plugin/0.5.0/protobuf-maven-plugin-0.5.0.jar (180 kB at 411 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-netty/1.7.0/grpc-netty-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-netty/1.7.0/grpc-netty-1.7.0.pom (2.6 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/maven-metadata.xml (2.5 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/1.7.0/grpc-core-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/1.7.0/grpc-core-1.7.0.pom (3.8 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-context/1.7.0/grpc-context-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-context/1.7.0/grpc-context-1.7.0.pom (1.9 kB at 23 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/19.0/guava-19.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/19.0/guava-19.0.pom (6.8 kB at 78 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/19.0/guava-parent-19.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/19.0/guava-parent-19.0.pom (9.9 kB at 106 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.19/error_prone_annotations-2.0.19.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.19/error_prone_annotations-2.0.19.pom (1.6 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.0.19/error_prone_parent-2.0.19.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.0.19/error_prone_parent-2.0.19.pom (5.0 kB at 54 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/instrumentation/instrumentation-api/0.4.3/instrumentation-api-0.4.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/instrumentation/instrumentation-api/0.4.3/instrumentation-api-0.4.3.pom (2.7 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/opencensus/opencensus-api/0.6.0/opencensus-api-0.6.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/opencensus/opencensus-api/0.6.0/opencensus-api-0.6.0.pom (2.8 kB at 35 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/maven-metadata.xml (2.6 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.16.Final/netty-codec-http2-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.16.Final/netty-codec-http2-4.1.16.Final.pom (1.9 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.1.16.Final/netty-parent-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.1.16.Final/netty-parent-4.1.16.Final.pom (52 kB at 415 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.16.Final/netty-codec-http-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.16.Final/netty-codec-http-4.1.16.Final.pom (1.8 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.16.Final/netty-codec-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.16.Final/netty-codec-4.1.16.Final.pom (3.2 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.16.Final/netty-transport-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.16.Final/netty-transport-4.1.16.Final.pom (1.7 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.16.Final/netty-buffer-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.16.Final/netty-buffer-4.1.16.Final.pom (1.5 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.16.Final/netty-common-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.16.Final/netty-common-4.1.16.Final.pom (9.2 kB at 73 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.16.Final/netty-resolver-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.16.Final/netty-resolver-4.1.16.Final.pom (1.5 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.16.Final/netty-handler-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.16.Final/netty-handler-4.1.16.Final.pom (2.9 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.16.Final/netty-handler-proxy-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.16.Final/netty-handler-proxy-4.1.16.Final.pom (2.2 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.16.Final/netty-codec-socks-4.1.16.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.16.Final/netty-codec-socks-4.1.16.Final.pom (1.4 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf/1.7.0/grpc-protobuf-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf/1.7.0/grpc-protobuf-1.7.0.pom (3.3 kB at 35 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.4.0/protobuf-java-3.4.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.4.0/protobuf-java-3.4.0.pom (4.7 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-parent/3.4.0/protobuf-parent-3.4.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-parent/3.4.0/protobuf-parent-3.4.0.pom (6.8 kB at 63 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.4.0/protobuf-java-util-3.4.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.4.0/protobuf-java-util-3.4.0.pom (4.2 kB at 46 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.7/gson-2.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.7/gson-2.7.pom (1.4 kB at 15 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson-parent/2.7/gson-parent-2.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson-parent/2.7/gson-parent-2.7.pom (3.6 kB at 38 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/api/grpc/proto-google-common-protos/0.1.9/proto-google-common-protos-0.1.9.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/api/grpc/proto-google-common-protos/0.1.9/proto-google-common-protos-0.1.9.pom (1.7 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf-lite/1.7.0/grpc-protobuf-lite-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf-lite/1.7.0/grpc-protobuf-lite-1.7.0.pom (2.3 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-stub/1.7.0/grpc-stub-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-stub/1.7.0/grpc-stub-1.7.0.pom (2.1 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-netty/1.7.0/grpc-netty-1.7.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/instrumentation/instrumentation-api/0.4.3/instrumentation-api-0.4.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.19/error_prone_annotations-2.0.19.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-context/1.7.0/grpc-context-1.7.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/1.7.0/grpc-core-1.7.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.0.19/error_prone_annotations-2.0.19.jar (12 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/opencensus/opencensus-api/0.6.0/opencensus-api-0.6.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-context/1.7.0/grpc-context-1.7.0.jar (27 kB at 28 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.16.Final/netty-codec-http2-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/instrumentation/instrumentation-api/0.4.3/instrumentation-api-0.4.3.jar (94 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.16.Final/netty-codec-http-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-netty/1.7.0/grpc-netty-1.7.0.jar (179 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.16.Final/netty-codec-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/opencensus/opencensus-api/0.6.0/opencensus-api-0.6.0.jar (110 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.16.Final/netty-handler-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.16.Final/netty-codec-http-4.1.16.Final.jar (549 kB at 91 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.16.Final/netty-buffer-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.16.Final/netty-codec-http2-4.1.16.Final.jar (402 kB at 60 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.16.Final/netty-common-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.16.Final/netty-codec-4.1.16.Final.jar (314 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.16.Final/netty-handler-proxy-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.16.Final/netty-handler-proxy-4.1.16.Final.jar (21 kB at 2.6 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.16.Final/netty-transport-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.16.Final/netty-buffer-4.1.16.Final.jar (270 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.16.Final/netty-resolver-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.16.Final/netty-resolver-4.1.16.Final.jar (32 kB at 3.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.16.Final/netty-codec-socks-4.1.16.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.16.Final/netty-codec-socks-4.1.16.Final.jar (119 kB at 12 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf/1.7.0/grpc-protobuf-1.7.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.16.Final/netty-common-4.1.16.Final.jar (563 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.4.0/protobuf-java-3.4.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf/1.7.0/grpc-protobuf-1.7.0.jar (6.7 kB at 648 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/19.0/guava-19.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.16.Final/netty-transport-4.1.16.Final.jar (450 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.4.0/protobuf-java-util-3.4.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java-util/3.4.0/protobuf-java-util-3.4.0.jar (69 kB at 6.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.7/gson-2.7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-core/1.7.0/grpc-core-1.7.0.jar (501 kB at 40 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/api/grpc/proto-google-common-protos/0.1.9/proto-google-common-protos-0.1.9.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.7/gson-2.7.jar (232 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf-lite/1.7.0/grpc-protobuf-lite-1.7.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-protobuf-lite/1.7.0/grpc-protobuf-lite-1.7.0.jar (8.0 kB at 603 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-stub/1.7.0/grpc-stub-1.7.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/grpc-stub/1.7.0/grpc-stub-1.7.0.jar (37 kB at 2.7 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.16.Final/netty-handler-4.1.16.Final.jar (372 kB at 27 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protobuf-java/3.4.0/protobuf-java-3.4.0.jar (1.4 MB at 86 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/api/grpc/proto-google-common-protos/0.1.9/proto-google-common-protos-0.1.9.jar (1.7 MB at 98 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/19.0/guava-19.0.jar (2.3 MB at 135 kB/s)
[INFO]
[INFO] --- protobuf-maven-plugin:0.5.0:compile (default) @ grpc-hello-server ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.4/maven-plugin-annotations-3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.4/maven-plugin-annotations-3.4.pom (1.6 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.4/maven-plugin-tools-3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-tools/3.4/maven-plugin-tools-3.4.pom (14 kB at 166 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/18.0/guava-18.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.4/maven-plugin-annotations-3.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugin-tools/maven-plugin-annotations/3.4/maven-plugin-annotations-3.4.jar (14 kB at 46 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/18.0/guava-18.0.jar (2.3 MB at 1.5 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protoc/3.4.0/protoc-3.4.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protoc/3.4.0/protoc-3.4.0.pom (4.5 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protoc/3.4.0/protoc-3.4.0-windows-x86_64.exe
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/protobuf/protoc/3.4.0/protoc-3.4.0-windows-x86_64.exe (5.7 MB at 1.1 MB/s)
[INFO] Compiling 1 proto file(s) to C:\frank\grpc\grpc-hello-server\target\generated-sources\protobuf\java
[INFO]
[INFO] --- protobuf-maven-plugin:0.5.0:compile-custom (default) @ grpc-hello-server ---
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/protoc-gen-grpc-java/1.7.0/protoc-gen-grpc-java-1.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/protoc-gen-grpc-java/1.7.0/protoc-gen-grpc-java-1.7.0.pom (2.1 kB at 28 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/grpc/protoc-gen-grpc-java/1.7.0/protoc-gen-grpc-java-1.7.0-windows-x86_64.exe
Downloaded from central: https://repo.maven.apache.org/maven2/io/grpc/protoc-gen-grpc-java/1.7.0/protoc-gen-grpc-java-1.7.0-windows-x86_64.exe (2.0 MB at 1.1 MB/s)
[INFO] Compiling 1 proto file(s) to C:\frank\grpc\grpc-hello-server\target\generated-sources\protobuf\grpc-java
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ grpc-hello-server ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\frank\grpc\grpc-hello-server\src\main\resources
[INFO] Copying 1 resource
[INFO] Copying 1 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ grpc-hello-server ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 4 source files to C:\frank\grpc\grpc-hello-server\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ grpc-hello-server ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\frank\grpc\grpc-hello-server\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ grpc-hello-server ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ grpc-hello-server ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ grpc-hello-server ---
[INFO] Building jar: C:\frank\grpc\grpc-hello-server\target\grpc-hello-server-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 44.298 s
[INFO] Finished at: 2020-04-18T20:46:20+02:00
[INFO] ------------------------------------------------------------------------

C:\frank\grpc\grpc-hello-server>


C:\frank\grpc\grpc-hello-server>dir /s *.java
 Le volume dans le lecteur C s'appelle TI31128200B
 Le numéro de série du volume est F063-B02B

 Répertoire de C:\frank\grpc\grpc-hello-server\src\main\java\com\example\grpc

18-04-20  20:29               192 App.java
18-04-20  20:43               161 KeyValueServiceImpl.java
               2 fichier(s)              353 octets

 Répertoire de C:\frank\grpc\grpc-hello-server\src\test\java\com\example\grpc

18-04-20  20:29               682 AppTest.java
               1 fichier(s)              682 octets

 Répertoire de C:\frank\grpc\grpc-hello-server\target\generated-sources\protobuf\grpc-java\com\example\grpc

18-04-20  20:46            10.629 KeyValueServiceGrpc.java
               1 fichier(s)           10.629 octets

 Répertoire de C:\frank\grpc\grpc-hello-server\target\generated-sources\protobuf\java\com\example\grpc

18-04-20  20:46            41.150 KeyValueServiceOuterClass.java
               1 fichier(s)           41.150 octets

     Total des fichiers listés :
               5 fichier(s)           52.814 octets
               0 Rép(s)  231.120.396.288 octets libres

C:\frank\grpc\grpc-hello-server>

// at this stage need to implement server and client 

To build make sure that the @override are commented out when generating compilation errors

// build (and run) of the server
C:\frank\grpc\grpc-hello-server> mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.App

// run of the server - the "key" message is displayed when client is calling
Server started
key: "demo"



// build (and run) of the client
C:\frank\grpc\grpc-hello-server> mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.Client

// run of the client
C:\jdk1.8\bin\java.exe -javaagent:C:\frank\intellij\lib\idea_rt.jar=54625:C:\frank\intellij\bin -Dfile.encoding=UTF-8 -classpath C:\jdk1.8\jre\lib\charsets.jar;C:\jdk1.8\jre\lib\deploy.jar;C:\jdk1.8\jre\lib\ext\access-bridge-64.jar;C:\jdk1.8\jre\lib\ext\cldrdata.jar;C:\jdk1.8\jre\lib\ext\dnsns.jar;C:\jdk1.8\jre\lib\ext\jaccess.jar;C:\jdk1.8\jre\lib\ext\jfxrt.jar;C:\jdk1.8\jre\lib\ext\localedata.jar;C:\jdk1.8\jre\lib\ext\nashorn.jar;C:\jdk1.8\jre\lib\ext\sunec.jar;C:\jdk1.8\jre\lib\ext\sunjce_provider.jar;C:\jdk1.8\jre\lib\ext\sunmscapi.jar;C:\jdk1.8\jre\lib\ext\sunpkcs11.jar;C:\jdk1.8\jre\lib\ext\zipfs.jar;C:\jdk1.8\jre\lib\javaws.jar;C:\jdk1.8\jre\lib\jce.jar;C:\jdk1.8\jre\lib\jfr.jar;C:\jdk1.8\jre\lib\jfxswt.jar;C:\jdk1.8\jre\lib\jsse.jar;C:\jdk1.8\jre\lib\management-agent.jar;C:\jdk1.8\jre\lib\plugin.jar;C:\jdk1.8\jre\lib\resources.jar;C:\jdk1.8\jre\lib\rt.jar;C:\frank\grpc\grpc-hello-server\target\classes;C:\Users\frank\.m2\repository\io\grpc\grpc-netty\1.7.0\grpc-netty-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-core\1.7.0\grpc-core-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-context\1.7.0\grpc-context-1.7.0.jar;C:\Users\frank\.m2\repository\com\google\errorprone\error_prone_annotations\2.0.19\error_prone_annotations-2.0.19.jar;C:\Users\frank\.m2\repository\com\google\code\findbugs\jsr305\3.0.0\jsr305-3.0.0.jar;C:\Users\frank\.m2\repository\com\google\instrumentation\instrumentation-api\0.4.3\instrumentation-api-0.4.3.jar;C:\Users\frank\.m2\repository\io\opencensus\opencensus-api\0.6.0\opencensus-api-0.6.0.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-http2\4.1.16.Final\netty-codec-http2-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-http\4.1.16.Final\netty-codec-http-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec\4.1.16.Final\netty-codec-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-handler\4.1.16.Final\netty-handler-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-buffer\4.1.16.Final\netty-buffer-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-common\4.1.16.Final\netty-common-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-handler-proxy\4.1.16.Final\netty-handler-proxy-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-transport\4.1.16.Final\netty-transport-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-resolver\4.1.16.Final\netty-resolver-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\netty\netty-codec-socks\4.1.16.Final\netty-codec-socks-4.1.16.Final.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-protobuf\1.7.0\grpc-protobuf-1.7.0.jar;C:\Users\frank\.m2\repository\com\google\protobuf\protobuf-java\3.4.0\protobuf-java-3.4.0.jar;C:\Users\frank\.m2\repository\com\google\guava\guava\19.0\guava-19.0.jar;C:\Users\frank\.m2\repository\com\google\protobuf\protobuf-java-util\3.4.0\protobuf-java-util-3.4.0.jar;C:\Users\frank\.m2\repository\com\google\code\gson\gson\2.7\gson-2.7.jar;C:\Users\frank\.m2\repository\com\google\api\grpc\proto-google-common-protos\0.1.9\proto-google-common-protos-0.1.9.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-protobuf-lite\1.7.0\grpc-protobuf-lite-1.7.0.jar;C:\Users\frank\.m2\repository\io\grpc\grpc-stub\1.7.0\grpc-stub-1.7.0.jar com.example.grpc.Client
value: "Hello there, demo"


Process finished with exit code 0

