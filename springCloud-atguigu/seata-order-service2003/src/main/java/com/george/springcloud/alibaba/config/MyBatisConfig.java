package com.george.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author enchaolee
 */
@Configuration
@MapperScan("com.george.springcloud.alibaba.dao")
public class MyBatisConfig {
}
