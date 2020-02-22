/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200223.work2.servlet;

import com.kevin.job20200223.work2.manager.Manager;
import com.kevin.job20200223.work2.pojo.News;
import com.kevin.job20200223.work2.util.ToolUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/2/21 21:09
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.work1.servlet
 * @classname Login0221Work1Servlet
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "Login0221Work2Servlet", urlPatterns = "/Login0221Work2Servlet")
public class Login0221Work2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String[] params = ToolUtil.getParameter(request, new String[]{"account", "password"});
        HttpSession session = request.getSession();
        session.setAttribute("account", params[0]);

//        if ("admin".equals(params[0]) && "123456".equals(params[1])) {
        if (Manager.loginUser(params)) {
            //response.sendRedirect("success.jsp");
            // 重定向(客户端)是重新定位请求的路径，地址栏是一定会发生改变的，但是有个缺点:不能带参数
            List<News> list = new ArrayList<News>();
            for (int i = 0; i < 10; i++) {
                list.add(new News(i + 1, "kkk" + i, "昨天我看到小丽了，很激动" + i));
            }
            //request.setAttribute("account", params[0]);
            request.setAttribute("list", list);
            request.getRequestDispatcher("work/job20200223/success.jsp").forward(request, response);
        } else {
            response.sendRedirect("work/job20200223/error.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}