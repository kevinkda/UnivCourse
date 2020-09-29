package com.kevinkda.univ.tcp.hw.hw20200909.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/9/10 13:40
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.hw.hw20200909.controller
 * @classname IndexController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@RestController
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping({"/", "index", "index.html"})
    public String index() {
        return info();
    }

    public String info() {
        Map<String, String> info = new HashMap<>();

        info.put("name","Kevin");
        info.put("sex","Man");
        info.put("hobby","run");
        info.put("height","165");
        info.put("weight","60");

        return info.toString();
    }

}
