/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.servlet;

import com.kevin.job20200225.dao.CartDao;
import com.kevin.job20200225.util.ToolUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/24 20:15
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.servlet
 * @classname CartItemDelete0225Servlet
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "CartItemDelete0225Servlet", urlPatterns = "/CartItemDelete0225Servlet")
public class CartItemDelete0225Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
//        String[] params = ToolUtil.getParameter(req, new String[]{"account", "deleteItem"});
        String[] params = ToolUtil.getParameter(req, new String[]{"account", "intSn"});
        HttpSession session = req.getSession();
        session.setAttribute("account", params[0]);
        CartDao.dropCartItems(params[1]);
//        CartDao.dropCartItems(params[0],params[1]);
        req.getRequestDispatcher("work/job20200225/cartItems.jsp").forward(req, resp);
//        resp.sendRedirect("work/job20200225/cartItems.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
