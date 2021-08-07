package com.kevinkda.univ.course.mysql.upload.b20200618.web.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

/**
 * @author Kevin KDA on 2020/6/19 16:48
 * @version 1.0.0
 * @project JavaTermProject_202006
 * @package ${PACKAGE_NAME}
 * @classname ${CLASS_NAME}
 * @apiNote <p></p>
 * @since 1.0.0
 */
@WebServlet(name = "UpFileServlet0618", urlPatterns = "/UpFileServlet0618")
public class UpFileServlet0618 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = null;
        String realPath = null;
        String str = null;
        if (request.getParameter("status") == null) {
            String path = this.getServletContext().getRealPath("/") + "upload";
            // http://localhost:8080/jspPicture/upload/a.jpg
            System.out.println(path);
            List<FileItem> items;
            try {
                boolean isMultipart = ServletFileUpload.isMultipartContent(request);
                if (isMultipart) {
                    System.out.println(request.getParameter("name"));
                    FileItemFactory factory = new DiskFileItemFactory();
                    ServletFileUpload upload = new ServletFileUpload(factory);
                    items = upload.parseRequest(request);
                    // 迭代
                    for (FileItem item : items) {
                        System.out.println(item.isFormField());
                        if (item.isFormField()) {
                            String fieldName = item.getFieldName();
                            if ("name".equals(fieldName)) {
                                // 得到普通表单的值
                                name = item.getString();
                            }
                        } else {
                            // 得到上传文件的内容
                            // File fullFile=new File(item.getName());//这是源文件名字
                            // 文件名字
                            str = UUID.randomUUID().toString() + "." + item.getName().split("\\.")[1];
                            File saveFile = new File(path, str);
                            item.write(saveFile);

                            // 最后还有一步将我的name以及地址的值丢到我的数据库里插入，这样我就能通过地址找到我的图片的地址了

                            out.close();
                        }
                        System.out.println(name);
                        System.out.println(item.getName());
                        System.out.println(path);
                        // 用的是字符串的拼接
                        System.out.println(path + File.separator + str + "." + item.getName().split("\\.")[1]);
                        // insert(id,name,Path+"\\"+str+"."+item.getName().split("\\.")[1]);

                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
