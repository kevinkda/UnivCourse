package com.chinasoft.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chinasoft.ssm.dao") //扫描的mapper
public class SsmTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsmTestApplication.class,args);
    }
}
