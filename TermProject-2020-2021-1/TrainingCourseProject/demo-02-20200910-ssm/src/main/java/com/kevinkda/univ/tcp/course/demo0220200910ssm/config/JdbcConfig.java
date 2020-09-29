package com.kevinkda.univ.tcp.course.demo0220200910ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Kevin KDA on 2020/9/10 16:34
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0220200910ssm.config
 * @classname JdbcConfig
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Configuration
//@EnableConfigurationProperties(JdbcConfigPropertiesB.class)
public class JdbcConfig {
//    @Autowired
//    private JdbcConfigPropertiesB config;

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

//    public DataSource dataSourceB() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUsername(config.getUsername());
//        dataSource.setPassword(config.getPassword());
//        dataSource.setUrl(config.getJdbcUrl());
//        dataSource.setDriverClassName(config.getDriverClassName());
//        return dataSource;
//    }


}
