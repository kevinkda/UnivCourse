package com.kevinkda.univ.course.web.test20200520.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/20 10:50
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "WordServlet0520", urlPatterns = "/WordServlet0520")
public class WordServlet0520 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("abc" + i);
        }
        System.out.println("list = " + list.size());
        String reqWord = request.getParameter("word");
        System.out.println("reqWord = " + reqWord);
        String info = " ";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(reqWord)) {
                info = info + list.get(i) + ",";
                System.out.println(info);
            }
        }
        System.out.println(info.length());
        info = info.substring(0, info.length() - 1);
        System.out.println(info);
//        response.getWriter().write(backInfo);
        response.getWriter().append(info);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
