/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/10/24 13:18
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.management
 * @classname UserView
 * @description TODO 提供用户界面，调用ManageControl类
 * @interface/enum
 */
public class UserView extends Login {
    /**
     * @param [scaScan, manageControl]
     * @throws [IOException]
     * @author Kevin KDA on 2019/10/24 21:56
     * @description UserView / UserView TODO 构造方法调用userView()
     * @returns
     */
    public UserView(Scanner scaScan, ManageControl manageControl) throws IOException, ClassNotFoundException, SQLException {
        super(scaScan);
        userView(scaScan, manageControl);
    }

    /**
     * @param [scaScan, manageControl]
     * @throws [IOException]
     * @author Kevin KDA on 2019/10/24 21:56
     * @description UserView / userView TODO 整合主菜单视图&功能选择
     * @returns void
     */
    public void userView(Scanner scaScan, ManageControl manageControl) throws IOException, SQLException {
        mainMenu();
        selectionFunction(scaScan, manageControl);
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 21:57
     * @description UserView / mainMenu TODO 主菜单视图
     * @returns void
     */
    private void mainMenu() {
        System.out.println("\n\n\t\t\t通讯录\n===============================");
        System.out.println("1.查看");
        System.out.println("2.添加");
        System.out.println("3.删除");
        System.out.println("4.查找");
        System.out.println("5.修改");
        System.out.println("9.注销登录");
        System.out.println("0.退出");
        System.out.print("请选择需要执行的指令:");
    }

    /**
     * @param [scaScan, manageControl]
     * @throws [IOException]
     * @author Kevin KDA on 2019/10/24 21:56
     * @description UserView / selectionFunction TODO 进行功能选择
     * @returns void
     */
    private void selectionFunction(Scanner scaScan, ManageControl manageControl) throws IOException, SQLException {
        switch (scaScan.nextInt()) {
            default:
                System.out.print("\n输入错误，请重新输入\n");
                userView(scaScan, manageControl);
            case 0:
//                manageControl.storageData();
                System.exit(-1);
                break;
            case 1:
                if (manageControl.showAllData() == 1) {
                    userView(scaScan, manageControl);
                }
                userView(scaScan, manageControl);
                break;
            case 2:
                String strCheck;
                do {
                    manageControl.createDataItem(scaScan);
                    System.out.print("是否继续添加(Y/N:)");
                    strCheck = scaScan.next();
                } while ("Y".equals(strCheck) || "y".equals(strCheck));
                userView(scaScan, manageControl);
                break;
            case 3:
                manageControl.deleteData(scaScan);
                userView(scaScan, manageControl);
                break;
            case 4:
                manageControl.searchData(scaScan);
                userView(scaScan, manageControl);
                break;
            case 5:
                manageControl.changeDataView(scaScan);
                userView(scaScan, manageControl);
                break;
            case 9:
                logout();
                userView(scaScan, manageControl);
                break;
        }
    }
}

