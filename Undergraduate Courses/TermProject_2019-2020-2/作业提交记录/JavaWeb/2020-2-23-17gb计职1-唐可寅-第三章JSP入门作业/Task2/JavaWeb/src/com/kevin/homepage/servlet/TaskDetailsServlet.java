/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homepage.servlet;

import com.kevin.homepage.entity.TaskDetails;
import com.kevin.homepage.manager.Manager;
import com.kevin.job20200223.work2.util.ToolUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/22 19:32
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.homepage.servlet
 * @classname TaskDetailsServlet
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "TaskDetailsServlet", urlPatterns = "/TaskDetailsServlet")
public class TaskDetailsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        String[] params = ToolUtil.getParameter(req, new String[]{"task"});
        TaskDetails task = Manager.getTaskDetailByTaskName(params[0]);
        printlnHtml(task, resp);
    }

    private void printlnHtml(TaskDetails task, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"zh\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>");
        out.println(task.getStrTaskName());

        out.println("</title>\n" +
                "    <link rel=\"stylesheet\" href=\"css/index.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"top-wapper\">\n" +
                "        <h1 id=\"top-word\">");
        out.println(task.getStrTaskName());

        out.println("</h1>\n" +
                "        <h5>\n" +
                "            作业提交命名：");
        out.println(task.getStrTaskSubmitName());

        out.println("</h5>\n" +
                "        <h5 class=\"project-date\">\n" +
                "            项目布置时间：");
        out.println(task.getStrLayoutTime());

        out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;项目提交时间：");
        out.println(task.getStrSubmissionDate());

        out.println("</h5>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"core-wapper\">\n" +
                "        <div class=\"word-wapper\">");
        out.println(task.getStrTaskDescription());

        out.println("</div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"bottom-wapper\">\n" +
                "        <hr>\n" +
                "        <p class=\"complete\">Modification Date: February 22, 2020</p>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "<script src=\"js/Copyright.js\"></script>\n" +
                "</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
