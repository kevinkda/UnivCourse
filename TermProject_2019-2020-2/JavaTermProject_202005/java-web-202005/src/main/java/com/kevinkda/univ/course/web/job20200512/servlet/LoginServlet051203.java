package com.kevinkda.univ.course.web.job20200512.servlet;

import com.kevinkda.univ.course.web.job20200512.domain.Account;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/12 12:39
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200512.servlet
 * @classname LoginServlet0512
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "LoginServlet051203", urlPatterns = "/LoginServlet051203")
public class LoginServlet051203 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获得用户输入的用户名
        String userAcc = request.getParameter("userAcc");
//        取得Application对象
        ServletContext application = this.getServletContext();
//        获得HttpSession对象
        HttpSession session = request.getSession();

//        从容器中取得 用户列表
        List<Account> userList = (List<Account>) application.getAttribute("userList");

//        检查用户列表是否存在，如不存在即首次访问，创建用户列表
        if (userList == null) {
            userList = new ArrayList<Account>();
//            直接添加账户账户实例
            userList.add(new Account(userAcc, session.getId()));
        } else {
//            非首次访问，执行登录检查
            for (Account acc :
                    userList) {
                if (userAcc.equals(acc.getUserAcc())) {
                    acc.setSessionId(session.getId());
                    break;
                }
            }
        }

//        向session中设置用户名
        session.setAttribute("userAcc", userAcc);
//        向application容器存入用户列表
        application.setAttribute("userList", userList);
//        重定向到登录页面
        response.sendRedirect("case/job20200512/T1-login.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        doPost(request, response);
    }
}
