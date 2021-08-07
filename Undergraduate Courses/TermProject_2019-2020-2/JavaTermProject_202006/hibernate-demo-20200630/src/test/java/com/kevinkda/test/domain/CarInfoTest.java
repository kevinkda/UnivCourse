package com.kevinkda.test.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Kevin KDA on 2020/6/30 09:30
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.test.domain
 * @classname com.kevinkda.test.domain.CarInfo
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class CarInfoTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();//创建配置对象
        sessionFactory = configuration.buildSessionFactory();//创建会话工厂
        session = sessionFactory.openSession();//开启会话
        transaction = session.beginTransaction();//开启事务
    }

    @After
    public void destory() {
        transaction.commit();//事务提交
        session.close();//关闭会话
        sessionFactory.close();//关闭会话工厂
    }

    @Test
    public void testGoods() {
        //生成对象
        CarInfo carInfo = new CarInfo(100,"女朋友", 2333.33);
        //保存对象进数据库
        session.save(carInfo);
    }
}