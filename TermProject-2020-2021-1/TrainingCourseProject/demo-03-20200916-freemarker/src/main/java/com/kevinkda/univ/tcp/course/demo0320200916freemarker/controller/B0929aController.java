package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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
@RequestMapping({"/b0929"})
public class B0929aController {
    private static final Logger LOGGER = LoggerFactory.getLogger(B0929aController.class);

    @RequestMapping({"/index"})
    public ModelAndView index() {
        Map<String, Object> map = new HashMap<>();
        return new ModelAndView("/b0929/b0929-index", map);
    }

    @RequestMapping({"/upfile"})
    public ModelAndView upFile() {
        Map<String, Object> map = new HashMap<>();
        return new ModelAndView("/b0929/b0929-upfile", map);
    }

    @RequestMapping({"/receivefile"})
    public String receiveFile(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        return "redirect:/index";
    }

}
