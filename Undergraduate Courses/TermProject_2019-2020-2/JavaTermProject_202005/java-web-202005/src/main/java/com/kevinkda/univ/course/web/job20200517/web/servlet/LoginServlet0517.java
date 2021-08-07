package com.kevinkda.univ.course.web.job20200517.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/5/17 18:44
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "LoginServlet0517", urlPatterns = "/LoginServlet0517")
public class LoginServlet0517 extends HttpServlet {
    static final String USER_ACC_FIELD = "userAcc";
    static final String USER_PASS_FIELD = "userPass";
    static final String ADMIN = "admin";
    static final String USER = "user";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

//        获得用户列表
        Map<String, String> userMap = (Map<String, String>) request.getServletContext().getAttribute("userMap");

//        获得用户提交的用户名
        String userAcc = request.getParameter(USER_ACC_FIELD);
//        获得用户提交的密码
        String userPass = request.getParameter(USER_PASS_FIELD);

//        获得系统中保存的密码
        String sysUserPass = userMap.get(userAcc);

//        进行用户提交的用户名和密码核验
        if (userPass.equals(sysUserPass)) {
//            密码核验通过，向Session中存入userAcc
            request.getSession().setAttribute("userAcc", userAcc);
//            重定向至列表页
            response.sendRedirect("case/job20200517/access/T2-List.jsp");
        } else {
            request.getSession().setAttribute("accessErr", "用户名或密码错误");
            response.sendRedirect("case/job20200517/T2.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
