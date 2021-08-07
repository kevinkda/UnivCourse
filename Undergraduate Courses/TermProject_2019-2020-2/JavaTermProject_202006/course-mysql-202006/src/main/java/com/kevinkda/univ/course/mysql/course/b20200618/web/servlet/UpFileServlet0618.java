package com.kevinkda.univ.course.mysql.course.b20200618.web.servlet;

import com.jspsmart.upload.SmartFile;
import com.jspsmart.upload.SmartUpload;

import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;
import java.io.IOException;

/**
 * @author Kevin KDA on 2020/6/18 09:45
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@javax.servlet.annotation.WebServlet(name = "UpFileServlet0618", urlPatterns = "/UpFileServlet0618")
public class UpFileServlet0618 extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        SmartUpload smartUpload = new SmartUpload();
        JspFactory jspFactory = JspFactory.getDefaultFactory();
        PageContext pageContext = jspFactory.getPageContext(this, request, response, null);
        smartUpload.initialize(pageContext);
        try {
            smartUpload.upload();
            SmartFile file = smartUpload.getFiles().getFile(0);
            String filePath = "img\\";
            filePath += file.getFieldName();
            file.saveAs(filePath, SmartUpload.SAVE_VIRTUAL);
            String explain = smartUpload.getRequest().getParameter("explain");
            System.out.println("explain = " + explain);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
