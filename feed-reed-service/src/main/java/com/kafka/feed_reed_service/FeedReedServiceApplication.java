package com.kafka.feed_reed_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FeedReedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedReedServiceApplication.class, args);
	}

}
