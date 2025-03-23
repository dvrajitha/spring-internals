package com.example.demo.config;

import com.example.demo.config.bean.MyBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoBeanConfig {
    @Bean
    public MyBeanOne myBeanOne() {
        System.out.println("DemoBeanConfig==========================>" + getClass().getSimpleName());
        return new MyBeanOne();
    }
}
