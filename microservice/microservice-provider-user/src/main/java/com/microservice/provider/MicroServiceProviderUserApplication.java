package com.microservice.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProviderUserApplication.class, args);
	}

}
