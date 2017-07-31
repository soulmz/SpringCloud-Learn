package com.LearnSpringCould;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/07/28
 */
@Controller
@SpringBootApplication
public class Learn1Application {
    /** 日志 */
    private static final Logger LOG = LoggerFactory.getLogger( Learn1Application.class );

    public static void main( String[] args ) {
	SpringApplication.run( Learn1Application.class, args );
    }

    @GetMapping( { "/", "" } )
    @ResponseBody
    public String helloWorld() {
	LOG.info( "123144" );
	return "Hello World";
    }

}
