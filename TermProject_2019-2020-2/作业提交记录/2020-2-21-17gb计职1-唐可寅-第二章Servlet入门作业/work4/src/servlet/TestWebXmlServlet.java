package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/21 12:54
 * @version 1.0
 * @project work3
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
public class TestWebXmlServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/**
 * 获取ServletConfig对象
 */
        ServletConfig config = this.getServletConfig();
        /**
         * 根据参数名获取参数值
         */
        String initParameter1 = config.getInitParameter("data");
        String initParameter2 = config.getInitParameter("server");
        PrintWriter writer = response.getWriter();
        writer.append(initParameter1).append(initParameter2);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
