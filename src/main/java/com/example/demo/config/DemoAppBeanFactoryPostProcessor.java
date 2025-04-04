package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DemoAppBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoAppBeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LOGGER.info("Listing all available beans");
        Arrays.stream(beanFactory.getBeanDefinitionNames())
//                .filter(name -> name.toLowerCase()
//                        .contains("customer"))
                .forEach(System.out::println);
//        String[] beanNamesForType = beanFactory.getBeanNamesForType(CustomerService.class);
//        LOGGER.info("Listing all beans of type: {}", Arrays.toString(beanNamesForType));
        BeanDefinition customerService = beanFactory.getBeanDefinition("customerServiceImpl");
        customerService.setScope(BeanDefinition.SCOPE_PROTOTYPE);

    }
}
