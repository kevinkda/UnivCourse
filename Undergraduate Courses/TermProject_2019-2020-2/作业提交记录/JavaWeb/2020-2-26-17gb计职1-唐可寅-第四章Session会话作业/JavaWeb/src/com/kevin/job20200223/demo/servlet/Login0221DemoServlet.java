package com.kevin.job20200223.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/2/21 20:47
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.demo.servlet
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "Login0221DemoServlet", urlPatterns = "/Login0221DemoServlet")
public class Login0221DemoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}