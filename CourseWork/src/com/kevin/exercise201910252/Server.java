/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910252;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Kevin KDA on 2019/10/25 10:56
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.exercise201910252
 * @classname Server
 * @description TODO
 * @interface/enum
 */
public class Server {
    //指定侦听端口
    private static final int SERVER_PORT = 9001;

    public Server() {
        try {
            //创建服务器套接字
            ServerSocket ss = new ServerSocket(SERVER_PORT);
            System.out.println("服务端已启动，正在等待客户端...");
            //侦听来自客户端的请求
            Socket s = ss.accept();
            //获得输入流，用来接收数据
            InputStream in = s.getInputStream();
            //获得输出流，用来发送数据
            OutputStream out = s.getOutputStream();
            byte[] buf = new byte[1024];
            //从输入流中读取数据
            int len = in.read(buf);
            String strFromClient = new String(buf, 0, len);
            System.out.print("来自客户端的信息>>");
            System.out.println(strFromClient);
            String strToClient = "我也很好！";
            //往输出流中发送数据
            out.write(strToClient.getBytes());
            in.close();
            //关闭输入流和输出流
            out.close();
            s.close();
            //关闭通信套接字和服务器套接字
            ss.close();
            System.out.println("服务端已关闭。");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }


}
