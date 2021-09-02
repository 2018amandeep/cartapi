package com.cartapi.cartapiemo.Entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingRepository extends MongoRepository<Item, String> {
    
}
