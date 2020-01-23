package com.tyron.eureka.client.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 用户模块
 * @Author: Chenzt
 * @Date: Created in 2020/1/21
 */
@RestController
public class UserController {

    @GetMapping("/login")
    public  String login() {
        return "用户已验证";
    }
}
