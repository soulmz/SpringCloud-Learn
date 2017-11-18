package com.LearnSpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovie2Application {

    // 注入一个对象
    @Bean
    public RestTemplate restTemplate() {
	return new RestTemplate();
    }

    public static void main(String[] args) {
	SpringApplication.run(MicroserviceConsumerMovie2Application.class, args);
    }

}
