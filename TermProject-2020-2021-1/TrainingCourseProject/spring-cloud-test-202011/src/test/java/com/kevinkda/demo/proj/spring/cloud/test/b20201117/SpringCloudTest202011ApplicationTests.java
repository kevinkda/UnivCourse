package com.kevinkda.demo.proj.spring.cloud.test.b20201117;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({"com.kevinkda.demo.proj.spring.cloud.test.b20201117", "com.kevinkda.core.util"})
class SpringCloudTest202011ApplicationTests {

    @Test
    void contextLoads() {
    }

}
