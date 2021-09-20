package com.rlgino.protobufexample.grpc.handler;

import com.rlgino.protobufexample.protobuf.WishListServiceGrpc;
import com.rlgino.protobufexample.protobuf.Wishlist;

public final class WishlistHandler extends WishListServiceGrpc.WishListServiceImplBase {
    @Override
    public void create(Wishlist.CreateWishListReq request, io.grpc.stub.StreamObserver<Wishlist.CreateWishListResp> responseObserver) {
        System.out.println("It recived an wishlist " + request.getWishList().getName());
        final Wishlist.CreateWishListResp response = Wishlist.CreateWishListResp.newBuilder().setWishListId(request.getWishList().getId()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void add(Wishlist.AddItemReq request, io.grpc.stub.StreamObserver<Wishlist.AddItemResp> responseObserver) {
        System.out.println("It recived an wishlist item " + request.getItem().getId());
        final Wishlist.AddItemResp response = Wishlist.AddItemResp.newBuilder().setItemId(request.getItem().getId()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void list(Wishlist.ListWishListReq request, io.grpc.stub.StreamObserver<Wishlist.ListWishListResp> responseObserver) {
        System.out.println("Sending wish list items");
        final Wishlist.Item item = Wishlist.Item.newBuilder().setId("123").setPrice(20.0).setWishListId("123").build();
        final Wishlist.ListWishListResp response = Wishlist.ListWishListResp.newBuilder().addItems(item).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
