/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.employeemanagementsystem.foundationclass;

/**
 * @author Kevin KDA on 2019/11/1 9:36
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.employeemanagementsystem.foundationclass
 * @classname Employee
 * @description TODO
 * @interface/enum
 */
public class BasicData extends Staff {
    public BasicData(String strName, String strSex, double douWages, String strDepartment) {
        super(strName, strSex, douWages, strDepartment);
    }

    public BasicData() {
    }

    public BasicData(int intStaffSn, String strName, String strSex, double douWages, String strDepartment) {
        super(intStaffSn, strName, strSex, douWages, strDepartment);
    }

    public void getBasicData() {
        getData();
    }
}
