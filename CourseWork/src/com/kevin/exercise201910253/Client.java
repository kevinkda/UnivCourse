/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910253;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/10/25 11:09
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.exercise201910253
 * @classname Client
 * @description TODO
 * @interface/enum
 */
public class Client {
    private static final int PORT = 9210;

    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        Scanner scaScan = new Scanner(System.in);
        try {
            InetAddress client = InetAddress.getByName("localhost");
            Socket s = new Socket(client, PORT);
            OutputStream os = s.getOutputStream();

            while (true) {
                System.out.print("请输入：");
                String msg = scaScan.next();

                os.write(msg.getBytes());
            }
//            s.close();
//            System.out.println("发送消息结束！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
