/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910253;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Kevin KDA on 2019/10/25 11:09
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.exercise201910253
 * @classname Server
 * @description TODO
 * @interface/enum
 */
public class Server {
    private static final int PORT = 9210;

    public static void main(String[] args) {
        new Server();
    }

    private Server() {
        try {
            ServerSocket ss = new ServerSocket(PORT);
            System.out.println("开始监听...");
            Socket s = ss.accept();
            InputStream is;
            is = s.getInputStream();

            while (true) {

                //缓存
                byte[] buffer = new byte[1024];
                //实际数据大小(字节数)
                int len = is.read(buffer);

                String msg = new String(buffer, 0, len);
                System.out.println("得到了客户端的消息：" + msg);

            }
//            s.close();
//            ss.close();
//            System.out.println("服务关闭...");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
