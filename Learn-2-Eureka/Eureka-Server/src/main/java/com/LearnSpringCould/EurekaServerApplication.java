package com.LearnSpringCould;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/07/28
 */
@EnableEurekaServer
@Controller
@SpringBootApplication
public class EurekaServerApplication {

    public static void main( String[] args ) {
	new SpringApplicationBuilder( EurekaServerApplication.class ).web( true ).run( args );
    }

    @RequestMapping( "/haha" )
    @ResponseBody
    public String hello() {
	return "Hello World";
    }
}
