package com.kevinkda.univ.course.web.job20200517.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/5/17 18:33
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebFilter(filterName = "AccessFilter0517", urlPatterns = "/case/job20200517/access/*")
public class AccessFilter0517 implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();
        String userAcc = (String) session.getAttribute("userAcc");
        if (userAcc == null) {
            response.sendRedirect("../T2.jsp");
            session.setAttribute("accessErr","您没有权限访问，请登录后操作");
        } else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        Map<String, String> userMap = new HashMap<>(2);
        userMap.put("admin", "1");
        userMap.put("user", "2");
        ServletContext context = config.getServletContext();
        context.setAttribute("userMap", userMap);
    }

}
