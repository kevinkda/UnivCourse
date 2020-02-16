/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.employeemanagementsystem.foundationclass;

/**
 * @author Kevin KDA on 2019/11/1 9:10
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.employeemanagementsystem.foundationclass
 * @classname Staff
 * @description TODO
 * @interface/enum
 */
public class Staff {
    private int intStaffSn;
    private String strName;
    private String strSex;
    private double douWages;
    private String strDepartment;

    public Staff(String strName, String strSex, double douWages, String strDepartment) {
        this.strName = strName;
        this.strSex = strSex;
        this.douWages = douWages;
        this.strDepartment = strDepartment;
    }

    public Staff(int intStaffSn, String strName, String strSex, double douWages, String strDepartment) {
        this.intStaffSn = intStaffSn;
        this.strName = strName;
        this.strSex = strSex;
        this.douWages = douWages;
        this.strDepartment = strDepartment;
    }

    public Staff() {

    }
    protected void getData(){
        System.out.println(getintStaffSn()+"\t\t"+getStrName() +"\t\t"+ getStrSex() +"\t\t\t"+ getStrDepartment() +"\t\t"+ getdouWages());
    }

    public int getintStaffSn() {
        return intStaffSn;
    }

    public void setintStaffSn(int intStaffSn) {
        this.intStaffSn = intStaffSn;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrSex() {
        return strSex;
    }

    public void setStrSex(String strSex) {
        this.strSex = strSex;
    }

    public double getdouWages() {
        return douWages;
    }

    public void setdouWages(double douWages) {
        this.douWages = douWages;
    }

    public String getStrDepartment() {
        return strDepartment;
    }

    public void setStrDepartment(String strDepartment) {
        this.strDepartment = strDepartment;
    }
}
