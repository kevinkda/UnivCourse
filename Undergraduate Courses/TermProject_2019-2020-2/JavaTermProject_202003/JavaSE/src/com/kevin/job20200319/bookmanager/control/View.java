/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200319.bookmanager.control;

import com.kevin.job20200319.bookmanager.service.AccManagerLocalIo;
import com.kevin.job20200319.bookmanager.service.DataPersistenceLayer;
import com.kevin.util.number.InputNum;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/2/17 15:33
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200319.bookmanager.control
 * @classname View
 * @description 提供用户视图
 * @interface/enum
 */
public final class View extends Control {
    private final Scanner scaScan = new Scanner(System.in);

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
//        System.out.println("系统已为您自动登录，登录账户为" + getStrAccountLoggedIn());
        if (AccManagerLocalIo.isBoolLoginStatus()) {
            for (int i = FEATURES_AVAILABLE_AFTER_LOGIN; i < STR_PROVIDE_FUNCTION.length; i++) {
                System.out.println((i + 1) + ":" + STR_PROVIDE_FUNCTION[i]);
            }
        } else {
            for (int i = 0; i < FEATURES_AVAILABLE_BEFORE_LOGIN + 1; i++) {
                System.out.println((i + 1) + ":" + STR_PROVIDE_FUNCTION[i]);
            }
        }

//        for (int i = 0; i < STR_IMPLEMENT_FUNCTION.length - 1; i++) {
//            System.out.println((i + 1) + ":" + STR_IMPLEMENT_FUNCTION[i]);
//        }
        System.out.println("0:Exit");
//        System.out.print("请输入您的选项:");
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/2/17 15:54
     * @description View / selectionFunction 提供功能选择方法
     * Modify by KevinKDA on 2020/3/6 19:19
     * 整合主菜单视图 & 功能选择
     */
    private void selectionFunction() {
        int intUserChoose;
        do {
            mainMenu();
            intUserChoose = InputNum.getInt("请输入您的选项:");
            System.out.println();
            switch (intUserChoose) {
                default:
                    System.out.println("无效操作");
                    break;
                case 0:
//                    退出
                    exit();
                    break;
                case 1:
//                    登录
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    showAccList();
                    login();
                    break;
                case 2:
//                    注册
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    register();
                    break;
                case 3:
//                    充值
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    recharge();
                    break;
                case 4:
//                    修改密码
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    modifyAccPass();
                    break;
                case 5:
//                    购买小说
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    buyingNovels();
                    break;
                case 6:
//                    书列表
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    showBookListImpl();
                    break;
                case 7:
//                    读书
                    backVoidMethod(STR_PROVIDE_FUNCTION[intUserChoose - 1]);
                    readBook();
                    break;
            }
        } while (intUserChoose != STR_PROVIDE_FUNCTION.length);
    }

    /**
     * @param strFuncName:传输功能名
     * @return void
     * @author Kevin KDA on 2020/3/6 19:19
     * @description View / backVoidMethod
     */
    private void backVoidMethod(String strFuncName) {
        for (String i :
                STR_REALIZATION_FUNCTION) {
            if (strFuncName.equals(i)) {
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
        System.out.println("系统正在保存数据，请稍等");
        DataPersistenceLayer.saveAccountInformation();
        DataPersistenceLayer.saveBookInformation();
        System.out.println("系统退出");
        System.exit(-1);
    }
}
