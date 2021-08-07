package com.kevinkda.demo.proj.spring.cloud.test.b20201117;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
//@ComponentScan({"com.kevinkda.demo.proj.spring.cloud.test.b20201117", "com.kevinkda.core.util"})
public class SpringCloudTest202011Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTest202011Application.class, args);
    }

}
