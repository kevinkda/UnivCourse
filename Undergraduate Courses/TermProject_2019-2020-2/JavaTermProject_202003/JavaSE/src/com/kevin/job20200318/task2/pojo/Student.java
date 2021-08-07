package com.kevin.job20200318.task2.pojo;

import java.io.Serializable;

/**
 * @author Kevin KDA on 2020/3/18 11:32
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200318.task2.pojo
 * @classname Student
 * @description
 * @interface/enum
 */
public class Student implements Comparable<Student>, Serializable {
    private static final long serialVersionUID = -8402795596948954371L;
    private String strStuName;
    private int intAge;
    private double douScore;

    public Student() {
    }

    public Student(String strStuName, int intAge, double douScore) {
        this.strStuName = strStuName;
        this.intAge = intAge;
        this.douScore = douScore;
    }

    public String getStrStuName() {
        return strStuName;
    }

    public void setStrStuName(String strStuName) {
        this.strStuName = strStuName;
    }

    public int getIntAge() {
        return intAge;
    }

    public void setIntAge(int intAge) {
        this.intAge = intAge;
    }

    public double getDouScore() {
        return douScore;
    }

    public void setDouScore(double douScore) {
        this.douScore = douScore;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (o.douScore - this.douScore);
    }
}
