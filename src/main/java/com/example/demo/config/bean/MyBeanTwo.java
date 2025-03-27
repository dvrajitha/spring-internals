package com.example.demo.config.bean;

import org.springframework.stereotype.Component;

@Component
public class MyBeanTwo {
    final MyBeanThree myBeanThree;

    public MyBeanTwo(MyBeanThree myBeanThree) {
        this.myBeanThree = myBeanThree;
    }
}
