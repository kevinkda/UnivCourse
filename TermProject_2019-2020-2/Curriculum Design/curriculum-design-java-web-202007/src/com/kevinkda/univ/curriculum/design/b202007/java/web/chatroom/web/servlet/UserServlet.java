package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.web.servlet;

import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant.ConstConfig;
import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.dao.UserDao;
import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.domain.User;
import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.service.WordAndTimeUtil;
import net.sf.json.JSONArray;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/27 17:05
 * @version 1.0.0
 * @project chat-room-202005
 * @package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.web.servlet
 * @classname UserServlet
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
        switch (request.getParameter(ConstConfig.FIELD_REQUEST_OPERATION_TYPE)) {
            case ConstConfig.FIELD_ACTION_TYPE_USER_LOGIN:
//            这里就是进行注册
                o = UserDao.getIsLogin(request.getParameter(ConstConfig.FIELD_REQUEST_USER_NICK), getServletConfig().getServletContext());
                break;
            case ConstConfig.FIELD_ACTION_TYPE_USER_REGISTER:
//            注册登录
                response.sendRedirect(
                        UserDao.login(
                                request.getParameter(ConstConfig.FIELD_REQUEST_USER_NICK),
                                Integer.parseInt(request.getParameter(ConstConfig.FIELD_REQUEST_USER_SEX)),
                                request.getSession(),
                                getServletConfig().getServletContext()
                        )
                );
                break;
            case ConstConfig.FIELD_ACTION_TYPE_GET_A_LIST_OF_ONLINE_USERS:
                List<User> listA = (List<User>) request.getServletContext().getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST);
                o = JSONArray.fromObject(listA);
                break;
            case ConstConfig.FIELD_ACTION_TYPE_GET_MESSAGE_LIST:
                o = JSONArray.fromObject(WordAndTimeUtil.msgList);
                break;
            case ConstConfig.FIELD_ACTION_TYPE_SEND_MESSAGE:
//            User u = (User) request.getSession().getAttribute("user");
//            String str = u.getNickName() + " - " + ToolUtil.getNowTime() + "<br/>" + request.getParameter("msg") + "<br/>";
//            ToolUtil.msgList.add(str);
//            o = 1;
                if (request.getAttribute(ConstConfig.FIELD_REQUEST_INFO) != null) {
                    request.getSession().setAttribute(ConstConfig.FIELD_REQUEST_MESSAGE, ConstConfig.FIELD_RESPONSE_LOGIN_TIMEOUT);
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
                break;
            case ConstConfig.FIELD_ACTION_TYPE_LOGIN_TIMEOUT_VERIFICATION:
                HttpSession session = request.getSession();
                if (session.getAttribute(ConstConfig.FIELD_GET_CURRENT_USER_INFORMATION) == null) {
                    response.sendRedirect(ConstConfig.FIELD_RESPONSE_NON_PERMISSION_ACCESS_JUMP_PATH);
//                 !=null的情况证明所属的session仍然有效期
                } else {
//                手动从application里面给移除
                    ServletContext application = getServletConfig().getServletContext();
                    User u = (User) session.getAttribute(ConstConfig.FIELD_GET_CURRENT_USER_INFORMATION);
//                登陆的人员的集合
                    List<User> listB = (List<User>) application.getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST);
                    for (int i = 0; i < listB.size(); i++) {
                        User u1 = listB.get(i);
                        if (u1.getNickName().equals(u.getNickName())) {
                            listB.remove(i);
                            break;
                        }
                    }
                    // 在放进去
                    application.setAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST, listB);
                    response.sendRedirect(ConstConfig.FIELD_RESPONSE_NON_PERMISSION_ACCESS_JUMP_PATH);
                }
//            在线人数减1
                int userCount = (int) request.getServletContext().getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_COUNT);
                request.getServletContext().setAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_COUNT, userCount - 1);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + request.getParameter(ConstConfig.FIELD_REQUEST_OPERATION_TYPE));
        }

        response.getWriter().print(o);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
