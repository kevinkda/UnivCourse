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
 * @author Kevin KDA on 2019/12/5 23:11
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "SingerListServlet", urlPatterns = "/SingerListServlet")
public class SingerListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Singer> list = SingerDao.selectAll();
        request.getSession().setAttribute("singerList", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}