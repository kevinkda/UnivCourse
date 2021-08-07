package com.kevinkda.univ.course.web.test20200519.servlet;

import com.kevinkda.univ.course.web.test20200519.dao.IUserDao;
import com.kevinkda.univ.course.web.test20200519.dao.impl.UserDapImpl;
import com.kevinkda.univ.course.web.test20200519.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/19 09:08
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "TestServlet0519", urlPatterns = "/TestServlet0519")
public class TestServlet0519 extends HttpServlet {
    private static final IUserDao USER_DAO = new UserDapImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<User> list = USER_DAO.selectUserList();
        System.out.println(list.toString());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
