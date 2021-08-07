package com.kevinkda.univ.course.enter.framework.b20200624.servlet;

import com.kevinkda.univ.course.enter.framework.b20200624.constant.ConfigConsts;
import com.kevinkda.univ.course.enter.framework.b20200624.domain.Blog;
import com.kevinkda.univ.course.enter.framework.b20200624.service.BlogService;
import com.kevinkda.web.servlet.request.RequestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/6/21 17:59
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package com.kevinkda.univ.course.enter.framework.b20200624.web.servlet
 * @classname BlogServlet0624
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "BlogServlet0624", urlPatterns = "/BlogServlet0624")
public class BlogServlet0624 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        RequestService reqService = new RequestService();
//        获得请求体数据
        Map<String, Object> reqBody = reqService.getRequestBody(request);
        System.out.println("reqBody = " + reqBody);
        switch ((String) reqBody.get(ConfigConsts.OPERATE_TYPE)) {
            case ConfigConsts.QUERY_ALL_FROM_BLOG:
                request.getSession().setAttribute("blogList", BlogService.getBlogList());
//                request.getRequestDispatcher("case/queryAll.jsp").forward(request, response);
                response.sendRedirect("case/b0624/queryAll.jsp");
                break;
            case ConfigConsts.QUERY_ITEM_FROM_BLOG:
                request.getSession().setAttribute("blogItem",
                        BlogService.getBlogItemById(Integer.parseInt(reqBody.get("blogId").toString()))
                );
                response.sendRedirect("case/b0624/queryItem.jsp");
                break;
            case ConfigConsts.INSERT_ITEM_FROM_BLOG:
                BlogService.insertBlog(new Blog(
                        (String) reqBody.get("blogTitle"),
                        Integer.parseInt(reqBody.get("blogCount").toString())
                ));
                request.getSession().setAttribute("blogList", BlogService.getBlogList());
                response.sendRedirect("case/b0624/queryAll.jsp");
                break;
            case ConfigConsts.UPDATE_ITEM_AFTER_FROM_BLOG:
                Blog blog = new Blog(
                        Integer.parseInt(reqBody.get("blogId").toString()),
                        (String) reqBody.get("blogTitle"),
                        Integer.parseInt(reqBody.get("blogCount").toString())
                );
                System.out.println("blog = " + blog);
                BlogService.updateBlog(blog);
                request.getSession().setAttribute("blogList", BlogService.getBlogList());
                response.sendRedirect("case/b0624/queryAll.jsp");
                break;
            case ConfigConsts.UPDATE_ITEM_BEFORE_FROM_BLOG:
                request.getSession().setAttribute("blogItem",
                        BlogService.getBlogItemById(Integer.parseInt(reqBody.get("blogId").toString()))
                );
                response.sendRedirect("case/b0624/update.jsp");
                break;
            case ConfigConsts.DELETE_ITEM_FROM_BLOG:
                int blogId = Integer.parseInt(reqBody.get("blogId").toString());
                BlogService.deleteBlog(blogId);
                request.getSession().setAttribute("blogList", BlogService.getBlogList());
                response.sendRedirect("case/b0624/queryAll.jsp");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + reqBody.get(ConfigConsts.OPERATE_TYPE));
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
