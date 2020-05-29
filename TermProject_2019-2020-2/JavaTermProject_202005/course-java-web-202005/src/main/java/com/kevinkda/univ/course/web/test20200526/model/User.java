package com.kevinkda.univ.course.web.test20200526.model;

/**
 * @author Kevin KDA on 2020/5/26 10:39
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.test20200526.model
 * @classname User
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class User {
    String userNick;

    public User() {
    }

    public User(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }
}
