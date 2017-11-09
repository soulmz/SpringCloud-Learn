package com.learnspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProviderUserMetaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserMetaDataApplication.class, args);
	}
}
