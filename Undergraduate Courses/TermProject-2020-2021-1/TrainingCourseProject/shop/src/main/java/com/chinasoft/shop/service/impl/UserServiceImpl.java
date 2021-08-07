package com.chinasoft.shop.service.impl;

import com.chinasoft.shop.dao.UserMapper;
import com.chinasoft.shop.service.IUserService;
import com.chinasoft.shop.tool.IPUtil;
import com.chinasoft.shop.tool.MD5Tool;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean selectUserIsExist(Map<String, Object> map) {
        if(userMapper.queryUserIsExist(map)==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String insertUser(Map<String, Object> map, HttpServletRequest request) {
        //将密码加密后放入
        map.put("userPassword", MD5Tool.string2MD5(map.get("userPassword").toString()));
        map.put("userRegTime",new Timestamp(System.currentTimeMillis()));
        map.put("userLastTime",new Timestamp(System.currentTimeMillis()));
        map.put("userLastLoginIp", IPUtil.getIP(request));
        map.put("userStatus",1);
        map.put("userSessionId",request.getSession().getId());
        map.put("userLoginCount",0);//登陆次数为０
        int count= userMapper.insertUser(map);
        if (count==1){
            return "redirect:/login";
        }else {
            request.getSession().setAttribute("msg","注册失败");
            return "redirect:/webPage/register.html";
        }
//        return userMapper.insertUser(map);
    }

    @Override
    public String userLogin(Map<String, Object> map, HttpSession session) {
//        Map<String,Object> dataMap=userMapper.userLogin(map);
//        System.out.println("1="+map);
//        System.out.println("2="+userMapper.userLogin(map));
        if (userMapper.userLogin(map)==null){
            //账号错误
            session.setAttribute("msg","账号不存在");
            return "redirect:/login";
        }else{
            Map<String,Object> dataMap = userMapper.userLogin(map);
            if(dataMap.get("userStatus").toString().equals("0")){
                //若此时账号状态为0，则证明账号之前登陆失败已经达到三次
                //判断账号锁住的时间，若大于现在的时间则把状态更新为1，次数更新为0
                //若时间已经超过了规定时间则更新账号状态为１，若规定时间用户登陆无效，并保持原来的状态继续锁定
                Object time1=dataMap.get("userLastTime");
                Timestamp t1=(Timestamp)time1;
                Timestamp t2=new Timestamp(System.currentTimeMillis());
                long a1 = t1.getTime();
                long a2 = t2.getTime();
                int hours =(int) ((a1-a2)/(1000*60*60));
                int minutes =(int) (((a1-a2)/1000-hours*(60*60))/60);
                int m =Math.abs(minutes);
                System.out.println("m"+m);
                if(m>=2){
                    //若满足条件则证明账号已经可以解锁了
                    dataMap.put("userStatus",1);
                    userMapper.updateUser(dataMap);//解锁用户账号
                }else {
                    session.setAttribute("msg","账号未解锁，锁定时间为2分钟");
                    return "redirect:/login";
                }
            }
            //密码错误
            if(!dataMap.get("userPassword").toString().equals(MD5Tool.string2MD5(map.get("userPassword").toString()))){
//                session.setAttribute("msg","密码错误");
                //当密码不对时该用户的账号的登陆次数＋１，首先判断次数是不是已经登陆３次，若登于则锁住该账号，若没有则在原来的基础上加１
                int count=Integer.parseInt(dataMap.get("userLoginCount").toString());
                if(count==2){
                    //count==2证明前两次登陆都失败了，第三次也失败了
                    //首先锁住状态
                    dataMap.put("userStatus",0);
                    dataMap.put("userLoginCount",0);
                    dataMap.put("userLastTime",new Timestamp(System.currentTimeMillis()));
                    userMapper.updateUser(dataMap);//更新账号状态和登陆失败次数
                }{
                    //将用户的登陆次数 +1 进行update
                    dataMap.put("userLoginCount",count+1);
                    userMapper.updateUser(dataMap);//更新登录失败次数
                    session.setAttribute("msg","密码错误");
                }
                return "redirect:/login";
            }else {
                    dataMap.put("userLoginCount",0);
                    userMapper.updateUser(dataMap);//更新登录失败次数
                    session.setAttribute("user",dataMap);
                    return "redirect:/peoplecenter";
            }
        }
    }

    @Override
    public List<Map<String, Object>> queryAddressList(Map<String, Object> map,HttpSession session) {
        Map<String,Object> map1=(Map<String, Object>) session.getAttribute("user");
        map.put("userEmail",map1.get("userEmail"));
        return userMapper.queryAddressList(map);
    }

    @Override
    public int updateUserAddress(Map<String, Object> map) {
        return userMapper.updateUserAddressOne(map)+userMapper.updateUserAddressTwo(map);
    }

    @Override
    public String selectAreaList() {
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = null;
        try {
            jsonStr = mapper.writeValueAsString(userMapper.selectAreaList());
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return jsonStr;
    }

    @Override
    public int addressInsert(String userAddressPeople,String userPhone,String userEmail,String userAddress,int userAddressStatus) {
        return userMapper.addressInsert(userAddressPeople,userPhone,userEmail,userAddress,userAddressStatus);
    }
}
