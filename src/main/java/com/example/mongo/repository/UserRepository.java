package com.example.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

}
