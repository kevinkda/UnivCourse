/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson10;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static final int PORT = 9898;
	
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(PORT);
			System.out.println("开始监听...");
			Socket s = ss.accept();
			
			InputStream is = s.getInputStream();
			//缓存
			byte[] buffer = new byte[1024];
			//实际数据大小(字节数)
			int len = is.read(buffer);
			
			String msg = new String(buffer, 0, len);
			System.out.println("得到了客户端的消息："+msg);
			
			s.close();
			ss.close();
			
			System.out.println("服务关闭...");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}

}
