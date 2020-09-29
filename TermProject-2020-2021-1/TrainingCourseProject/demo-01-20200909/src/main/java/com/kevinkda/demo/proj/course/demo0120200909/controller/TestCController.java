package com.kevinkda.demo.proj.course.demo0120200909.controller;

import com.kevinkda.demo.proj.course.demo0120200909.config.JdbcConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin KDA on 2020/9/10 15:14
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.course.demo0120200909.controller
 * @classname TestCController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@RestController
@RequestMapping("/testC")
public class TestCController {
    @Autowired
    private JdbcConfig jdbc;
    private static final Logger LOGGER = LoggerFactory.getLogger(TestCController.class);

    @RequestMapping("/test")
    public String test() {
        String backCode = jdbc.getData().getUserName() + "---" + jdbc.getData().getAge();
        LOGGER.info(backCode);
        return backCode;
    }
}
