package com.kevinkda.univ.course.web.test20200526.dao;

import com.kevinkda.univ.course.web.test20200526.model.User;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/5/26 10:34
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.test20200526.dao
 * @classname UserDao
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class UserDao {
    public static int getIsLogin(String userNick, ServletContext context) {
        int flag = 1;

        List<User> userList = (List<User>) context.getAttribute("userList");
        if (userList != null) {
            for (User i :
                    userList) {
                if (i.getUserNick().equals(userNick)) {
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }
}
