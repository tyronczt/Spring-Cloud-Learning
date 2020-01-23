package com.tyron.eureka.client.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: 用户模块通过feign调用接口
 * @Author: Chenzt
 * @Date: Created in 2020/1/21
 *
 * 定义个feign接口 @FeignClient("服务名") 来确定调哪个服务
 */
@FeignClient(name = "eureka-client-provider")
public interface UserFeignClient {

    @GetMapping("/login")
    String login();
}
