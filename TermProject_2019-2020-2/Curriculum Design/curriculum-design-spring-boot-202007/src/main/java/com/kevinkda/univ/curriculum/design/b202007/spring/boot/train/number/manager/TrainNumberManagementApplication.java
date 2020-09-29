package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot程序入口
 *
 * @author Kevin KDA on 2020/7/6 17:04
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager
 * @classname TrainNumberManagementApplication
 * @apiNote <p></p>
 * @since 1.0.0
 */
@SpringBootApplication
//@ServletComponentScan(basePackages = "com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.web.servlet")
public class TrainNumberManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(TrainNumberManagementApplication.class);
    }
}
