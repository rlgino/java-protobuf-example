package com.rlgino.protobufexample.controller;

import com.rlgino.protobufexample.grpc.client.WishlistServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishlistController {
    @Autowired
    WishlistServiceClient client;

    @GetMapping("/test")
    public void sendWishlist() {
        client.sendWishlist();
    }
}
