package com.microservice.microserviceconsumermoviefeign.controller;

import com.microservice.microserviceconsumermoviefeign.controller.feign.UserFeignClient;
import com.microservice.microserviceconsumermoviefeign.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/22
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

}
