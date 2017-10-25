package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.rest"})
public class HelloWorldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldExampleApplication.class, args);
	}
}
