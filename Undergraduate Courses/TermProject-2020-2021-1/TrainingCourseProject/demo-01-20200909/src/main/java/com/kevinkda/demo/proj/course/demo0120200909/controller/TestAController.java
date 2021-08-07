package com.kevinkda.demo.proj.course.demo0120200909.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevinkda
 */
@RestController
@RequestMapping("/testA")
public class TestAController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestAController.class);


    @Value("${value}")
    private String arrays;


    @RequestMapping("/arrays")
    public String getValue() {
        LOGGER.info("arrays");
        return arrays;
    }

    public String getArrays() {
        return arrays;
    }

    public void setArrays(String arrays) {
        this.arrays = arrays;
    }
}
