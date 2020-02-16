/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.employeemanagementsystem.management;

import com.kevin.employeemanagementsystem.database.DataManipulation;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/11/1 9:40
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.employeemanagementsystem.management
 * @classname UserView
 * @description TODO
 * @interface/enum
 */
public class UserView {
    private Scanner scaScan = new Scanner(System.in);
    private ManageControl manageControl = new ManageControl();

    public UserView() throws SQLException {
        userView();
    }

    public void userView() throws SQLException {
        mainMenu();
        selectionFunction();
    }

    private void selectionFunction() throws SQLException {
        switch (scaScan.nextInt()) {
            default:
                System.out.print("\n输入错误，请重新输入\n");
                userView();
            case 1:
                String strCheck;
                do {
                    manageControl.createDataItem();
                    System.out.print("是否继续添加(Y/N:)");
                    strCheck = scaScan.next();
                } while ("Y".equals(strCheck) || "y".equals(strCheck));
                userView();
                break;
            case 2:
                if (manageControl.showAllData() == 1) {
                    userView();
                }
                userView();
                break;
            case 3:
                manageControl.deleteData(scaScan);
                userView();
                break;
            case 4:
                DataManipulation.closeAll();
                System.exit(-1);
                break;
        }
    }

    private void mainMenu() {
        System.out.println("\n\n\t\t 欢迎使用X员工管理系统\n===============================");
        System.out.println("1.添加");
        System.out.println("2.查询");
        System.out.println("3.删除");
        System.out.println("4.退出");
        System.out.print("请选择需要执行的指令:");
    }
}

