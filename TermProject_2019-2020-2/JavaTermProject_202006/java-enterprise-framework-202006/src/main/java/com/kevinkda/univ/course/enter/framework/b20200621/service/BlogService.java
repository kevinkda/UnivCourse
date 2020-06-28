package com.kevinkda.univ.course.enter.framework.b20200621.service;

import com.kevinkda.univ.course.enter.framework.b20200621.domain.Blog;
import com.kevinkda.univ.course.enter.framework.b20200621.mapper.BlogMapper;
import com.kevinkda.univ.course.enter.framework.service.JdbcService;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2020/6/21 17:13
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200621.service
 * @classname BlogService
 * @apiNote <p></p>
 * @since 2020.06.21
 */
public class BlogService {
    public static List<Blog> getBlogList() {
        SqlSession sqlSession = null;
        List<Blog> blogs;
        try {
            sqlSession = JdbcService.getSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            blogs = blogMapper.queryBlog();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
            blogs = null;
        }
        return blogs;
    }

    public static Blog getBlogItemById(int blogId) {
        SqlSession sqlSession = null;
        Blog blogs;
        try {
            sqlSession = JdbcService.getSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            blogs = blogMapper.queryBlogById(blogId);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
            blogs = null;
        }
        return blogs;
    }

    public static int insertBlog(Blog blog) {
        SqlSession sqlSession = null;
        int count = 0;
        try {
            sqlSession = JdbcService.getSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            count = blogMapper.insertBlog(blog);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int updateBlog(Blog blog) {
        SqlSession sqlSession = null;
        int count = 0;
        try {
            sqlSession = JdbcService.getSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            count = blogMapper.updateBlog(blog);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int deleteBlog(int blogId) {
        SqlSession sqlSession = null;
        int count = 0;
        try {
            sqlSession = JdbcService.getSession();
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            count = blogMapper.deleteBlog(blogId);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
