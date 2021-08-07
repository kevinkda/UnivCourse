package com.kevinkda.univ.course.web.job20200517.web.filter;

import com.kevinkda.web.support.EncodingRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/15 09:33
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebFilter(filterName = "EncodingsFilter", urlPatterns = "/*")
public class EncodingsFilter implements Filter {
    private static final String GET = "GET";
    private static final String POST = "POST";
    int count = 0;

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        获得子接口的实例化对象
        HttpServletRequest request = (HttpServletRequest) req;

//        设置响应字符编码集为UTF-8
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        count++;
//        将 COUNT 计数放入 Application 对象，实现全局保存
        ServletContext application = ((HttpServletRequest) req).getSession().getServletContext();
        application.setAttribute("count", count);

//        进行请求方法判断
        if (GET.equals(request.getMethod())) {
//            GET请求进行 request 对象的替换
            EncodingRequest ecReq = new EncodingRequest(request);
//            传递过滤链，本次放行
            chain.doFilter(ecReq, resp);
        } else if (POST.equals(request.getMethod())) {
//            Post请求，执行编码类型转换
            req.setCharacterEncoding("UTF-8");
//            传递过滤链，本次放行
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
