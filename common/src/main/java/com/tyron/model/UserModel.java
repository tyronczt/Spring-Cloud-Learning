package com.tyron.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Description: 用户实体类
 * @Author: tyron
 * @Date: Created in 2020/2/15
 */
@Getter
@Setter
public class UserModel {

    private String name;
    private String pwd;
    private int age;
    private Date birthday;

}

