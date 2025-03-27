package com.example.demo.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DemoBeanPostProcessor implements BeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass()
                .getName()
                .contains("com.example.demo.config.bean")) {
            LOGGER.info("BeanPostProcessor postProcessBeforeInitialization {}:{}", beanName, bean.getClass());
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass()
                .getName()
                .contains("com.example.demo.config.bean")) {
            LOGGER.info("BeanPostProcessor postProcessAfterInitialization {}:{}", beanName, bean.getClass());
        }
        return bean;
    }
}
