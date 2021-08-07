package com.kevinkda.univ.tcp.hw.hw20200909.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kevin KDA on 2020/9/10 13:39
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.hw.hw20200909.controller
 * @classname TestController
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class TestController {
    @Value("${school}")
    private String arrays;

    @RequestMapping("/school")
    public String getValue() {
        return arrays;
    }

    public String getArrays() {
        return arrays;
    }

    public void setArrays(String arrays) {
        this.arrays = arrays;
    }
}
