package com.chinasoft.ssm.controller;

//import com.chinasoft.ssm.config.jdbcConfigProperties;
import com.chinasoft.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

//@RestController
@Controller
@RequestMapping("/")
public class UserController {
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
    public ModelAndView index(){
        Map<String,Object> map=new HashMap<String,Object>();
        //map.put("username","admin");
        map.put("list",userService.selectUserList());
        return new ModelAndView("index",map);
    }

//    @RequestMapping("/index1")
//    public String index1(){
//
//        return "redirect:/index";
//    }


}
