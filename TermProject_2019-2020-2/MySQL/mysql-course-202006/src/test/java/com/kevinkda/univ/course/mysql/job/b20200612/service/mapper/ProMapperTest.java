package com.kevinkda.univ.course.mysql.job.b20200612.service.mapper;

import com.kevinkda.univ.course.mysql.job.b20200612.constant.ConfigConsts;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileNotFoundException;

/**
 * @author Kevin KDA on 2020/6/11 21:11
 * @version 1.0.0
 * @project mysql-course-202006
 * @package com.kevinkda.univ.course.mysql.job.b20200612.service.mapper
 * @classname
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class ProMapperTest {

    private static ProMapper mapper;

    @org.junit.BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(ProMapperTest.class.getClassLoader().getResourceAsStream(ConfigConsts.MB_CONFIG_WEB_SERVICE));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(ProMapper.class, builder.openSession(true));
    }

    @org.junit.Test
    public void testAddUser() throws FileNotFoundException {
        mapper.addUser("sjdlgk");
    }
}
