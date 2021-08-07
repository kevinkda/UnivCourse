package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Kevin KDA on 2020/7/7 18:16
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager
 * @classname com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.TrainNumberManagementApplication
 * @apiNote <p></p>
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TrainNumberManagementApplicationTest {
    @Autowired
    private TrainNumberManagementApplication trainNumberManagementApplication;

    @Test
    public void main() {
    }
}