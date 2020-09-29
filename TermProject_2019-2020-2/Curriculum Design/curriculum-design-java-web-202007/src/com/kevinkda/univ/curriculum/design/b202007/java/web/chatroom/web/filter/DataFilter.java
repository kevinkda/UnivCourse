package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.web.filter;


import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant.ConstConfig;
import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.domain.User;
import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.service.WordAndTimeUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/28 17:17
 * @version 1.0.0
 * @project chatRoom-202005
 * @package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.web.filter
 * @classname DataFilter
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

        if (ConstConfig.FIELD_ACTION_TYPE_SEND_MESSAGE.equals(request.getParameter(ConstConfig.FIELD_REQUEST_OPERATION_TYPE))) {
            String msg = WordAndTimeUtil.rightWord(request);
            if (request.getSession().getAttribute(ConstConfig.FIELD_GET_CURRENT_USER_INFORMATION) != null) {
                User u = (User) request.getSession().getAttribute(ConstConfig.FIELD_GET_CURRENT_USER_INFORMATION);
                String str = u.getNickName() + " - " + WordAndTimeUtil.getNowTime() + "<br/>" +
                        request.getParameter(ConstConfig.FIELD_REQUEST_MESSAGE) + "<br/>";
                WordAndTimeUtil.msgList.add(str);
            } else {
                request.setAttribute(ConstConfig.FIELD_REQUEST_INFO, ConstConfig.FIELD_RESPONSE_SESSION_FAIL);
            }
        }

        chain.doFilter(req, resp);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
