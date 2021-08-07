package com.kevinkda.demo.proj.spring.cloud.test.consumer.b20201117.b01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudTestConsumer2020111701Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTestConsumer2020111701Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
