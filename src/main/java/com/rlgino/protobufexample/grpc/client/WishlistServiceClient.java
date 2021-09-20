package com.rlgino.protobufexample.grpc.client;

import com.rlgino.protobufexample.protobuf.WishListServiceGrpc;
import com.rlgino.protobufexample.protobuf.Wishlist;
import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishlistServiceClient {
    @Autowired
    ManagedChannel channel;

    public void sendWishlist() {

        final WishListServiceGrpc.WishListServiceBlockingStub stub = WishListServiceGrpc.newBlockingStub(channel);

        final Wishlist.WishList.Builder wishListBuilder = Wishlist.WishList.newBuilder();
        final Wishlist.WishList wishList = wishListBuilder
                .setId("id-1")
                .setName("pepe")
                .setStatus(Wishlist.WishList.WishListStatus.ACTIVE)
                .build();
        final Wishlist.CreateWishListReq request = Wishlist.CreateWishListReq.newBuilder().setWishList(wishList).build();

        final Wishlist.CreateWishListResp createWishListResp = stub.create(request);
        System.out.println("Wish list created: " + createWishListResp.getWishListId());
    }
}
