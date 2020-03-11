package com.kevin.job20200311.task3.pojo;

import com.kevin.job20200311.task3.exception.DataValueException;

/**
 * @author Kevin KDA on 2020/3/11 16:26
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200311.task3.pojo
 * @classname Employee
 * @description
 * @interface/enum
 */
public class Employee {
    private String name;
    private double sal;
    private String sex;

    public Employee() {
    }

    public Employee(String name, double sal, String sex) {
        this.name = name;
        this.sal = sal;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) throws DataValueException {
        if (sal <= 2500) {
            throw new DataValueException("工资不能少于2500");
        } else {
            this.sal = sal;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) throws DataValueException {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            throw new DataValueException("性别许可键入值为\"男\" or \"女\"");
        }
    }
}
