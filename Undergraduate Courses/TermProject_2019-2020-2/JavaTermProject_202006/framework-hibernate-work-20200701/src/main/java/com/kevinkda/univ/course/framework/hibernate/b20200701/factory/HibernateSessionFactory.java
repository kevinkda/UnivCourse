package com.kevinkda.univ.course.framework.hibernate.b20200701.factory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Kevin KDA on 2020/7/1 22:46
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.framework.hibernate.b20200701.factory
 * @classname HibernateSessionFactory
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class HibernateSessionFactory {
    private static final String CONFIG_FILE = "src/main/resources/hibernate.cfg.xml";
    private static final Configuration CONFIG = new Configuration();
    private static SessionFactory sessionFactory = null;

    private static final ThreadLocal<Session> THREAD_LOCAL = new ThreadLocal<Session>();

    static {
        try {
            CONFIG.configure(CONFIG_FILE);
            sessionFactory = CONFIG.buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static Session getSession() throws HibernateException {
        Session session = THREAD_LOCAL.get();
        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                rebuildSessionFactory();
            }
            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
            THREAD_LOCAL.set(session);
        }
        return session;
    }

    private static void rebuildSessionFactory() {
        try {
            CONFIG.configure(CONFIG_FILE);
            sessionFactory = CONFIG.buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    //关闭与数据库的会话
    public static void closeSession() throws HibernateException {
        Session session = THREAD_LOCAL.get();
        THREAD_LOCAL.set(null);
        if (session != null) {
            session.close();
        }
    }
}
