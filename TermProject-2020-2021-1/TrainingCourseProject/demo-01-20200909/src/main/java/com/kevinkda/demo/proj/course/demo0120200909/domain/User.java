package com.kevinkda.demo.proj.course.demo0120200909.domain;

/**
 * @author Kevin KDA on 2020/9/10 15:13
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.course.demo0120200909.domain
 * @classname User
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class User {
    private String userName;
    private String age;


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public User() {
    }

    public User(String userName, String age) {
        this.userName = userName;
        this.age = age;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
