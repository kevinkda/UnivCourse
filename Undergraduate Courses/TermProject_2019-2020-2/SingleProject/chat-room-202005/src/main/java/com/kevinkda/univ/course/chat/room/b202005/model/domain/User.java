package com.kevinkda.univ.course.chat.room.b202005.model.domain;

/**
 * @author Kevin KDA on 2020/5/27 16:34
 * @version 1.0.0
 * @project chat-room-202005
 * @package com.kevinkda.univ.course.chat.room.b202005.model.domain
 * @classname User
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class User {
    private String nickName;
    private int sex;


    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", sex=" + sex +
                '}';
    }

    public User() {
    }

    public User(String nickName) {
        this.nickName = nickName;
    }

    public User(String nickName, int sex) {
        this.nickName = nickName;
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
