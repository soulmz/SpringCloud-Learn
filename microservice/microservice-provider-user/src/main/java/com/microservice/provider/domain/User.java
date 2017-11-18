package com.microservice.provider.domain;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author zhangmz
 * @version 1.0.0
 * @date 2017/09/21
 */
@Data
@Entity
public class User {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long       id;
    @Column
    private String     username;
    @Column
    private String     name;
    @Column
    private Integer    age;
    @Column
    private BigDecimal balance;
}
