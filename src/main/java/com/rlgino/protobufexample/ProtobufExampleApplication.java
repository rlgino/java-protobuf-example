package com.rlgino.protobufexample;

import com.rlgino.protobufexample.protobuf.WishListServiceGrpc;
import com.rlgino.protobufexample.protobuf.Wishlist;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProtobufExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProtobufExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Server server = ServerBuilder.forPort(3333).addService(new WishlistService()).build();

		server.start();
		server.awaitTermination();
		 */

		final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 3333).usePlaintext().build();

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
