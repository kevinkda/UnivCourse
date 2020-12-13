package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service.impl;

import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.mapper.UserMapper;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service.IUserService;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.tool.IPUtil;
import cn.edu.hbut.pro.design.system.ecommerce.b202011.tool.MD5Tool;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XiaoSir on 2020/11/26 20:29
 * @version 1.0
 * @project course-design-ecommerce-202011
 * @package cn.edu.hbut.pro.design.system.ecommerce.b202011.group.xiaosir.service.impl
 * @classname UserServiceImpl
 * @description TODO
 * @interface/enum
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean selectUserIsExist(Map<String, Object> map) {
        if (userMapper.queryUserIsExist(map) == null) {
            return false;
        } else {
            return true;
        }

    }


    @Override
    public String insertUser(Map<String, Object> map, HttpServletRequest request) {
        //还需要组装其他的参数
        //{userPassword=123, userEmail=123444@qq.com}
        map.put("userPassword", MD5Tool.string2MD5(map.get("userPassword").toString()));//将密码加密后在放入map里面
        map.put("userRegTime", new Timestamp(System.currentTimeMillis()));
        map.put("userLastTime", new Timestamp(System.currentTimeMillis()));
        map.put("userLastLoginIp", IPUtil.getIP(request));
        map.put("userStatus", 1);
        map.put("userSessionId", request.getSession().getId());
        map.put("userLoginCount", 0);//默认登录次数是0
        int count = userMapper.insertUser(map);
        if (count == 1) {
            request.getSession().setAttribute("msg", "注册成功");
            return "redirect:/login";
        } else {
            request.getSession().setAttribute("msg", "注册失败");
            return "redirect:/webPage/register.html";
        }

    }

    @Override
    public String userLogin(Map<String, Object> map, HttpSession session, HttpServletRequest request) {
        // Map<String,Object> dataMap=userMapper.userLogin(map);
        if (userMapper.userLogin(map) == null) {
            //证明我输入的账号都查询不出数据来，账号是有问题的
            session.setAttribute("msg", "账号不存在!");
            return "redirect:/login";//重定向login的方法到login.ftl
        } else {
            //证明我的账号是存在的
            Map<String, Object> dataMap = userMapper.userLogin(map);//从数据库查询出来这个对象
            // String userId=dataMap.get("userId").toString();//取得从数据库查出的该账号的ID
            if (dataMap.get("userStatus").toString().equals("0")) {
                //如果登录的时候此时的账号的状态是0那么证明该账号之前登录失败的次数已经达到了3次
                //此时需要判断该账号的最后的登录失败的时间往后延长1分钟和当前时间做比较，
                //如果时间已经超过了1分钟，那么重新开启该账号，新一轮的登录开始
                //如果时间还没到1分钟，那么用户登录的操作是无效的，并且还是保持原来的状态继续锁住
                Object time1 = dataMap.get("userLastTime");
                Timestamp t1 = (Timestamp) time1;
                //  System.out.println("t1"+t1);
                Timestamp t2 = new Timestamp(System.currentTimeMillis());
                //  System.out.println("t2"+t2);
                long a1 = t1.getTime();
                long a2 = t2.getTime();
                System.out.println("a1" + a1);
                System.out.println("a2" + a2);
                int hours = (int) ((a1 - a2) / (1000 * 60 * 60));
                int minutes = (int) (((a1 - a2) / 1000 - hours * (60 * 60)) / 60);
                int m = Math.abs(minutes);
                if (m >= 2) {
                    //那么证明这个时候时间已经达到了锁定的时间了，
                    //这个时候解锁该用户
                    dataMap.put("userStatus", 1);
                    userMapper.updateUser(dataMap);//解开账号
                } else {
                    session.setAttribute("msg", "该账号还在锁定阶段时间为2分钟！");
                    return "redirect:/login";//重定向login的方法到login.ftl
                }

            }
            if (!dataMap.get("userPassword").toString().equals(MD5Tool.string2MD5(map.get("userPassword").toString()))) {
                // session.setAttribute("msg","密码不对!");
                //当密码不对的时候该用户的账号就需要在登录的次数那个位置+1
                //而且判断的逻辑应该是这样的，首先判断它的次数是不是已经达到了3次，如果是3次那么就需要锁住该账号
                //如果没有到3次那么在会在原来的基础上加1
                //1取到这个账号的登录的次数是多少
                int count = Integer.parseInt(dataMap.get("userLoginCount").toString());//拿到该账号的登录的失败的次数
                if (count == 2) {
                    //证明用户的前面的2次登录都是失败的，那么第三次同样也是失败了，因为如果进入到这个if里面本身就决定
                    //了用户是第三次已经输错了密码
                    //我现在需要开始将状态首先锁住
                    dataMap.put("userStatus", 0);//状态变成禁用
                    dataMap.put("userLoginCount", 0);//登录的次数清0
                    dataMap.put("userLastTime", new Timestamp(System.currentTimeMillis()));
                    userMapper.updateUser(dataMap);//锁住账号

                } else {
                    //此时我们就需要将他的登录次数+1在进行update
                    dataMap.put("userLoginCount", count + 1);
                    userMapper.updateUser(dataMap);//更新登录失败的次数
                    session.setAttribute("msg", "该账号登录密码错误！");
                }
                return "redirect:/login";//重定向login的方法到login.ftl
            } else {
////
//                if(dataMap.get("userStatus").toString().equals("0")){
//                    session.setAttribute("msg","账号没有启用!");
//                    return "redirect:/login";//重定向login的方法到login.ftl
//                }else{
                //正常的话就跳转到个人中心页面
                dataMap.put("userLoginCount", 0);
                dataMap.put("userLastTime", new Timestamp(System.currentTimeMillis()));
                userMapper.updateUser(dataMap);//更新登录失败的次数
                session.setAttribute("user", dataMap);
                Map<String, Object> user = (Map<String, Object>) request.getSession().getAttribute("user");
                String userId = user.get("userId").toString();
                //取到session里面的userId
                map.put("userId", userId);
                List<Map<String, Object>> list = userMapper.queryUserShopCartList(map);//map有一个参数是产品的productId
                //count=list.size();//得到用户的购物车的商品的数量
                session.setAttribute("userShopCartCount", list.size());
                return "redirect:/main";
                //}
            }

        }

    }

    @Override
    public List<Map<String, Object>> queryProductList(Map<String, Object> map) {
        map.put("productStatus", 1);
        return userMapper.queryProductList(map);
    }

    @Override
    public String selectUserShopCartList(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String url = "";
        if (request.getSession().getAttribute("user") == null) {
            url = "redirect:/login";
        } else {
            map = (Map<String, Object>) request.getSession().getAttribute("user");
            String userId = map.get("userId").toString();
            map.put("userId", userId);
            System.out.println("list" + userMapper.queryUserShopCartList(map));
            request.setAttribute("list", userMapper.queryUserShopCartList(map));
            request.setAttribute("userShopCartCount", userMapper.queryUserShopCartList(map).size());
            url = "shopcart";
        }
        return url;
    }
}
