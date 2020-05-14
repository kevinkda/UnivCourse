package com.kevinkda.univ.course.web.test20200513.servlet;

import com.kevinkda.univ.course.web.test20200513.domain.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/13 08:55
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "StudentServlet0513", urlPatterns = "/StudentServlet0513")
public class StudentServlet0513 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

//        设置实例化对象
        request.setAttribute("stu",
                new Student(921, "Kevin")
        );
//        设置数组实例化对象
        request.setAttribute("stus",
                new Student[]{
                        new Student(920, "Kevin"),
                        new Student(921, "Karry")
                }
        );

//        转发
        request.getRequestDispatcher("case/20200513/T1.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
