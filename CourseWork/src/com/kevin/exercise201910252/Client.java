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
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Kevin KDA on 2019/10/25 10:58
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.exercise201910252
 * @classname Client
 * @description TODO
 * @interface/enum
 */
public class Client {
    //服务器的侦听端口
    private static final int SERVER_PORT = 9001;

    public Client() {
        try {
            //由于服务端也是运行在本机，所以创建本机的InetAddress对象
            InetAddress address = InetAddress.getByName("localhost");
            //向服务器侦听端口发出请求
            Socket s = new Socket(address, SERVER_PORT);
            System.out.println("客户端已启动。");
            //获得输入流，用来接收数据
            InputStream in = s.getInputStream();
            //获得输出流，用来发送数据
            OutputStream out = s.getOutputStream();
            String strToServer = "你好！";
            //往输出流中发送数据
            out.write(strToServer.getBytes());
            byte[] buf = new byte[1024];
            //从输入流中读取数据
            int len = in.read(buf);
            String strFromServer = new String(buf, 0, len);
            System.out.print("来自服务端的回答>>");
            System.out.println(strFromServer);
            in.close();
            //关闭输入流和输出流
            out.close();
            //关闭通信套接字
            s.close();
            System.out.println("客户端已关闭。");
        } catch (UnknownHostException nhe) {
            System.out.println("未找到指定主机...");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client();
    }
}
