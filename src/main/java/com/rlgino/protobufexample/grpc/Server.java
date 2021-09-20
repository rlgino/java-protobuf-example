package com.rlgino.protobufexample.grpc;

import com.rlgino.protobufexample.grpc.handler.WishlistHandler;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Server {
    @Value("${grpc.port}")
    private int PORT;
    Logger logger = LoggerFactory.getLogger(Server.class);

    public void start() throws Exception {
        logger.info("GRPC Server started on port: " + PORT);
        io.grpc.Server server = ServerBuilder.forPort(PORT).addService(new WishlistHandler()).build();

        server.start();
        server.awaitTermination();
    }
}
