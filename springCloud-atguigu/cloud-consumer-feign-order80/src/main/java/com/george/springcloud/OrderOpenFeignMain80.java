package com.george.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author enchaolee
 * @description
 * @date 2020-11-05 10:20 2020-09-16 16:38
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignMain80.class);
    }
}
