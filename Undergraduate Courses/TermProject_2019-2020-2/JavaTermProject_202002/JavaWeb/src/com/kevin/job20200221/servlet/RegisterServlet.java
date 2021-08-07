/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200221.servlet;

import com.kevin.job20200221.entity.util.ToolUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/20 16:14
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200221.servlet
 * @classname RegisterServlet
 * @description TODO9
 * @interface/enum
 */
@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String[] s = ToolUtil.getParameter(request, new String[]{"account", "password", "select"});

//        for (String i :
//                s) {
//            System.out.println(i);
//            out.println(i);
//        }
        System.out.println(s[0]);
        out.println(s[0]);
        System.out.println(s[1]);
        out.println(s[1]);
//        System.out.println(s[2]);
//        out.println(s[2]);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    public void init() {
        System.out.println("初始化后的Servlet");
    }
}