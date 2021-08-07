/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.courseprojectb.servlet;

import com.kevin.courseprojectb.dao.SongDao;
import com.kevin.courseprojectb.entity.Song;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2019/12/13 11:02
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO ${description}
 * @interface/enum
 */
@WebServlet(name = "SongListPageServlet", urlPatterns = "/SongListPageServlet")
public class SongListPageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //每页数量
        int num = 4;
        //当前页码
        int index = 1;
        //总记录数
        int maxNum = SongDao.selectCount();
        //最大页码
        int max = maxNum / num + (maxNum % num == 0 ? 0 : 1);

        List<Song> list = new ArrayList<Song>();
        if (request.getParameter("index") != null) {
            index = Integer.parseInt(request.getParameter("index"));
        }
        list = SongDao.selectPage(index, num);
        request.setAttribute("index", index);
        request.setAttribute("max", max);
        request.setAttribute("songList", list);
        request.getRequestDispatcher("songpage.jsp").forward(request, response);
    }
}