package com.george.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author enchaolee
 * @description Ribbon自定义IRule规则
 * @date 2020-11-05 10:20 2020-09-16 14:24
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
