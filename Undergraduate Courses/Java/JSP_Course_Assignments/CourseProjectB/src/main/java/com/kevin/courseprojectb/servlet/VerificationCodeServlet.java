/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.courseprojectb.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author Kevin KDA on 2019/12/19 8:56
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package ${PACKAGE_NAME}
 * @classname ${NAME}
 * @description TODO ${description}
 * @interface/enum
 */
@WebServlet(name = "VerificationCodeServlet", urlPatterns = "/VerificationCodeServlet")
public class VerificationCodeServlet extends HttpServlet {
    private static int FontSize = 14;
    private static final String FontStyle = "微软雅黑";
    private static int Width = 80;
    private static int Height = 30;
    private Random random = new Random();
    private String str = "0123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //1. 创建图片对象
        BufferedImage bufferedImage = new BufferedImage(Width, Height, BufferedImage.TYPE_INT_RGB);
        //2. 创建画笔
        Graphics graphics = bufferedImage.getGraphics();
        Graphics2D graphics2D1 = (Graphics2D) bufferedImage.getGraphics();
        Graphics2D graphics2D = bufferedImage.createGraphics();
        //3. 随机生成验证码
        String code = randCode(4);
        //4. 绘制验证码
        graphics2D.fillRect(0, 0, Width, Height);
        for (int i = 0; i < code.length(); i++) {
            graphics2D.setColor(randColor());
            graphics2D.setFont(new Font(FontStyle, Font.BOLD, FontSize + random.nextInt(4)));
            graphics2D.drawString(code.charAt(i) + "",
                    10 + (FontSize * i),
                    ((Height + FontSize) / 2) + random.nextInt(5));
        }
        //5. 绘制干扰线
        for (int i = 0; i < 2; i++) {
            graphics2D.setColor(randColor());
            graphics2D.setStroke(new BasicStroke(3));
            graphics2D.drawLine(random.nextInt(Width / 2), random.nextInt(Height),
                    random.nextInt(Width), random.nextInt(Height));
        }
        //6. 发送图片
        ServletOutputStream servletOutputStream = response.getOutputStream();
        ImageIO.write(bufferedImage, "png", servletOutputStream);
        servletOutputStream.flush();
        servletOutputStream.close();
//        7.传递code
        request.setAttribute("code", code);
    }


    /**
     * @param * @param
     * @return java.awt.Color
     * @throws
     * @author Kevin KDA on 2019/12/19 9:27
     * @description VerificationCodeServlet / randColor TODO 随机颜色
     */
    private Color randColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    /**
     * @param * @param len
     * @return java.lang.String
     * @throws
     * @author Kevin KDA on 2019/12/19 9:28
     * @description VerificationCodeServlet / randCode TODO 随机字符
     */
    private String randCode(int len) {
        //改变图片宽度
        Width = 10 + len * FontSize;
        String s = "";
        for (int i = 0; i < len; i++) {
            s += str.charAt(random.nextInt(str.length()));
        }
        return s;
    }
}
