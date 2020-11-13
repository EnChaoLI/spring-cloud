package com.george.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author enchaolee
 * @Date 2020/11/13
 * 使用github webhook反向通知config server时配置一个controller接收github的请求，然后再转发给bus-refresh  参见：https://www.jianshu.com/p/45280e862317
 **/
@RestController
public class RefreshController {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/refresh")
    public Object sync() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String url = "http://qftx.natapp1.cc/actuator/bus-refresh";
        System.out.println(url);
        restTemplate.postForObject(url, map, Object.class);
        map.put("code", 0);
        return map;
    }
}
