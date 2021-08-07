package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/2/21 12:50
 * @version 1.0
 * @project work3
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "TestAnnotationServlet", urlPatterns = "/TestAnnotationServlet",
        initParams = {
        @WebInitParam(name = "data", value = "config"),
        @WebInitParam(name = "server", value = "1.1.2.3")
})
public class TestAnnotationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = this.getServletConfig();
        String initParameter = config.getInitParameter("data");
        String initParameter2 = config.getInitParameter("server");
        response.getWriter().append(initParameter).append(initParameter2);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}