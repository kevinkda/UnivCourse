package com.kevinkda.univ.tcp.course.demo0320200916freemarker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kevinkda.univ.tcp.course.demo0320200916freemarker.mapper")
public class Demo0320200916FreemarkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo0320200916FreemarkerApplication.class, args);
    }

}
