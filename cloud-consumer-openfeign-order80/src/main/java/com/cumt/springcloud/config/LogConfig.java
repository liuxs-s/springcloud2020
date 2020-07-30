package com.cumt.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: LogConfig feign的日志配置
 * @author: liuxiaosong
 * @Date: 2020/7/30
 * @version: 1.0
 */
@Configuration
public class LogConfig {
    /**
     * feignClient配置日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
