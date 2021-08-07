package com.kevinkda.univ.course.enter.framework.b20200627.web.servlet;

import com.kevinkda.univ.course.enter.framework.b20200624.constant.ConfigConsts;
import com.kevinkda.univ.course.enter.framework.b20200627.mapper.AuthorMapper;
import com.kevinkda.univ.course.enter.framework.b20200627.service.AuthorService;
import com.kevinkda.univ.course.enter.framework.service.JdbcService;
import com.kevinkda.web.servlet.request.RequestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/6/27 22:53
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "AuthorServlet0627", urlPatterns = "/AuthorServlet0627")
public class AuthorServlet0627 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        RequestService reqService = new RequestService();
//        获得请求体数据
        Map<String, Object> reqBody = reqService.getRequestBody(request);
        System.out.println("reqBody = " + reqBody);

        AuthorService authorService = new AuthorService();
        authorService.setAuthorMapper(JdbcService.getSession().getMapper(AuthorMapper.class));

        switch ((String) reqBody.get(ConfigConsts.OPERATE_TYPE)) {
            case ConfigConsts.QUERY_ALL_FROM_AUTHOR:
                request.getSession().setAttribute("authorList", authorService.selectAll());
                response.sendRedirect("case/b0627/queryAll.jsp");
                break;
            case ConfigConsts.INSERT_ITEM_FROM_AUTHOR:
                authorService.insert(reqBody);
                request.getSession().setAttribute("authorList", authorService.selectAll());
                response.sendRedirect("case/b0627/queryAll.jsp");
                break;
            case ConfigConsts.UPDATE_ITEM_AFTER_FROM_BLOG:
                authorService.updateByPrimaryKeySelectiveOfMap(reqBody);
                request.getSession().setAttribute("authorList", authorService.selectAll());
                response.sendRedirect("case/b0627/queryAll.jsp");
                break;
            case ConfigConsts.DELETE_ITEM_FROM_BLOG:
                int authorId = Integer.parseInt(reqBody.get("authorId").toString());
                authorService.deleteByPrimaryKey(authorId);
                request.getSession().setAttribute("authorList", authorService.selectAll());
                response.sendRedirect("case/b0627/queryAll.jsp");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + (String) reqBody.get(ConfigConsts.OPERATE_TYPE));
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
