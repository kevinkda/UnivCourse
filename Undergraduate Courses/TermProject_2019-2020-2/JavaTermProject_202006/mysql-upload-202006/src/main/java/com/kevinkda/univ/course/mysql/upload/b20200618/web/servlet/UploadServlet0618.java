package com.kevinkda.univ.course.mysql.upload.b20200618.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.*;
import java.util.List;
import java.util.UUID;

/**
 * @author Kevin KDA on 2020/6/19 20:24
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "UploadServlet0618", urlPatterns = "/UploadServlet0618")
public class UploadServlet0618 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

//        创建DiskFileItemFactory工厂对象
        DiskFileItemFactory factory = new DiskFileItemFactory();
//        设置文件缓存目录，如果该文件夹不存在则创建一个
        File f = new File("S:\\TempFolder");
        if (!f.exists()) {
            f.mkdirs();
        }
        factory.setRepository(f);
//        创建ServletFileUpload对象
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
//        设置字符编码
        fileUpload.setHeaderEncoding("utf-8");
//        解析request，将form表单的各个字段封装为FileItem对象
        List<FileItem> fileItems = null;
        try {
            fileItems = fileUpload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

//        返回值存储域
        StringBuilder backStr = new StringBuilder();

//        遍历List集合
        for (FileItem fileItem : fileItems) {
//            判断是否为普通字段
            if (fileItem.isFormField()) {
//                获取字段名称
                String name = fileItem.getFieldName();
                if ("name".equals(name)) {
//                    如果字段值不为空
                    if (!"".equals(fileItem.getString())) {
                        String value = fileItem.getString("utf-8");
                        backStr.append("上传者: ").append(value).append("<br />");
                    }
                }
            } else {
//                获取上传的文件名
                String filename = fileItem.getName();
//                处理上传文件
                if (filename != null && filename != "") {
                    backStr.append("上传的文件名称是: ").append(filename).append("<br />");
//                    保持文件名唯一
                    filename = UUID.randomUUID().toString() + "_" + filename;
//                    用户上传的文件的存储路径
                    String webpath = File.separator + "upload" + File.separator;
//                    创建文件路径
                    String filepath = getServletContext().getRealPath(webpath + filename);
//                    创建File对象
                    File file = new File(filepath);
//                    创建文件夹
                    file.getParentFile().mkdirs();
//                    创建文件
                    file.createNewFile();
//                    获取上传文件流
                    InputStream in = fileItem.getInputStream();
//                    使用 FileOutputStream打开服务器端的上传文件
                    FileOutputStream out = new FileOutputStream(file);
//                    流的对拷
//                    每次读取一个字节
                    byte[] bytes = new byte[1024];
                    int len;
//                    开始读取上传文件的字节，并将其输出到服务器端的上传文件输出流中
                    while ((len = in.read(bytes)) > 0) {
                        out.write(bytes, 0, len);
                    }
                    in.close();
                    out.close();
                    fileItem.delete();
                    backStr.append("文件上传成功！<br />");
                }
            }
        }
        response.getWriter().append(backStr);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
