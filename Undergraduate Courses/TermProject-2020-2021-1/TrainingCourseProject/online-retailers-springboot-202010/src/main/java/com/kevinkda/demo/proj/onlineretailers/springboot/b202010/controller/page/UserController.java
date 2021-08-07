package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.controller.page;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Kevin KDA on 2020/10/8 16:52
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.onlineretailers.springboot.b202010.controller.page
 * @classname UserController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/"})
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @PostMapping("selectUserIsExist")
    @ResponseBody
    public boolean selectUserIsExist(HttpServletRequest request){
        return userService.selectUserIsExist(getParamData(request));
    }
    @PostMapping("insertUser")
    public String insertUser(){
        System.out.println("----------hello----------");
        return null;
    }

}
