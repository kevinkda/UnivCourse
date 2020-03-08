/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200308.bookmanager.control;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/2/17 15:33
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200217.manager
 * @classname View
 * @description
 * @interface/enum
 */
public final class View extends Control {
    Scanner scaScan = new Scanner(System.in);

    /**
     * @author Kevin KDA on 2020/2/17 15:47
     * @description View / View 构造方法调用userView()
     */
    public View() {
        selectionFunction();
    }

    /**
     * @return void
     * @author Kevin KDA on 2019/10/24 21:57
     * @description UserView / mainMenu 主菜单视图
     */
    private void mainMenu() {
        System.out.println("欢迎来到乐趣共享读书系统");
        String[] menu = {"登陆", "新增", "修改", "删除", "借出", "归还", "查看", "退出"};
        System.out.println("系统已为您自动登录，登录账户为" + getStrAccountLoggedIn());
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ":" + menu[i]);
        }
        System.out.print("请输入您的选项:");
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/2/17 15:54
     * @description View / selectionFunction 提供功能选择方法
     * Modify by KevinKDA on 2020/3/6 19:19
     * 整合主菜单视图 & 功能选择
     */
    private void selectionFunction() {
        int intUserChoose = -1;
        // 登陆, 新增 ，修改 ，删除    借出  归还（算钱） 退出
        do {
            mainMenu();
            intUserChoose = scaScan.nextInt();
            System.out.println();
            switch (intUserChoose) {
                default:
                    System.out.println("无效操作");
                    break;
                case 1:
                    backVoidMethod("登陆");
                    login();
                    break;
                case 2:
                    backVoidMethod("添加");
                    addBook();
                    break;
                case 3:
                    backVoidMethod("修改");
                    modifyByBookId();
                    break;
                case 4:
                    backVoidMethod("删除");
                    deleteByBookId();
                    break;
                case 5:
                    backVoidMethod("借出");
                    lendByBookId();
                    break;
                case 6:
                    backVoidMethod("归还");
                    giveBackByBookId();
                    break;
                case 7:
                    backVoidMethod("书列表");
                    printBookInfo();
                    break;
                case 8:
                    backVoidMethod("Exit");
                    exit();
                    break;
            }
        } while (intUserChoose != 8);
    }

    /**
     * @param strFuncName:传输功能名
     * @return void
     * @author Kevin KDA on 2020/3/6 19:19
     * @description View / backVoidMethod
     */
    private void backVoidMethod(String strFuncName) {
        for (String i :
                STR_IMPLEMENT_FUNCTION) {
            if (strFuncName.equals(strFuncName)) {
                return;
            }
        }
        System.out.println(strFuncName + " 功能暂未实现，请选择其他功能");
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/2/17 17:37
     * @description View / exit 提供退出系统方法
     */
    private void exit() {
        System.out.println("系统退出");
        System.exit(-1);
    }
}
