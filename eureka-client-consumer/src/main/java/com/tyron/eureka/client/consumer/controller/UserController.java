package com.tyron.eureka.client.consumer.controller;

import com.tyron.eureka.client.consumer.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 用户控制器
 * @Author: Chenzt
 * @Date: Created in 2020/1/21
 */
@RestController
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/userlogin")
    public String login() {
        return "收到结果：" + userFeignClient.login();
    }
}
