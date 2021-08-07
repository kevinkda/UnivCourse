/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.courseprojectb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;

public class UploadServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			//1.创建文件上传对象
			SmartUpload upload = new SmartUpload();
			//2.初始化
			upload.setCharset("utf-8");
//			upload.setAllowedFilesList("gif,jpg,png");
			upload.initialize(this.getServletConfig(), request, response);
			//3.上传
			upload.upload();
			//4.保存文件
			if(upload.getFiles().getCount()>0){
				for (int i = 0; i < upload.getFiles().getCount(); i++) {
					File file = upload.getFiles().getFile(i);
					if(file.getFileName().length()>0){
						String name = UUID.randomUUID().toString().replaceAll("-", "");
						String filename = file.getFileName();
						filename = filename.substring(filename.lastIndexOf("."));
						filename = name + filename;
						file.saveAs("upload\\"+filename, SmartUpload.SAVE_VIRTUAL);
					}
				}
				System.out.println("文件上传成功！");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
