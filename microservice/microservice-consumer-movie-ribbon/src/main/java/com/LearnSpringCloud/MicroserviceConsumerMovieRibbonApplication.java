package com.LearnSpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceConsumerMovieRibbonApplication {

    // 注入一个 RestTemplate http请求工具 增加@LoadBalanced Ribbon 使其具备负载均衡能力
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
	return new RestTemplate();
    }

    public static void main(String[] args) {
	SpringApplication.run(MicroserviceConsumerMovieRibbonApplication.class, args);
    }

}
