package com.kevinkda.univ.course.web.job20200512.servlet;

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
 * @author Kevin KDA on 2020/5/12 13:12
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "LoginServlet051202", urlPatterns = "/LoginServlet051202")
public class LoginServlet051202 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置请求字符编码
        request.setCharacterEncoding("UTF-8");
//        设置响应字符编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        //    获得用户输入的用户名
        String userAcc = request.getParameter("userAcc");
//        获得application容器
        ServletContext application = this.getServletContext();
//        从容器中取得 用户列表
        List<String> userList = (List<String>) application.getAttribute("userList");
//        检查用户列表是否存在，如不存在即首次访问，创建用户列表
        if (userList == null) {
            userList = new ArrayList<String>();
//            直接添加账户
            userList.add(userAcc);
//            向application容器存入用户列表
            application.setAttribute("userList", userList);
            response.sendRedirect("case/job20200512/T2-show.jsp");
        } else {
//            账户检查标记 -1 用户名未被注册，1 用户名已被注册
            int flag = -1;
            for (String u :
                    userList) {
                if (u.equals(userAcc)) {
//                    账户存在，变更检查状态
                    flag = 1;
                    break;
                }
            }
//            执行注册
            if (flag == -1) {
//                执行注册
                userList.add(userAcc);
//                向application容器存入用户列表
                application.setAttribute("userList", userList);
                response.sendRedirect("case/job20200512/T2-show.jsp");
            } else {
//                执行错误反馈
                response.sendRedirect("case/job20200512/T2.jsp");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
