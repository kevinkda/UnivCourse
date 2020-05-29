package com.kevinkda.univ.course.chat.room.b202005.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/27 16:41
 * @version 1.0.0
 * @project chat-room-202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebFilter(filterName = "LoginFilter", urlPatterns = "/admin/*")
public class LoginFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request1 = (HttpServletRequest) req;
        HttpServletResponse response1 = (HttpServletResponse) resp;

        if (request1.getSession().getAttribute("user") == null) {
//            因为是目标地址是有admin的所以需要返回上一级别目录
            response1.sendRedirect("../login.jsp");
        } else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
