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
 * @author Kevin KDA on 2020/5/12 12:30
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200512.servlet
 * @classname DoServlet0512
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "DoServlet0512", urlPatterns = "/DoServlet0512")
public class DoServlet0512 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获得Application对象
        ServletContext application = this.getServletContext();
//        获得HttpSession对象
        HttpSession session = request.getSession();
//        用户当前访问得到的SessionID
        String sessionA = session.getId();
//        用户前次访问的SessionID
        String sessionB = (String) application.getAttribute("uSessionID");

//        比较两次取得的SessionID
        if (sessionA.equals(sessionB)) {
//            对比结果一致执行成功跳转
            response.sendRedirect("case/job20200512/T1-suc.jsp");
        } else {
//            对比结果不一致执行失败跳转
            response.sendRedirect("case/job20200512/T1.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
