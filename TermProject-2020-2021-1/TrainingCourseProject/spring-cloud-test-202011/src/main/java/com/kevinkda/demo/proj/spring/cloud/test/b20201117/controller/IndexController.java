package com.kevinkda.demo.proj.spring.cloud.test.b20201117.controller;

import com.kevinkda.demo.proj.spring.cloud.test.b20201117.service.table.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin KDA on 2020/11/17 15:17
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.spring.cloud.test.b20201117.controller
 * @classname IndexController
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@RestController
@RequestMapping({"/"})
public class IndexController {
    @Autowired
    private UserService userService;

//    @RequestMapping({"id"})
//    public String queryUserByIdString(@PathVariable("id") int id) {
//        return userService.selectByPrimaryKey(id).toString();
//    }
//
//    @RequestMapping({"id"})
//    public User1 queryUserById(@PathVariable("id") int id) {
//        return userService.selectByPrimaryKey(id);
//    }
}
