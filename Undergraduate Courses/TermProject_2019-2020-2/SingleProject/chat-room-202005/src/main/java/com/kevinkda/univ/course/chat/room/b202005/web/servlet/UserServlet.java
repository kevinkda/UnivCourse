package com.kevinkda.univ.course.chat.room.b202005.web.servlet;

import com.kevinkda.univ.course.chat.room.b202005.dao.UserDao;
import com.kevinkda.univ.course.chat.room.b202005.model.domain.User;
import com.kevinkda.univ.course.chat.room.b202005.service.ToolUtil;
import net.sf.json.JSONArray;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/27 17:05
 * @version 1.0.0
 * @project chat-room-202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

//        判断用户是否之前进行了注册登录
        if ("0".equals(request.getParameter("num"))) {
            out.print(UserDao.getIsLogin(request.getParameter("nickName"), getServletConfig().getServletContext()));
            //这里就是进行注册
        } else if ("1".equals(request.getParameter("num"))) {
            //这里是直接可以拿来注册登录了的
            response.sendRedirect(UserDao.login(request.getParameter("nickName"), Integer.parseInt(request.getParameter("sex")), request.getSession(), getServletConfig().getServletContext()));
        } else if ("2".equals(request.getParameter("num"))) {

            ServletContext application = getServletConfig().getServletContext();
            List<User> list = (List<User>) application.getAttribute("userLoginList");
            out.print(JSONArray.fromObject(list));
        } else if ("3".equals(request.getParameter("num"))) {

            out.print(JSONArray.fromObject(ToolUtil.msgList));

        } else if ("4".equals(request.getParameter("num"))) {

            User u = (User) request.getSession().getAttribute("user");
            String str = u.getNickName() + " - " + ToolUtil.getNowTime() + "<br/>" + request.getParameter("msg") + "<br/>";
            ToolUtil.msgList.add(str);
            out.print(1);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
