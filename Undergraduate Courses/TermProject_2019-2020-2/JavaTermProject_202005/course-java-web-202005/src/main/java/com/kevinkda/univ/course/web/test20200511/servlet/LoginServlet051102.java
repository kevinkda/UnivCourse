package com.kevinkda.univ.course.web.test20200511.servlet;

import com.kevinkda.univ.course.web.test20200511.servive.ToolUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/5/11 09:03
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "LoginServlet051102", urlPatterns = "/LoginServlet051102")
public class LoginServlet051102 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置请求字符编码
        request.setCharacterEncoding("UTF-8");
//        设置响应字符编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        //    获得用户输入的用户名
        String userAcc = request.getParameter("userAcc");
        System.out.println("post" + "=========" + userAcc);
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
            response.sendRedirect("case/20200511/T2-show.jsp");
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
                response.sendRedirect("case/20200511/T2-show.jsp");
            } else {
//                执行错误反馈
                response.sendRedirect("case/20200511/T2.jsp");
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //    获得用户输入的用户名
//        String userAcc = request.getParameter("userAcc");
//        System.out.println("Get" + "=========" + userAcc);
//        response.sendRedirect("T1-login.jsp");
        doPost(request, response);
    }
}
