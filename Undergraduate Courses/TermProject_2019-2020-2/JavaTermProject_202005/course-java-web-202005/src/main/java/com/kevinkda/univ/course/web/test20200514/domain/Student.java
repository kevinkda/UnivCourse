package com.kevinkda.univ.course.web.test20200514.domain;

/**
 * @author Kevin KDA on 2020/5/13 08:53
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.test20200513.domain
 * @classname
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Student {
    private int id;
    private String name;
    private int sex;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
