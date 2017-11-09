package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 高可用服务
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/11/09
 * @since 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryEurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaHaApplication.class,args);
    }
}
