package com.kevinkda.univ.course.framework.hibernate.b20200701.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Kevin KDA on 2020/7/1 22:40
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "BaseServlet", urlPatterns = "/BaseServlet")
public abstract class BaseServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public abstract void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String cmd = request.getParameter("cmd");
        if (null == cmd || "".equals(cmd.trim())) {
            cmd = "execute";
        }
        try {
            Method method = this.getClass().getMethod(cmd,
                    HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, request, response);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("没有此方法：" + e.getMessage(), e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("目标方法执行失败：" + e.getMessage(), e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("访问私有的方法：" + e.getMessage(), e);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
