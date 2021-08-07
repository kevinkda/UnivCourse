package com.kevinkda.univ.course.web.test20200512;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/5/12 09:20
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "User0512Servlet", urlPatterns = "/User0512Servlet",
        initParams = {
                @WebInitParam(name = "userAcc", value = "456789"),
                @WebInitParam(name = "userPass", value = "dfghj"),
        }
)
public class User0512Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
//        获得 ServletConfig 对象
        ServletConfig config = this.getServletConfig();
//        取得初始化参数
        String userAcc = config.getInitParameter("userAcc");
        String userPass = config.getInitParameter("userPass");
        System.out.println("InitParameter - userAcc:" + userAcc);
        System.out.println("InitParameter - userPass:" + userPass);
//        获得 ServletContext 对象
        ServletContext context = this.getServletContext();
        String path = context.getInitParameter("path");
        System.out.println("ContextParam - path:" + path);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
