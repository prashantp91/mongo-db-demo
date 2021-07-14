package com.example.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.entity.User;
import com.example.mongo.services.UserService;

@RestController
public class MongoDBController {

	@Autowired
	UserService userService;
	
	@GetMapping("/ping")
	String ping() {
		System.out.println("called");
		return "Hello, Server is up and running";
	}
	
	@PostMapping("/user")
	String createUser(@RequestBody User user) {
		System.out.println(user.getFirstname());
		String userResponses = userService.createUser(user);
		return userResponses;
	}

	@PutMapping("/user/{id}")
	User updateUser(@PathVariable String id) {
		User user = userService.getUser(id);
		System.out.println(user.toString());
		return user;
	}

	@GetMapping("/user/{id}")
	User getUser(@PathVariable String id) {
		User user = userService.getUser(id);
		System.out.println(user.toString());
		return user;
	}
	
	@GetMapping("/users")
	List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
