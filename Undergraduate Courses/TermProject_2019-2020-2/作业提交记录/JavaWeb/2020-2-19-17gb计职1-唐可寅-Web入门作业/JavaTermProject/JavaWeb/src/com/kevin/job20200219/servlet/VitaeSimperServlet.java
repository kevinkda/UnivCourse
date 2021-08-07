package com.kevin.job20200219.servlet;

import com.kevin.job20200219.base.Vitae;
import com.kevin.job20200219.manager.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Kevin KDA on 2020/2/19 16:12
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200219.servlet
 * @classname VitaeSimperServlet
 * @description TODO 提供基于Servlet输出的个人简历
 * @interface/enum
 */
@WebServlet(name = "VitaeSimperServlet", urlPatterns = "/VitaeSimperServlet")
public class VitaeSimperServlet extends HttpServlet {
    public VitaeSimperServlet() {
        super();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Vitae vitae = Manager.getInformation();
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"zh\" dir=\"ltr\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>Kevin的简历</title>\n" +
                "\n" +
                "    <style type=\"text/css\">\n" +
                "        .page-wapper{\n" +
                "            width: 1024px;\n" +
                "            margin:0 auto;\n" +
                "            text-align: center;\n" +
                "            /*border:1px solid green;*/\n" +
                "        }\n" +
                "        .table-wapper{\n" +
                "            width: 400px;\n" +
                "            text-align: center;\n" +
                "            margin:0 auto;\n" +
                "        }\n" +
                "        td{\n" +
                "            width: 200px;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            position: fixed;\n" +
                "            left: 0px;\n" +
                "            bottom: 0px;\n" +
                "            width: 100%;\n" +
                "            height: 23px;\n" +
                "            background-color: #f9f9f9;\n" +
                "            z-index: 9999;\n" +
                "        }\n" +
                "    </style>\n" +
                "    <script type=\"text/javascript\">\n" +
                "        window.onload = function () {\n" +
                "            var height = document.body.offsetHeight;\n" +
                "            var ele = document.querySelector(\".content\");\n" +
                "            ele.style.height = (height - 140) + \"px\";\n" +
                "        }\n" +
                "    </script>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <div class=\"table-wapper\">\n" +
                "        <table>\n" +
                "            <thead>\n" +
                "            <th colspan=\"2\"><h1>个人简历</h1></th>\n" +
                "            </thead>\n" +
                "            <tr>\n" +
                "                <td>姓名</td>\n" +
                "                <td>");
        out.println(vitae.getStrName());
        out.println("</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>身高</td>\n" +
                "        <td>");
        out.println(vitae.getIntHeight());
        out.println("</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>体重</td>\n" +
                "        <td>");
        out.println(vitae.getDouWeight());

        out.println("</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>身份证</td>\n" +
                "        <td>");
        out.println(vitae.getStrId());

        out.println("</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>家庭住址</td>\n" +
                "        <td>");
        out.println(vitae.getStrHomeAdd());

        out.println("</td>\n" +
                "            </tr>\n" +
                "        </table>\n" +
                "    </div>\n" +
                "</div>\n" +
                "<footer class=\"footer\">\n" +
                "    <div class=\"sub-foot\">\n" +
                "        <div style=\"text-align: center;\">\n" +
                "            <span style=\"font-size: smaller; color: #525D76; \">\n" +
                "                <em>Copyright © 2020, Kevin KDA. AllRightsReserved.</em>\n" +
                "            </span>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</footer>\n" +
                "</body>\n" +
                "</html>\n");
    }
}