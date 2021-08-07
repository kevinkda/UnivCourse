package com.kevinkda.univ.course.framework.hibernate.b20200701.dao;

import com.kevinkda.univ.course.framework.hibernate.b20200701.domain.Author;
import com.kevinkda.univ.course.framework.hibernate.b20200701.factory.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * @author Kevin KDA on 2020/7/1 22:45
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.framework.hibernate.b20200701.dao
 * @classname AuthorDao
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class AuthorDao {
    public List<Author> queryAllAuthors() {
//        List<TbAuthor> list=session.createQuery("from TbAuthor").list();
        List<Author> list = HibernateSessionFactory.getSession().createQuery("from Author").list();
//        Session s = HibernateSessionFactory.getSession();
////        Query query = s.createQuery("from 0622_tb_author");
//        Query query = s.createQuery("from Author");
//        List<Author> list = query.list();
        return list;
    }

    public void delAuthor(Author author) {
        Session s = HibernateSessionFactory.getSession();
        try {
            Transaction tran = s.beginTransaction();
            System.out.println("author:" + author);
            s.delete(author);
            tran.commit();
        } catch (HibernateException e) {
            //tran.rollback();//可以不写，内部会进行回滚
            System.out.println("抓到异常...");
        }

    }

    public void addAuthor(Author author) {
        Session s = HibernateSessionFactory.getSession();
        Transaction tran = s.beginTransaction();
        try {
            System.out.println(author.getAuthor_Name());
            s.saveOrUpdate(author);
            tran.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public List<Author> queryAuthors(Author author) {
        System.out.println(author);
        boolean f1 = false, f2 = false, f3 = false;
        Session s = HibernateSessionFactory.getSession();
        String hql = "from Author s where 1=1";

        if (author.getAuthor_ID() != null && author.getAuthor_ID() > 0) {
            hql = hql + " and s.author_ID=:author_ID";
            f1 = true;
        }
        if (author.getAuthor_Name() != null && author.getAuthor_Name().trim().length() > 0) {
            hql = hql + " and s.author_Name like :author_Name";
            f2 = true;
        }
        if (author.getAuthor_Age() != null && author.getAuthor_Age() > 0) {
            hql = hql + " and s.author_Age=:author_Age";
            f3 = true;
        }

        Query query = s.createQuery(hql);
        if (f1) {
            query.setParameter("authorId", author.getAuthor_ID());
        }
        if (f2) {
            query.setParameter("authorName", "%" + author.getAuthor_Name().trim() + "%");
        }
        if (f3) {
            query.setParameter("authorAge", author.getAuthor_Age());
        }
        return query.list();
    }
}
