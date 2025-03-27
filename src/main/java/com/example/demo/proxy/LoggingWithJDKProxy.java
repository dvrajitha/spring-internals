package com.example.demo.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingWithJDKProxy implements InvocationHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingWithJDKProxy.class);

    private final Object real;
    
    public LoggingWithJDKProxy(Object real) {
        this.real = real;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOGGER.info("Before invoking method: {}", method.getName());
        Object result = method.invoke(real, args);
        LOGGER.info("After invoking method: {}", method.getName());
        return result;
    }
}
