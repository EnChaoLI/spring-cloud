package com.george.sms.helper.config;

import com.george.sms.helper.entity.SmsProperties;
import com.george.sms.helper.service.impl.AliyunSmsSenderImpl;
import com.george.sms.helper.service.impl.TencentSmsSenderImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author enchaolee
 * @Date 2020/11/5
 * https://mp.weixin.qq.com/s/TsuQQE2lLrErITUIeikhsQ
 **/

@Configuration
@EnableConfigurationProperties(value = SmsProperties.class)
public class SmsAutoConfiguration {

    /**
     * 阿里云发送短信的实现类
     *
     * @param smsProperties
     * @return
     */
    @Bean
    public AliyunSmsSenderImpl aliYunSmsSender(SmsProperties smsProperties) {
        return new AliyunSmsSenderImpl(smsProperties.getAliyun());
    }

    /**
     * 腾讯云发送短信的实现类
     *
     * @param smsProperties
     * @return
     */
    @Bean
    public TencentSmsSenderImpl tencentSmsSender(SmsProperties smsProperties) {
        return new TencentSmsSenderImpl(smsProperties.getTencent());
    }

}
