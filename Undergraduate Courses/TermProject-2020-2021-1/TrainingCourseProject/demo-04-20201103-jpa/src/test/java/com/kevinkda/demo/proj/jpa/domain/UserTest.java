package com.kevinkda.demo.proj.jpa.domain;

import com.kevinkda.core.util.annotation.enumeration.VerifiedType;
import com.kevinkda.core.util.annotation.func.TestInfo;
import com.kevinkda.demo.proj.jpa.Demo0420201103JpaApplication;
import com.kevinkda.demo.proj.jpa.service.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @author Kevin KDA on 2020/11/3 15:29
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.jpa.domain
 * @classname com.kevinkda.demo.proj.jpa.domain.User
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Demo0420201103JpaApplication.class)
//@ContextConfiguration(classes = {UserTest.class})
public class UserTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserTest.class);

    @Resource
    private UserRepository userRepository;

    @TestInfo(version = "1.0.0", status = VerifiedType.Unverified, date = "2020/11/3 15:33")
    @Test
    public void testA() {
        LOGGER.info("Test:testA");
        User user = new User("abc03", "abc03");
        userRepository.save(user);
        LOGGER.info(userRepository.findAll().toString());
    }
}