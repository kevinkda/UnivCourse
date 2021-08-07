package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Kevin KDA on 2020/9/17 15:34
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller
 * @classname IndexController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping({"/pageA"})
    public String pageA() {
        return "b0917B-inputScore";
    }

    @RequestMapping({"/pageB"})
    public String pageB() {
        return "b0917C-index";
    }
}
