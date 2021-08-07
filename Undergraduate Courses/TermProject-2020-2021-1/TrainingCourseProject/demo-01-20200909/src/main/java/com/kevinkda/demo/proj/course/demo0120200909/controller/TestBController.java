package com.kevinkda.demo.proj.course.demo0120200909.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevinkda
 */
@RestController
@RequestMapping("/testB")
@ConfigurationProperties(prefix = "person")
public class TestBController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBController.class);


    private String name;
    private String age;


    @RequestMapping("/arrays")
    public String getValue() {
        String backCode = name + "----" + age;
        LOGGER.info(backCode);
        return backCode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
