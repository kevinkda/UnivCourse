package com.kevinkda.univ.exam.enterpriseframeworkexam202009.controller;

import com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.TbProfileService;
import com.kevinkda.univ.exam.enterpriseframeworkexam202009.service.impl.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin KDA on 2020/9/23 14:54
 * @version 1.0.0
 * @project enterprise-framework-exam-202009
 * @package com.kevinkda.univ.exam.enterpriseframeworkexam202009.controller
 * @classname UserController
 * @apiNote <p></p>
 * @since 1.0.0
 */
@Controller
@RequestMapping({"/"})
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    TbProfileService profileService;


    @RequestMapping({"/userlist"})
    public ModelAndView getUserList() {
        Map<String, Object> map = new HashMap<>();
//        存入用户列表
        map.put("list", profileService.selectAll());
//        输入日志信息
        LOGGER.info(map.toString());
//        返回数据到页面
        return new ModelAndView("userList", map);
    }

    @RequestMapping({"/user"})
    public ModelAndView getUser(@RequestParam(name = "id") int id) {
        Map<String, Object> map = new HashMap<>();
//        存入用户信息
        map.put("user", profileService.selectByPrimaryKey(id));
//        输入日志信息
        LOGGER.info(map.toString());
//        返回数据到页面
        return new ModelAndView("userInfo", map);
    }

    @RequestMapping({"/update-before"})
    public ModelAndView getUserUpdate(@RequestParam(name = "id") int id) {
        Map<String, Object> map = new HashMap<>();
//        存入用户信息
        map.put("user", profileService.selectByPrimaryKey(id));
//        输入日志信息
        LOGGER.info(map.toString());
//        返回数据到页面
        return new ModelAndView("update", map);
    }

    @RequestMapping({"/update"})
    public String updateUser(HttpServletRequest request) {
        RequestService requestService = new RequestService();
        HashMap<String, Object> map = new HashMap<>();
//        获得所有Request请求体数据
        map.putAll(requestService.getRequestBody(request));
//        输入日志信息
        LOGGER.info("request---" + map.toString());
//        更新用户信息
        profileService.updateByPrimaryKeyMap(map);
//        重定向到用户列表页面
        return "redirect:/userlist";
    }


}
