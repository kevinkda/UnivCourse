/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.courseprojectb.servlet;

import com.kevin.courseprojectb.dao.SingerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/12 11:36
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO ${description}
 * @interface/enum
 */
@WebServlet(name = "AreaListServlet", urlPatterns = "/AreaListServlet")
public class AreaListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = SingerDao.selectAllArea();
        request.getSession().setAttribute("areas", list);
        response.sendRedirect("singer.jsp");
    }
}
