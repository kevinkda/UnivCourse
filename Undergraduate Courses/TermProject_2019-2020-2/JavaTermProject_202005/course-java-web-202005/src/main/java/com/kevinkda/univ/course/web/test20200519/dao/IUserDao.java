package com.kevinkda.univ.course.web.test20200519.dao;

import com.kevinkda.univ.course.web.test20200519.model.User;

import java.util.List;

/**
 * @author Kevin KDA on 2020/5/19 09:10
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.test20200519.dao
 * @classname IUserDao
 * @apiNote <p></p>
 * @since 1.0.0
 */
public interface IUserDao {
    public List<User> selectUserList();
}
