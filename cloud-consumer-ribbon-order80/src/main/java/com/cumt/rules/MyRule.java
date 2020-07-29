package com.cumt.rules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: MyRule
 * @author: liuxiaosong
 * @Date: 2020/7/29
 * @version: 1.0
 */
@Configuration
public class MyRule {
    @Bean
    public IRule mySelfRule() {
        // 定义为随机
        return new RandomRule();
    }

}
