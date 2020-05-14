package com.kevinkda.univ.course.web.job20200514.domain;

/**
 * @author Kevin KDA on 2020/5/14 15:04
 * @version 1.0.0
 * @project JavaTermProject_202005
 * @package com.kevinkda.univ.course.web.job20200514.domain
 * @classname Student
 * @apiNote <p></p>
 * @since 1.0.0
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int stuAge) {
        this.id = id;
        this.name = name;
        this.age = stuAge;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
