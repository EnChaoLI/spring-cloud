package com.george.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author enchaolee
 * @description
 * @date 2020-11-05 10:20 2020-09-20 09:20
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigClientController {
//    @Value("${server.port}")
    private String serverPort="999";

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo() {
        return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
    }

}
