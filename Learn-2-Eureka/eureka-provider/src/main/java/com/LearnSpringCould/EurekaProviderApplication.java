package com.LearnSpringCould;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/07/31
 */
@Controller
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderApplication {

    public static void main( String[] args ) {
	SpringApplication.run( EurekaProviderApplication.class, args );
    }

    /** 日志 */
    private static final Logger LOG = LoggerFactory.getLogger( EurekaProviderApplication.class );

    @Autowired
    private DiscoveryClient client;

    @ResponseBody
    @GetMapping( "/hello" )
    public String index() {
	ServiceInstance instance = client.getLocalServiceInstance();
	LOG.info( "/hello ,host:{},service_id:{}", instance.getHost(), instance.getServiceId() );
	return "Hello World";
    }

}
