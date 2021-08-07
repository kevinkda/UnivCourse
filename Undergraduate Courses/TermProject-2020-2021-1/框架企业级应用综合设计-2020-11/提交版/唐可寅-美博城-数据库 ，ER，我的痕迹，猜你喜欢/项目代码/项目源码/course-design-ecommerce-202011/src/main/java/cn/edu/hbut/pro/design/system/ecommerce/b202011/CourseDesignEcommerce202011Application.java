package cn.edu.hbut.pro.design.system.ecommerce.b202011;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ServletComponentScan("cn.edu.hbut.pro.design.system.ecommerce.b202011.filter")
@ComponentScan({"cn.edu.hbut.pro.design.system.ecommerce.b202011", "com.kevinkda.core.util"})
public class CourseDesignEcommerce202011Application {

    public static void main(String[] args) {
        SpringApplication.run(CourseDesignEcommerce202011Application.class, args);
    }

}
