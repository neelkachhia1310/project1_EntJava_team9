package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Project1NeelOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project1NeelOrderServiceApplication.class, args);
	}

}
