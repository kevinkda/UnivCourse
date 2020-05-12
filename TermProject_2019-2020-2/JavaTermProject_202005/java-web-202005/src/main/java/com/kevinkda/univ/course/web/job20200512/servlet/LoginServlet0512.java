package com.kevinkda.univ.course.web.job20200512.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/12 12:39
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200512.servlet
 * @classname LoginServlet0512
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "LoginServlet0512", urlPatterns = "/LoginServlet0512")
public class LoginServlet0512 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获得用户输入的用户名
        String userAcc = request.getParameter("userAcc");
//        取得Application对象
        ServletContext application = this.getServletContext();
//        获得HttpSession对象
        HttpSession session = request.getSession();


//        向session中设置用户名
        session.setAttribute("userAcc", userAcc);
//        向Application中设置用户名和SessionID
        application.setAttribute("userAcc", userAcc);
        application.setAttribute("uSessionID", session.getId());

//        重定向到登录页面
        response.sendRedirect("case/job20200512/T1-login.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
