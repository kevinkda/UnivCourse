/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homeproject.servlet;

import com.kevin.homeproject.dao.ShoppingCartDao;
import com.kevin.homeproject.entity.ShoppingCart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/5 23:50
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "ShoppingCartServlet", urlPatterns = "/ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        List<ShoppingCart> list = ShoppingCartDao.selectAll();
        request.setAttribute("shoppingcart", list);
        request.getRequestDispatcher("ShopCart.jsp").forward(request, response);

    }
}