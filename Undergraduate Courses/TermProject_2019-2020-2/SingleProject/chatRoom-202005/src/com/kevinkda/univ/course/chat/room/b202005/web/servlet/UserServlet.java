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
import javax.servlet.http.HttpSession;
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
@WebServlet(name = "UserServlet", urlPatterns = "/User/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        Object o = null;

//        判断用户是否之前进行了注册登录
        if ("0".equals(request.getParameter("num"))) {
//            这里就是进行注册
            o = UserDao.getIsLogin(request.getParameter("nickName"), getServletConfig().getServletContext());
        } else if ("1".equals(request.getParameter("num"))) {
//            注册登录
            response.sendRedirect(UserDao.login(request.getParameter("nickName"), Integer.parseInt(request.getParameter("sex")), request.getSession(), getServletConfig().getServletContext()));
        } else if ("2".equals(request.getParameter("num"))) {
            List<User> list = (List<User>) request.getServletContext().getAttribute("userLoginList");
            o = JSONArray.fromObject(list);
        } else if ("3".equals(request.getParameter("num"))) {
            o = JSONArray.fromObject(ToolUtil.msgList);
        } else if ("4".equals(request.getParameter("num"))) {
//            User u = (User) request.getSession().getAttribute("user");
//            String str = u.getNickName() + " - " + ToolUtil.getNowTime() + "<br/>" + request.getParameter("msg") + "<br/>";
//            ToolUtil.msgList.add(str);
//            o = 1;
            if (request.getAttribute("info") != null) {
                request.getSession().setAttribute("msg", "登录超时3分钟");
                // response.sendRedirect("../login.jsp");
                o = 0;
            } else {
                o = 1;
            }
//            if (request.getSession().getAttribute("user") == null) {
//                User delect = (User) request.getSession().getAttribute("delectUser");
//                List<User> list = (List<User>) request.getServletContext().getAttribute("userLoginList");
//                for (User u :
//                        list) {
//                    if (u.getNickName().equals(delect.getNickName())) {
//                        list.remove(u);
//                        request.getServletContext().setAttribute("userLoginList", list);
//                    }
//                }
//                request.getSession().setAttribute("msg", "超过三分钟没有聊天，自动退出");
//                //response.sendRedirect("../login.jsp");
//                o = 0;
//            } else {
//                o = 1;
//            }
        } else if ("5".equals(request.getParameter("num"))) {
            HttpSession session = request.getSession();
            if (session.getAttribute("user") == null) {
                response.sendRedirect("../login.jsp");
//                 !=null的情况证明所属的session仍然有效期
            } else {
//                手动从application里面给移除
                ServletContext application = getServletConfig().getServletContext();
                User u = (User) session.getAttribute("user");
//                登陆的人员的集合
                List<User> list = (List<User>) application.getAttribute("userLoginList");
                for (int i = 0; i < list.size(); i++) {
                    User u1 = list.get(i);
                    if (u1.getNickName().equals(u.getNickName())) {
                        list.remove(i);
                        break;
                    }
                }
                // 在放进去
                application.setAttribute("userLoginList", list);
                response.sendRedirect("../login.jsp");
            }
//            在线人数减1
            int userCount = (int) request.getServletContext().getAttribute("userCount");
            request.getServletContext().setAttribute("userCount", userCount - 1);

        }

        response.getWriter().print(o);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
