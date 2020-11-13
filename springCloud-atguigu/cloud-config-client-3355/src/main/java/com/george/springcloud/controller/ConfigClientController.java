package com.george.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author enchaolee
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigClientController {

    @Value("${quartz.status}")
    private  String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        System.out.println("========访问3355=======");
        return configInfo;
    }

}
