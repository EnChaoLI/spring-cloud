package com.george.sms.helper.test.controller;

import com.george.sms.helper.service.impl.AliyunSmsSenderImpl;
import com.george.sms.helper.service.impl.TencentSmsSenderImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author enchaolee
 * @Date 2020/11/5
 **/
@RestController
public class TestController {

    @Resource
    private AliyunSmsSenderImpl aliyunSmsSender;

    @Resource
    private TencentSmsSenderImpl tencentSmsSender;


    @GetMapping("/test")
    public String test() {
        aliyunSmsSender.send("用阿里云发送短信");
        tencentSmsSender.send("用腾讯云发送短信");
        return "success";
    }
}
