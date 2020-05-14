package com.kevinkda.univ.course.web.test20200514.servlet;

import com.kevinkda.univ.course.web.test20200514.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/14 09:41
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "StudentServlet0514", urlPatterns = "/StudentServlet0514")
public class StudentServlet0514 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(11 + i, "admin" + i, (i % 2)));
        }
        request.setAttribute("list", list);
        request.getRequestDispatcher("case/20200514/T1-show.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
