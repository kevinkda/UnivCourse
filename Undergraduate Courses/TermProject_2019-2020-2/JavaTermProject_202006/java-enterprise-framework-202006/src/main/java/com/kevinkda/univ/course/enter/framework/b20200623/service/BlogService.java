package com.kevinkda.univ.course.enter.framework.b20200623.service;

import com.kevinkda.univ.course.enter.framework.b20200623.domain.Author;
import com.kevinkda.univ.course.enter.framework.b20200623.domain.Blog;
import com.kevinkda.univ.course.enter.framework.b20200623.domain.Comment;
import com.kevinkda.univ.course.enter.framework.b20200623.mapper.AuthorMapper;
import com.kevinkda.univ.course.enter.framework.b20200623.mapper.BlogMapper;
import com.kevinkda.univ.course.enter.framework.b20200623.mapper.CommentMapper;
import com.kevinkda.univ.course.enter.framework.service.JdbcService;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/6/21 17:13
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200623.service
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
            blogs = blogMapper.selectAll();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
            blogs = null;
        }
        return blogs;
    }

    public static Map<String, Object> getBlogItemById(int blogId) {
        SqlSession sqlSession = null;
        Map<String, Object> blogs = new HashMap<>();
        try {
            sqlSession = JdbcService.getSession();

            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            AuthorMapper authorMapper = sqlSession.getMapper(AuthorMapper.class);
            CommentMapper commentMapper = sqlSession.getMapper(CommentMapper.class);

            Blog blog = blogMapper.selectByPrimaryKey(blogId);
            System.out.println("blog = " + blog);
            Author author = authorMapper.selectByPrimaryKey(blog.getAuthorId());
            System.out.println("author = " + author);
            List<Comment> comment = commentMapper.selectByBlogId(blogId);
            System.out.println("comment = " + comment);

            blogs.put("blog", blog);
            blogs.put("author", author);
            blogs.put("comment",comment);

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
            count = blogMapper.insert(blog);
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
            count = blogMapper.updateByPrimaryKey(blog);
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
            count = blogMapper.deleteByPrimaryKey(blogId);
            sqlSession.commit();
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
