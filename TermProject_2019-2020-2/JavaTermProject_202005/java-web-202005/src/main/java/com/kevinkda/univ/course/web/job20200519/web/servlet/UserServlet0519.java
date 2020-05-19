package com.kevinkda.univ.course.web.job20200519.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/19 19:36
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "UserServlet0519", urlPatterns = "/UserServlet0519")
public class UserServlet0519 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

//        获得用户提交的用户
        String userAcc = request.getParameter("userAcc");
//        得到application对象
        ServletContext application = this.getServletContext();
        List<String> list = (List<String>) application.getAttribute("userList");

//         账户已登录检查标识
        boolean flag = false;
        if (list == null) {
//            那么创建容器
            list = new ArrayList<String>();
        } else {
            for (String i :
                    list) {
                if (i.equals(userAcc)) {
                    flag = true;
                    response.sendRedirect("case/job20200519/T1-login.jsp");
                    break;
                }
            }
        }
        if (!flag) {
            list.add(userAcc);
            application.setAttribute("userList", list);
        }

        request.getSession().setAttribute("loginAcc", userAcc);
        response.sendRedirect("case/job20200519/T1.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
