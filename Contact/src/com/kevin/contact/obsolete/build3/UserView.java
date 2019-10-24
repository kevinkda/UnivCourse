/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build3;

import java.util.Scanner;

/**
 * @Program
 * @ClassName UserView
 * @Description TODO 提供用户界面视图
 * @Author Kevin KDA
 * @Date 2019-10-04 00:34
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class UserView {
    public UserView(Scanner scaScan, ContactManage contactManage) {
        userView(scaScan, contactManage);
    }

    public void userView(Scanner scaScan, ContactManage contactManage) {
        mainMenu();
        selectionFunction(scaScan, contactManage);
    }

    private void mainMenu() {
        System.out.println("\n\n\t\t\t通讯录\n===============================");
        System.out.println("1.查看");
        System.out.println("2.添加");
        System.out.println("3.删除");
        System.out.println("4.查找");
        System.out.println("5.修改");
        System.out.println("0.退出");
        System.out.print("请选择需要执行的指令:");
    }

    void selectionFunction(Scanner scaScan, ContactManage contactManage) {
        switch (scaScan.nextInt()) {
            default:
                System.out.print("\n输入错误，请重新输入\n");
                userView(scaScan, contactManage);
            case 0:
                System.exit(-1);
                break;
            case 1:
                if (contactManage.showAllData() == 1) {
                    userView(scaScan, contactManage);
                }
                userView(scaScan, contactManage);
                break;
            case 2:
                String strCheck;
                do {
                    contactManage.createContact(scaScan);
                    System.out.print("是否继续添加(Y/N:)");
                    strCheck = scaScan.next();
                } while ("Y".equals(strCheck) || "y".equals(strCheck));
                userView(scaScan, contactManage);
                break;
            case 3:
                contactManage.deleteData(scaScan);
                userView(scaScan, contactManage);
                break;
            case 4:
                contactManage.searchData(scaScan);
                userView(scaScan, contactManage);
                break;
            case 5:
                contactManage.changeDataView(scaScan);
                userView(scaScan, contactManage);
                break;
        }
    }
}
