//package com.chinasoft.ssm.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableConfigurationProperties(jdbcProperties.class)//激活属性类
//public class jdbcConfig {
//
//    @Autowired
//    private jdbcProperties jdbc;
//
//    @Bean
//    public DataSource dataSource(){
//       // System.out.println("driver"+jdbc.getDriverClassName());
//        DruidDataSource source=new DruidDataSource();
//        source.setUsername(jdbc.getUsername());
//        source.setPassword(jdbc.getPassword());
//        source.setUrl(jdbc.getJdbcUrl());
//        source.setDriverClassName(jdbc.getDriverClassName());
//        return source;
//    }
//
//}
