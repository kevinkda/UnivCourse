/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200223.work2.servlet;

import com.kevin.job20200223.work2.entity.UserAcc;
import com.kevin.job20200223.work2.manager.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2020/2/22 01:30
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.work1.servlet
 * @classname UserListServlet
 * @description TODO
 * @interface/enum
 */
@WebServlet(name = "UserList0221Work2Servlet", urlPatterns = "/UserList0221Work2Servlet")
public class UserList0221Work2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<UserAcc> userAccs = Manager.getUserAll();
        printlnTop(resp);

        PrintWriter out = resp.getWriter();
        int count = 0;
        for (UserAcc userAcc :
                userAccs) {
            out.println("<tr>\n" +
                    "                    <td>" + (++count) + "</td>\n" +
                    "                    <td>" + userAcc.getStrUserAccount() + "</td>\n" +
                    "                    <td>" + userAcc.getStrUserPassword() + "</td>\n" +
                    "                    <td>" + userAcc.getStrUserQq() + "</td>\n" +
                    "                </tr>"
            );
        }

        printlnBottom(resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    private void printlnTop(HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"zh\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Project Directory</title>\n" +
                "    <link rel=\"stylesheet\" href=\"css/index.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"top-wapper\">\n" +
                "        <h1 id=\"top-word\">Project list of the second semester 2019-2020</h1>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"core-wapper\">\n" +
                "        <div class=\"table-wapper\">\n" +
                "            <table>\n" +
                "                <thead>\n" +
                "                <th>SN</th>\n" +
                "                <th>User Accout</th>\n" +
                "                <th>User Password</th>\n" +
                "                <th>QQ</th>\n" +
                "                </thead>");
    }

    private void printlnBottom(HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        out.println("</table>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <div class=\"bottom-wapper\">\n" +
                "        <hr>\n" +
                "        <p class=\"complete\">Completion Date: February 22, 2020</p>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "<script src=\"js/Copyright.js\"></script>\n" +
                "</html>");
    }
}
