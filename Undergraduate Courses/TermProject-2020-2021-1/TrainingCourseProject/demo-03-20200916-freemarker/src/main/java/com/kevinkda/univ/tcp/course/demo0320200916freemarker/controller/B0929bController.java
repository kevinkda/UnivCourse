package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller;

import com.kevinkda.web.servlet.request.RequestService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Kevin KDA on 2020/9/29 15:12
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller
 * @classname B0929Controller
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/b0929B"})
public class B0929bController {
    private static final Logger LOGGER = LoggerFactory.getLogger(B0929bController.class);

    @RequestMapping({"/index"})
    public ModelAndView index() {
        Map<String, Object> map = new HashMap<>();
        return new ModelAndView("/b0929/b0929-index", map);
    }

    @RequestMapping({"/upfile"})
    public ModelAndView upFile() {
        Map<String, Object> map = new HashMap<>();
        return new ModelAndView("/b0929/b0929-upfileB", map);
    }

    @RequestMapping({"/receivefile"})
    public String receiveFile(@RequestParam("headPhoto") MultipartFile file,
                              HttpServletRequest request) {
//        Map<String, Object> map = new HashMap<>();
        LOGGER.info(file.toString());
        RequestService requestService = new RequestService();
        Map<String, Object> map = requestService.getRequestBody(request);
        LOGGER.info(map.toString());

        try {
            file(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/index";
    }

    private String file(MultipartFile file) throws IOException {

        String filename = file.getOriginalFilename();
        System.out.println(filename);
        String suffixName = filename.substring(filename.lastIndexOf("."));
        String newFilename = File.separator + "img" + File.separator +
                UUID.randomUUID().toString() + suffixName;
        String filePath = ClassUtils.getDefaultClassLoader().getResource("static").getPath() + newFilename;
//        String filePath = "D:" + File.separator + newFilename;
        FileOutputStream out = new FileOutputStream(filePath);
        //文件输入流
        InputStream in = file.getInputStream();
        IOUtils.copy(in, out);
        in.close();
        out.close();

        return "redirect:/index";
    }

}
