package com.kevinkda.univ.course.web.test20200526.web.servlet;

import com.kevinkda.univ.course.web.test20200526.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/26 10:12
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "UserNickCheckServlet0526", urlPatterns = "/UserNickCheckServlet0526")
public class UserNickCheckServlet0526 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        int flag = 0;
        String userNick = request.getParameter("userNick");
        if (userNick != null) {
            flag = UserDao.getIsLogin(userNick, request.getServletContext());
        }
        response.getWriter().append(String.valueOf(flag));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
