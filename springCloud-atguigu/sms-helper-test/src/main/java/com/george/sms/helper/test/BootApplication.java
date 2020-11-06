package com.george.sms.helper.test;

import com.george.sms.helper.annotation.EnableSms;
import com.george.sms.helper.service.impl.AliyunSmsSenderImpl;
import com.george.sms.helper.service.impl.TencentSmsSenderImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author enchaolee
 * @Date 2020/11/5
 **/
@SpringBootApplication
@EnableSms
public class BootApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootApplication.class, args);
     /*   ConfigurableApplicationContext applicationContext = SpringApplication.run(BootApplication.class, args);
        AliyunSmsSenderImpl aliyunSmsSender = applicationContext.getBean(AliyunSmsSenderImpl.class);
        aliyunSmsSender.send("用阿里云发送短信");
        TencentSmsSenderImpl tencentSmsSender = applicationContext.getBean(TencentSmsSenderImpl.class);
        tencentSmsSender.send("用腾讯云发送短信");*/
    }
}
