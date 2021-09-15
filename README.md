# Protobuf example

## Build from proto file
Download from maven the java plugin:
* https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.40.1/

### Dependencies
````groovy
	// https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java
	implementation group: 'com.google.protobuf', name: 'protobuf-java', version: '4.0.0-rc-2'
	// https://mvnrepository.com/artifact/io.grpc/grpc-stub
	implementation group: 'io.grpc', name: 'grpc-stub', version: '1.40.1'
	// https://mvnrepository.com/artifact/io.grpc/grpc-protobuf
	implementation group: 'io.grpc', name: 'grpc-protobuf', version: '1.40.1'
	// https://mvnrepository.com/artifact/io.grpc/grpc-netty
	implementation group: 'io.grpc', name: 'grpc-netty', version: '1.40.1'
````

### Generate class from proto file
````shell
protoc --plugin=protoc-gen-grpc-java=/mnt/c/protoc-gen-grpc-java-1.40.1-windows-x86_32.exe -I=src/main/resources --java_out=src/main/java --grpc-java_out=java wishlist.proto
````

## Sources
* [Introduction to gRPC - Baeldung](https://www.baeldung.com/grpc-introduction)
