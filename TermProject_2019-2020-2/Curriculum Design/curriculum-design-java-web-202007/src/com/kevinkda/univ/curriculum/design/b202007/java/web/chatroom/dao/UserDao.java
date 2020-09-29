package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.dao;


import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.constant.ConstConfig;
import com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.domain.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/27 17:09
 * @version 1.0.0
 * @project chat-room-202005
 * @package com.kevinkda.univ.curriculum.design.b202007.java.web.chatroom.dao
 * @classname UserDao
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class UserDao {
    /**
     * 判断用户名是否进行了登录
     *
     * @param nickName    用户昵称
     * @param application Request
     * @return int
     * @author Kevin KDA on 2020/7/3 23:14
     * @description UserDao / getIsLogin
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    public static int getIsLogin(String nickName, ServletContext application) {
        int number = -1;
        //你是第一个注册登录的人
        if (application.getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST) == null) {
        } else {
            List<User> list = (List<User>) application.getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST);
            for (User u :
                    list) {
                if (u.getNickName().equals(nickName)) {
                    number = 0;
                    break;
                }
            }
        }
        return number;
    }

    /**
     * 登录注册
     *
     * @param nickName    用户昵称
     * @param sex         用户性别
     * @param session     HttpSession
     * @param application ServletContext
     * @return java.lang.String
     * @author Kevin KDA on 2020/7/3 23:15
     * @description UserDao / login
     * @version 1.0.0
     * @apiNote <p></p>
     * @since 1.0.0
     */
    public static String login(String nickName, int sex, HttpSession session, ServletContext application) {
        User u = null;
        if (application.getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST) == null) {
            List<User> list = new ArrayList<User>();
            u = new User(nickName, sex);
            list.add(u);
            application.setAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST, list);
        } else {
            List<User> list = (List<User>) application.getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST);
            u = new User(nickName, sex);
            list.add(u);
            application.setAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_LIST, list);
        }
        session.setAttribute(ConstConfig.FIELD_GET_CURRENT_USER_INFORMATION, u);

        application.setAttribute(
                ConstConfig.FIELD_REQUEST_LOGIN_USER_COUNT,
                ((int) application.getAttribute(ConstConfig.FIELD_REQUEST_LOGIN_USER_COUNT)) + 1
        );

        return ConstConfig.FIELD_RESPONSE_JUMP_PATH_AFTER_LOGIN;
    }
}
