package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/7/7 19:33
 * @version 1.0.0
 * @project curriculum-design-spring-boot-202007
 * @package com.kevinkda.univ.curriculum.design.b202007.spring.boot.train.number.manager.web.servlet
 * @classname TrainInfoServlet
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "TrainInfoServlet", urlPatterns = "/TrainInfoServlet")
public class TrainInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
