package com.LearnSpringCloud.controller;

import com.LearnSpringCloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/22
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping( "/user/{id}" )
    public User findById(@PathVariable Long id) {
	return restTemplate.getForObject("http://localhost:8000/" + id, User.class);
    }

}
