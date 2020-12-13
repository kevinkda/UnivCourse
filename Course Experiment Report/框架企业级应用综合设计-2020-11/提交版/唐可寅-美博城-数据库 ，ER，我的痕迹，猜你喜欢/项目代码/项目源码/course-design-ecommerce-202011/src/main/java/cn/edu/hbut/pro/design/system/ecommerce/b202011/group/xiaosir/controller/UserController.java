package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.controller;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XiaoSir on 2020/11/26 20:21
 * @version 1.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.controller
 * @classname UserController
 * @description TODO
 * @interface/enum
 */
//@Controller
//@RequestMapping({"/"})
public class UserController extends BaseController {

    @Autowired
    private IUserService userService;

    //判断用户是否存在
    @PostMapping("selectUserIsExist")
    @ResponseBody
    public boolean selectUserIsExist(HttpServletRequest request){
        //System.out.println("map"+getParamData(request));
        return userService.selectUserIsExist(getParamData(request));
    }
    //执行注册的功能
    @PostMapping("insertUser")
    public String insertUser(HttpServletRequest request){
        //Map<String,Object> map=getParamData(request);
        return userService.insertUser(getParamData(request),request);
    }

    //执行登录的功能
    @PostMapping("userLogin")
    public String userLogin(HttpServletRequest request, HttpSession session){
        //System.out.println("userLogin");
        Map<String,Object> mapall=getParamData(request);
        return userService.userLogin(mapall,session,request);
    }

    //根据login方法跳转到登录页面因为登录页面要提示登录失败的错误信息所以这个时候必须得动态的ftl
    @GetMapping("login")
    public String login(HttpServletRequest request) {
        //login.ftl
        return "pages/login";
    }

    //跳转到peoplecenter页面个人中心需要加载动态数据，所以个人中心也得必须改成ftl动态模板格式
    @GetMapping("peoplecenter")
    public String peoplecenter(HttpServletRequest request){

        return "pages/peoplecenter";
    }

    //个人登录后就直接进入到主页面了，等下将个人中心的跳转转过来
    @GetMapping("main")
    public ModelAndView main(HttpServletRequest request){
        List<Map<String, Object>> list = userService.queryProductList(getParamData(request));
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("list",list);
        m.put("count",list.size());//传递集合的长度过来
        return new ModelAndView("pages/main", m);
    }

    @GetMapping("myShopCart")
    public String myShopCart(HttpServletRequest request){
        //这个位置得变，如果是没有登录，那么回到登录页面否则的话是跳转到我的购物车页面

        return userService.selectUserShopCartList(request);
    }
}
