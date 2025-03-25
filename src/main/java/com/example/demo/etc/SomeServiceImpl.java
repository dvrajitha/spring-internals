package com.example.demo.etc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeServiceImpl implements SomeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SomeServiceImpl.class);

    @Override
    public void aMethod() {
        LOGGER.info("Executing.. SomeServiceImpl.aMethod");
        //anotherMethod();
    }

    @Override
    public void anotherMethod() {
        LOGGER.info("Executing.. SomeServiceImpl.anotherMethod");
    }
}
