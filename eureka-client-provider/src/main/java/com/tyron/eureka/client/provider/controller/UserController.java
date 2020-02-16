package com.tyron.eureka.client.provider.controller;

import com.tyron.model.UserModel;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 用户模块
 * @Author: Chenzt
 * @Date: Created in 2020/1/21
 */
@RestController
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "8880，用户已验证";
    }

    @PostMapping("/userLoginPostParam")
    public String postParamLogin(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
        String result = "登录失败。";
        if (StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(pwd)) {
            if (name.equals("tyron") && pwd.equals("123456")) {
                result = "登录成功";
            }
        }
        return result;
    }

    @PostMapping("/userLoginPostModel")
    public String postModelLogin(@RequestBody UserModel userModel) {
        String result = "登录失败。";
        if (StringUtils.isNotEmpty(userModel.getName()) && StringUtils.isNotEmpty(userModel.getPwd())) {
            if (userModel.getName().equals("tyron") && userModel.getPwd().equals("654321")) {
                result = "登录成功";
            }
        }
        return result;
    }
}
