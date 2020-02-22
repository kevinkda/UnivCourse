/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200223.work2.servlet;

import com.kevin.job20200223.work2.manager.Manager;
import com.kevin.job20200223.work2.util.ToolUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/21 23:36
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.work1.servlet
 * @classname Reg0221Work1Servlet
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "Reg0221Work2Servlet", urlPatterns = "/Reg0221Work2Servlet")
public class Reg0221Work2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String[] params = ToolUtil.getParameter(req, new String[]{"userAcc", "userPass", "userQQ"});

        //进行用户名重复检查
        if (Manager.addUser(params) == 0) {
            //返回值等于0，用户注册成功，转向至登录页面
            out.println("账户注册成功");
            resp.sendRedirect("work/job20200223/login.jsp");
            //返回值等于0，用户注册成功，转向至登录成功页面
//            req.setAttribute("account", params[0]);
//            req.getRequestDispatcher("work/job20200223/success.jsp").forward(req, resp);
        } else {
            //返回值等于1，用户名已存在
            out.println("用户名已存在");
            resp.sendRedirect("work/job20200223/register.jsp");
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
