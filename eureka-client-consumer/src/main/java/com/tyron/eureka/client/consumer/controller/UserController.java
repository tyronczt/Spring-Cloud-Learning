package com.tyron.eureka.client.consumer.controller;

import com.tyron.eureka.client.consumer.service.UserFeignClient;
import com.tyron.model.UserModel;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.*;

/**
 * @Description: 用户控制器
 * @Author: Chenzt
 * @Date: Created in 2020/1/21
 */
@RestController
public class UserController  {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/userlogin")
    public String login() {
        return "8881收到结果：" + userFeignClient.login();
    }

    @PostMapping("/userLoginPostParam")
    public String postParamLogin(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
        return "登录结果：" + userFeignClient.postParamLogin(name, pwd);
    }

    @PostMapping("/userLoginPostModel")
    public String postModelLogin(@RequestBody UserModel userModel) {
        return "登录结果：" + userFeignClient.userLoginPostModel(userModel);
    }
}
