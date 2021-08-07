package com.kevinkda.univ.tcp.course.demo0220200910ssm.config;

import lombok.Data;

/**
 * @author Kevin KDA on 2020/9/10 17:09
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.config
 * @classname JdbcConfigProperties
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Data
public class JdbcConfigProperties {
    private String username;
    private String password;
    private String jdbcUrl;
    private String driverClassName;
}
