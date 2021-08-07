package com.kevinkda.univ.course.web.test20200511.servlet;

import com.kevinkda.univ.course.web.test20200511.servive.ToolUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/11 09:03
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "LoginServlet0511", urlPatterns = "/LoginServlet0511")
public class LoginServlet0511 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获得用户输入的用户名
        String userAcc = request.getParameter("userAcc");
        System.out.println("post" + "=========" + userAcc);
        HttpSession session = request.getSession();
        session.setAttribute("userAcc", userAcc);
        ToolUtil.sessionId = session.getId();
        response.sendRedirect("case/20200511/T1-login.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //    获得用户输入的用户名
//        String userAcc = request.getParameter("userAcc");
//        System.out.println("Get" + "=========" + userAcc);
//        response.sendRedirect("T1-login.jsp");
        doPost(request, response);
    }
}
