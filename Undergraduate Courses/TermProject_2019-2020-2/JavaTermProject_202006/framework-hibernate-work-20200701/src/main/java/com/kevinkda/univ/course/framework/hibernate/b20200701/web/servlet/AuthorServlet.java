package com.kevinkda.univ.course.framework.hibernate.b20200701.web.servlet;

import com.kevinkda.univ.course.framework.hibernate.b20200701.dao.AuthorDao;
import com.kevinkda.univ.course.framework.hibernate.b20200701.domain.Author;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

/**
 * @author Kevin KDA on 2020/7/1 22:43
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "AuthorServlet", urlPatterns = "/AuthorServlet")
public class AuthorServlet extends BaseServlet {
    AuthorDao authorDao = new AuthorDao();

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
        List<Author> authorList = authorDao.queryAllAuthors();
        req.setAttribute("authorList", authorList);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    public void delAuthor(HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
        Integer authorId = Integer.valueOf(req.getParameter("authorId"));
        Author author = new Author();

        author.setAuthor_ID(authorId);

        authorDao.delAuthor(author);

        resp.sendRedirect(getServletContext().getContextPath() + "?time=" + (new Date().getTime()));
    }

    public void addAuthor(HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
        Integer authorId = Integer.valueOf(req.getParameter("authorId"));
        String authorName = req.getParameter("authorName");
        Integer authorAge = Integer.valueOf(req.getParameter("authorAge"));
        Author author = new Author();
        author.setAuthor_ID(authorId);
        author.setAuthor_Name(authorName);
        author.setAuthor_Age(authorAge);

        authorDao.addAuthor(author);

        resp.sendRedirect(getServletContext().getContextPath());
    }

    public void queryAuthor(HttpServletRequest req, HttpServletResponse resp)
            throws Exception {
        Integer authorId = Integer.valueOf(req.getParameter("authorId"));
        String authorName = req.getParameter("authorName");
        Integer authorAge = Integer.valueOf(req.getParameter("authorAge"));
        Author author = new Author();
        author.setAuthor_ID(authorId);
        author.setAuthor_Name(authorName);
        author.setAuthor_Age(authorAge);

        List<Author> qlist = authorDao.queryAuthors(author);
        req.getSession().setAttribute("qlist", qlist);
        PrintWriter out = resp.getWriter();
        out.print("1"); //坑:不能使用out.println("1")
    }
}
