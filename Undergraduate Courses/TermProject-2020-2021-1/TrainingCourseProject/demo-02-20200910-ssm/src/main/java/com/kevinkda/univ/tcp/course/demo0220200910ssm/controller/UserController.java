package com.kevinkda.univ.tcp.course.demo0220200910ssm.controller;

import com.kevinkda.univ.tcp.course.demo0220200910ssm.config.JdbcConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author Kevin KDA on 2020/9/10 16:35
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.controller
 * @classname UserController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/")
    public String index() {
        new JdbcConfigProperties().getJdbcUrl();
        return dataSource.toString();
    }
}
