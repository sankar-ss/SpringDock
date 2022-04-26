package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDeployDockerApplication {

	public static void main(String[] args) {
		System.out.println("Test Spring Boot from Docker...");
		SpringApplication.run(SpringDeployDockerApplication.class, args);
	}

}
