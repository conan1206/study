package com.conan.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    public static void main(String[] args) {
        LOGGER.debug("debug");
        LOGGER.info("info");
        LOGGER.warn("warning");
        LOGGER.error("error");
    }

}
