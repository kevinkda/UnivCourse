/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.employeemanagementsystem.management;

import com.kevin.employeemanagementsystem.database.DataManipulation;
import com.kevin.employeemanagementsystem.foundationclass.BasicData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/11/1 9:36
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.employeemanagementsystem.management
 * @classname ManageControl
 * @description TODO
 * @interface/enum
 */
public class ManageControl {
    private Scanner scaScan = new Scanner(System.in);

    public ManageControl() {
    }

    public int showAllData() throws SQLException {
        System.out.println("\t\t\t雇员数据\n***************************************************************");
        ArrayList<BasicData> arrayList = DataManipulation.getDbData();
        if (arrayList.isEmpty()) {
            System.out.println("雇员信息为空\n请插入信息后再试");
            return 1;
        }
        System.out.println("\n系统中存在的联系人如下：");
        System.out.println("SN\t\t姓名\t\t性别\t\t部门\t\t工资");
        for (BasicData i : arrayList
        ) {
            i.getBasicData();
        }
        return 0;
    }

    public void createDataItem() throws SQLException {
        System.out.print("\t\t\t添加员工\n***************************************************************");
        System.out.print("请输入姓名:");
        String strName = scaScan.next();
        System.out.print("请输入性别:");
        String strSex = scaScan.next();
        System.out.print("请输入薪资:");
        double douWages = scaScan.nextInt();
        System.out.print("请输入部门:");
        String strDepartment = scaScan.next();
        strSex = dataCleaningSex(strSex);
        BasicData basicData = new BasicData(strName, strSex, douWages, strDepartment);
        DataManipulation.addData(basicData);
    }

    private String dataCleaningSex(String strSex) {
        return strSex;
    }

    public void deleteData(Scanner scaScan) throws SQLException {
        System.out.print("\t\t\t删除员工\n***************************************************************");
        showAllData();
        System.out.print("请输入工号:");
        DataManipulation.deleteData(scaScan.nextInt());
    }
}
