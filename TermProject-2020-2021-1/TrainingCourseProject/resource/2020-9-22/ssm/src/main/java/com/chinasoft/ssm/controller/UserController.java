package com.chinasoft.ssm.controller;

//import com.chinasoft.ssm.config.jdbcConfigProperties;
import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

//@RestController
@Controller
@RequestMapping("/")
public class UserController extends  BaseController {
    @Autowired
    private IUserService userService;

//    @RequestMapping("/index")
//    public String index(HttpServletRequest request, HttpSession session){
//        request.setAttribute("username","admin");
//        session.setAttribute("password","123456");
//        return "index";
//    }

    //@RequestMapping("/index") //默认请求是GET请求
   // @RequestMapping(value="index", method= RequestMethod.GET)
    @GetMapping("index")
    //@PostMapping
   // public ModelAndView index(@RequestParam("score") String[] score){
    public ModelAndView index(){

        Map<String,Object> map=new HashMap<String,Object>();
        //map.put("username","admin");
        map.put("list",userService.selectUserList());
       // map.put("score",score);
        return new ModelAndView("index",map);
    }
    //通过input方法进入到对应的输入分数的页面
    @GetMapping("input")
    public String input(){
        return "inputScore";
    }


    @GetMapping("del")//2,3,
    public String del(@RequestParam("ids") String ids){
        userService.deleteUserByIds(getDelData(ids));
        return "redirect:/index";
    }

    @GetMapping("addUser")//2,3,
    public String addUser(){
//只是跳转到addUser页面
        return "addUser";
    }

    @PostMapping("addUser")//2,3,
    public String addUser1(HttpServletRequest request){
       // Map<String,Object> map=getParamData(request);
        userService.insertUser(getParamData(request));
        return "redirect:/index";
    }



//    @RequestMapping("/index1")
//    public String index1(){
//
//        return "redirect:/index";
//    }


}
