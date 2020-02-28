/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.servlet;

import com.kevin.job20200225.util.ToolUtil;
import com.kevin.job20200225.util.UserManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/25 14:27
 * @version 1.0
 * @project JavaTermProject
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "Login0225Servlet", urlPatterns = "/Login0225Servlet")
public class Login0225Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String[] params = ToolUtil.getParameter(request, new String[]{"account", "password"});
        HttpSession session = request.getSession();
        session.setAttribute("account", params[0]);

        if (UserManager.loginUser(params)) {
//            request.getRequestDispatcher("work/job20200225/cartItems.jsp").forward(request, response);
            response.sendRedirect("work/job20200225/cartItems.jsp");
        } else {
            response.sendRedirect("work/job20200225/error.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}