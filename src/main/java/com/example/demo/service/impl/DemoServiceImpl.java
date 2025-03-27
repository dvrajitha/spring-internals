package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoServiceImpl implements DemoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public void aMethod() {
        LOGGER.info("Executing.. DemoServiceImpl.aMethod");
        anotherMethod();
    }

    @Override
    public void anotherMethod() {
        LOGGER.info("Executing.. DemoServiceImpl.anotherMethod");
    }
}
