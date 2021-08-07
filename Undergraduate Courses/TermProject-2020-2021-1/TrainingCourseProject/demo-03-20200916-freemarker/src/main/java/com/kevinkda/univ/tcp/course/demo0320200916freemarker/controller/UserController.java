package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller;

import com.kevinkda.univ.tcp.course.demo0320200916freemarker.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/9/16 14:43
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.univ.tcp.course.demo0320200916freemarker.controller
 * @classname IndexController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/"})
public class UserController {
    @Autowired
    private UserService userService;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


    @RequestMapping({"index"})
    public String index() {
        return "index";
    }

    @RequestMapping({"userList"})
    public String userList(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("list", userService.selectAll().toString());
        return "userList";
    }

    //    @GetMapping({"userListB"})
//    @PostMapping({"userListB"})
    @RequestMapping({"userListB"})
//    @RequestMapping(value = {"userListB"}, method = RequestMethod.POST)
    public ModelAndView userListB() {
        Map<String, Object> map = new HashMap<>();
        map.put("list", userService.selectAll());
        LOGGER.info(map.toString());
        return new ModelAndView("userListB", map);
    }
}
