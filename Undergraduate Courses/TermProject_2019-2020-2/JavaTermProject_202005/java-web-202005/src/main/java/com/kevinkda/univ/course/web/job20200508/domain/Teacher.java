package com.kevinkda.univ.course.web.job20200508.domain;

/**
 * @author Kevin KDA on 2020/5/7 22:34
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200508.domain
 * @classname Teacher
 * @apiNote <p></p>
 * @since 2020.05.08
 */
public class Teacher {
    int id;
    String name;
    int sex;
    String idNum;

    public Teacher() {
    }

    public Teacher(int id, String name, int sex, String idNum) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.idNum = idNum;
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

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
}
