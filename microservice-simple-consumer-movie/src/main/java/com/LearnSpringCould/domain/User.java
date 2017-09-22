package com.LearnSpringCould.domain;

import lombok.Data;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/22
 */
@Data
public class User {

    /**
     * id : 1
     * username : account1
     * name : 张三
     * age : 20
     * balance : 100
     */
    private int    id;
    private String username;
    private String name;
    private int    age;
    private int    balance;

}
