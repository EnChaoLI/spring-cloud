package com.george.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author enchaolee
 */
@RestController
@Slf4j
public class ConfigClientController {


    @PostMapping("/configInfo")
    public void getConfigInfo() {
        System.out.println("===============github push 回调测试成功===========");
    }

}
