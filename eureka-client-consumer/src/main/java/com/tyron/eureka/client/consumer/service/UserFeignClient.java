package com.tyron.eureka.client.consumer.service;

import com.tyron.model.UserModel;
import feign.Logger;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 用户模块通过feign调用接口
 * @Author: Chenzt
 * @Date: Created in 2020/1/21
 * <p>
 * 定义个feign接口 @FeignClient("服务名") 来确定调哪个服务
 */
@FeignClient(name = "eureka-client-provider")
public interface UserFeignClient {

    @GetMapping("/login")
    String login();

    @PostMapping("/userLoginPostParam")
    String postParamLogin(@RequestParam("name") String name, @RequestParam("pwd") String pwd);

    @PostMapping("/userLoginPostModel")
    String userLoginPostModel(@RequestBody UserModel userModel);

    /**
     * 开启Feign的日志
     *
     * @return
     */
    class UserFeignConfig {
        @Bean
        public Logger.Level logger() {
            return Logger.Level.FULL;
        }
    }
}
