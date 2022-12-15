package com.dealsandcouponsfinder.CartPayService.repository;

import java.util.List;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.dealsandcouponsfinder.CartPayService.model.Cart;
@EnableMongoRepositories
public interface CartRepository extends MongoRepository<Cart, String> {

	List<Optional<Cart>> findByUserId(String userId);



}
