/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.courseprojectb.servlet;

import com.kevin.courseprojectb.dao.SingerDao;
import com.kevin.courseprojectb.entity.Singer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/12 11:39
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO ${description}
 * @interface/enum
 */
@WebServlet(name = "SingerByAreaServlet", urlPatterns = "/SingerByAreaServlet")
public class SingerByAreaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        if (request.getParameter("area") != null) {
            String area = request.getParameter("area");
            List<Singer> list = SingerDao.selectByArea(area);
            String strSinger = "";
            for (Singer singer : list) {
                strSinger += singer.getSingerName() + "<br />";
            }
            response.getWriter().write(strSinger);
        } else {
            response.getWriter().write("请选择区域");
        }
    }
}
