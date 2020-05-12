package com.kevinkda.univ.course.web.job20200512.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/12 13:12
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "ExitServlet0512", urlPatterns = "/ExitServlet0512")
public class ExitServlet0512 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置请求字符编码
        request.setCharacterEncoding("UTF-8");
//        设置响应字符编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        //    获得用户输入的用户名
        String userAcc = request.getParameter("userAccExit");
//        获得application容器
        ServletContext application = this.getServletContext();
//        从容器中取得 用户列表
        List<String> userList = (List<String>) application.getAttribute("userList");

//        检查用户列表是否存在
        if (userList == null) {
//            不存在执行错误跳转
            response.sendRedirect("case/job20200512/T2.jsp");
        } else {
//            存在执行用户退出
            for (String u :
                    userList) {
                if (u.equals(userAcc)) {
//                    账户存在，执行退出
                    userList.remove(u);
                    break;
                }
            }
//            重新向application存入userList
            application.setAttribute("userList", userList);
            response.sendRedirect("case/job20200512/T2-show.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
