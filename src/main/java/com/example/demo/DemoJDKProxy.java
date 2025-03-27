package com.example.demo;

import com.example.demo.proxy.LoggingWithJDKProxy;
import com.example.demo.service.DemoService;
import com.example.demo.service.impl.DemoServiceImpl;

import java.lang.reflect.Proxy;

public class DemoJDKProxy {
    public static void main(String[] args) {
        DemoService realService = new DemoServiceImpl();
        DemoService proxyService = (DemoService) Proxy.newProxyInstance(
                DemoService.class.getClassLoader(),
                new Class[]{DemoService.class},
                new LoggingWithJDKProxy(realService)
        );
        proxyService.aMethod();
        //proxyService.anotherMethod();
    }
}
