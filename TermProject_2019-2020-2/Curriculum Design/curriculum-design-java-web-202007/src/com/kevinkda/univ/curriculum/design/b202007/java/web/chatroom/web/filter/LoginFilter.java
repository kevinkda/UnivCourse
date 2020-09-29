package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.web.filter;

import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant.ConstConfig;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/27 16:41
 * @version 1.0.0
 * @project chat-room-202005
 * @package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.web.filter
 * @classname LoginFilter
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
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        if (request.getSession().getAttribute(ConstConfig.FIELD_GET_CURRENT_USER_INFORMATION) == null) {
            request.getSession().setAttribute(ConstConfig.FIELD_REQUEST_MESSAGE, ConstConfig.FIELD_RESPONSE_BLOCK_ACCESS_TO_ECHO_MESSAGES);
//            因为是目标地址是有admin的所以需要返回上一级别目录
            response.sendRedirect(ConstConfig.FIELD_RESPONSE_NON_PERMISSION_ACCESS_JUMP_PATH);
        } else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
//        初始化在线人数统计
        int userCount = 0;
//        向全局存入
        config.getServletContext().setAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_COUNT, userCount);
    }

}
