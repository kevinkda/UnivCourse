package com.kevinkda.demo.proj.course.demo0120200909.config;

import com.kevinkda.demo.proj.course.demo0120200909.domain.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kevin KDA on 2020/9/10 15:10
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.course.demo0120200909.config
 * @classname JdbcConfig
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Configuration
public class JdbcConfig {
    @Bean
    @ConfigurationProperties(prefix = "person")
    public User getData() {
        return new User();
    }
}
