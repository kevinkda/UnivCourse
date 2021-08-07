package com.kevinkda.demo.proj.course.demo0120200909.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevinkda
 */
@RestController
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);


    @RequestMapping({"/", "index", "index.html"})
    public String index() {
        return "Hello";
    }

    @RequestMapping("/jsonTest")
    public String jsonTest() {
        return "{\n" +
                "  \"origin\": \"125.220.211.3\"\n" +
                "}\n";
    }

}
