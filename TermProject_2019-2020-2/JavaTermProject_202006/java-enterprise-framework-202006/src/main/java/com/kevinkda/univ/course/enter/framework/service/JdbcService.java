package com.kevinkda.univ.course.enter.framework.service;

import com.kevinkda.univ.course.enter.framework.constant.ConfigConsts;
import com.kevinkda.util.db.mybatis.MyBatisImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

/**
 * @author Kevin KDA on 2020/6/21 16:18
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.service
 * @classname JdbcService
 * @apiNote <p></p>
 * @since 2020.06.21
 */
public class JdbcService {
    private final static SqlSessionFactory SQL_SESSION_FACTORY;

    static {
        SqlSessionFactory sqlSessionFactory1;
        try {
            sqlSessionFactory1 = MyBatisImpl.getSqlSessionFactory(ConfigConsts.MB_CONFIG_WEB_SERVICE);
        } catch (IOException e) {
            e.printStackTrace();
            sqlSessionFactory1 = null;
        }
        SQL_SESSION_FACTORY = sqlSessionFactory1;
    }

    public static SqlSession getSession() throws IOException {
        return SQL_SESSION_FACTORY.openSession();
    }
}
