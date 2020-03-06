/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200217.manager;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/2/17 15:33
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200217.manager
 * @classname View
 * @description TODO
 * @interface/enum
 */
public class View extends Manager {
    private Scanner scaScan = new Scanner(System.in);

    /**
     * @param
     * @return
     * @author Kevin KDA on 2020/2/17 15:47
     * @description View / View TODO 构造方法调用userView()
     */
    public View() {
        userView();
    }

    /**
     * @param
     * @return void
     * @author Kevin KDA on 2020/2/17 15:52
     * @description View / userView TODO 整合主菜单视图 & 功能选择
     */
    public void userView() {
        mainMenu();
        selectionFunction();
    }

    /**
     * @param
     * @return void
     * @author Kevin KDA on 2019/10/24 21:57
     * @description UserView / mainMenu TODO 主菜单视图
     */
    private void mainMenu() {
        System.out.println("\n\n\t\t\t个人简历\n===============================");
        System.out.println("1.查看");
//        System.out.println("2.添加");
//        System.out.println("3.删除");
//        System.out.println("4.查找");
//        System.out.println("5.修改");
//        System.out.println("9.注销登录");
        System.out.println("0.退出");
        System.out.print("请选择需要执行的指令:");
    }

    /**
     * @param
     * @return void
     * @author Kevin KDA on 2020/2/17 15:54
     * @description View / selectionFunction TODO 提供功能选择方法
     */
    private void selectionFunction() {
        switch (scaScan.next()) {
            default:
                System.out.print("\n输入错误或功能暂时未实现，请重新输入\n");
                userView();
            case "0":
                exit();
                break;
            case "1":
                getInformation();
                returnMainMenu();
                userView();
                break;
        }
    }

    /**
     * @param
     * @return void
     * @author Kevin KDA on 2020/2/17 17:36
     * @description View / returnMainMenu TODO 提供程序断点等待用户输入后进行下一步操作
     */
    private void returnMainMenu() {
        System.out.println("\n按任意键和回车返回主菜单 or 按 x 键退出本系统");
        if ("x".equals(scaScan.next())) {
            exit();
        } else {
            userView();
        }
    }

    /**
     * @param
     * @return void
     * @author Kevin KDA on 2020/2/17 17:37
     * @description View / exit TODO 提供退出系统方法
     */
    private void exit() {
        System.out.println("系统退出");
        System.exit(-1);
    }
}
