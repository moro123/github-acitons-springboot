package com.example.api_rest_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiRestSpringbootApplication {

	@GetMapping("/welcome")
	public String sayHello() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringbootApplication.class, args);
	}

}
