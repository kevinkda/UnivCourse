package com.kevinkda.univ.course.chat.room.b202005.web.filter;

import com.kevinkda.univ.course.chat.room.b202005.model.domain.User;
import com.kevinkda.univ.course.chat.room.b202005.service.ToolUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/28 17:17
 * @version 1.0.0
 * @project chatRoom-202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebFilter(filterName = "DataFilter", urlPatterns = "/User/*")
public class DataFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        if ("4".equals(request.getParameter("num"))) {
            String msg = ToolUtil.rightWord(request);
            if (request.getSession().getAttribute("user") != null) {
                User u = (User) request.getSession().getAttribute("user");
                String str = u.getNickName() + " - " + ToolUtil.getNowTime() + "<br/>" + request.getParameter("msg") + "<br/>";
                ToolUtil.msgList.add(str);
            } else {
                request.setAttribute("info", "sessionFail");
            }
        }

        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
