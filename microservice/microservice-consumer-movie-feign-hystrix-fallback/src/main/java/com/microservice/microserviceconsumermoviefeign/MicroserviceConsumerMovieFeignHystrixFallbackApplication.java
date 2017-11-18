package com.microservice.microserviceconsumermoviefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author zhangmz
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieFeignHystrixFallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieFeignHystrixFallbackApplication.class, args);
	}
}
