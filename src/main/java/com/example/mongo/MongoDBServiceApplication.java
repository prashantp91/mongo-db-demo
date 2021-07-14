package com.example.mongo; //base package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableSwagger2
public class MongoDBServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDBServiceApplication.class, args);
	}
	
}
