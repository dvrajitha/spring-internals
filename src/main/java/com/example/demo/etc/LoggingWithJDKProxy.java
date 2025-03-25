package com.example.demo.etc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingWithJDKProxy implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingWithJDKProxy.class);

    private final Object target;

    public LoggingWithJDKProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOGGER.info("Before invoking method: {}", method.getName());
        Object result = method.invoke(target, args);
        LOGGER.info("After invoking method: {}", method.getName());
        return result;
    }

    public static void main(String[] args) {
        SomeService realService = new SomeServiceImpl();
        SomeService proxyService = (SomeService) Proxy.newProxyInstance(
                SomeService.class.getClassLoader(),
                new Class[]{SomeService.class},
                new LoggingWithJDKProxy(realService)
        );
        proxyService.aMethod();
        //proxyService.anotherMethod();
    }
}
