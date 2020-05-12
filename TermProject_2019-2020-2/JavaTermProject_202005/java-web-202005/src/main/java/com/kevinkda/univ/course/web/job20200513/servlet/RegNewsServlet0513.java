package com.kevinkda.univ.course.web.job20200513.servlet;

import com.kevinkda.univ.course.web.job20200513.domain.News;
import com.kevinkda.web.servlet.request.RequestService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/5/12 15:36
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "RegNewsServlet0513", urlPatterns = "/RegNewsServlet0513")
public class RegNewsServlet0513 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        RequestService service = new RequestService();
        Map<String, Object> reqBody = service.getRequestBody(request);

//        获得请求参数
        int newsId = Integer.parseInt((String) reqBody.get("newsId"));
        String newsTitle = (String) reqBody.get("newsTitle");

//        获得 application 对象
        ServletContext application = this.getServletContext();

        List<News> newsList = (List<News>) application.getAttribute("newsList");


//        检查是否是首次访问
        if (newsList == null) {
//            首次访问创建List实例对象
            newsList = new ArrayList<News>();
        }

//        向List添加新闻数据
        newsList.add(new News(newsId, newsTitle));
//        覆盖 application 中的newsList
        application.setAttribute("newsList", newsList);
        response.sendRedirect("case/job20200513/T1-show.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
