package com.kevinkda.demo.proj.spring.cloud.eureka.b20201118.b01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudTest20201118EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTest20201118EurekaApplication.class, args);
    }

}
