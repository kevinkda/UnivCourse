package com.kevinkda.univ.course.chat.room.b202005.web.listener; /**
 * @author Kevin KDA on 2020/5/28 17:14
 * @version 1.0.0
 * @project chatRoom-202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */

import com.kevinkda.univ.course.chat.room.b202005.model.domain.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.List;

@WebListener()
public class UserListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public UserListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
        System.out.println("Create");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
        System.out.println("Destroyed");
//        se.getSession().setAttribute("delectUser", se.getSession().getAttribute("user"));
//        se.getSession().removeAttribute("user");

        HttpSession session = se.getSession();
        ServletContext application = session.getServletContext();
        User u = (User) session.getAttribute("user");
//        session.invalidate()强制性让session销毁
        System.out.println("销毁" + u.getNickName());
//        登陆的人员的集合
        List<User> list = (List<User>) application.getAttribute("userLoginList");
        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            if (u1.getNickName().equals(u.getNickName())) {
                list.remove(i);
                break;
            }
        }

        se.getSession().setAttribute("info", u);
        //在放进去
        application.setAttribute("userLoginList", list);
//        在线人数减1
        int userCount = (int) application.getAttribute("userCount");
        application.setAttribute("userCount", userCount - 1);
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
        System.out.println("add");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attribute
         is replaced in a session.
      */
    }
}
