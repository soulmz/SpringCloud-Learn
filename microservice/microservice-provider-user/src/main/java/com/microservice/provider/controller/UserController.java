package com.microservice.provider.controller;

import com.microservice.provider.domain.User;
import com.microservice.provider.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/21
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public User findById(@PathVariable Long id) {
        User one = this.userRepository.findOne(id);
        System.out.println(one);
        return one;
    }

    @GetMapping("/student_json")
    public List getStudentJson() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("刘备", "1406001", 25));
        students.add(new Student("张飞", "1406001", 20));
        students.add(new Student("关羽", "1406001", 23));
        students.add(new Student("曹操", "1405001", 24));
        return students;
    }

    @Data
    @AllArgsConstructor
    class Student{
        private String name;
        private String studentId;
        private Integer age;

    }
}
