package com.kevinkda.univ.course.web.job20200521.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Kevin KDA on 2020/5/21 17:05
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "WordServlet0521", urlPatterns = "/WordServlet0521")
public class WordServlet0521 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

//        获得随机数域
        Random random = new Random();
//        声明随机字符域
        String byteA = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
//        字符组序列化
        byte[] bytes = byteA.getBytes();

//        获得批量字符串存储域
        List<String> list = new ArrayList<String>();
//        批量存入字符串
        for (int i = 0; i < 10; i++) {
            list.add("abc" + i);
//            获得随机首字母批量字符串
            list.add(String.valueOf(bytes[random.nextInt(26)]) + "ghskg" + i);
        }

//        获得用户请求数据
        String reqWord = request.getParameter("word");
//        得到用户请求数据首字母
        String tempReqWord = reqWord.substring(0, 1);
//        初始化请求返回域变量
        String info = "";

//        循环遍历批量数据
        for (int i = 0; i < list.size(); i++) {
//            取得批量数据首字母
            String tempWord = list.get(i).substring(0, 1);
//            核验批量数据和用户请求首字母
            if (tempWord.contains(tempReqWord)) {
//                如果相等返回该项批量数据
                info += list.get(i) + ",";
            }
        }

//        去除上步操作拼接得到的字符串末尾逗号 ,
        info = info.substring(0, info.length() - 1);

//        返回请求数据
        response.getWriter().append(info);
//        response.getWriter().write(info);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
