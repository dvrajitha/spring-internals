package com.example.demo.config.bean;

import org.springframework.stereotype.Component;

@Component
public class MyBeanOne {
    final MyBeanTwo myBeanTwo;

    public MyBeanOne(MyBeanTwo myBeanTwo) {
        this.myBeanTwo = myBeanTwo;
    }
}
