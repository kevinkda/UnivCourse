/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.management;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/10/24 13:05
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.Management
 * @classname Login 提供登陆界面&登陆状态
 * @description TODO
 * @interface/enum
 */
public class Login {
    /**
     * 登陆状态
     */
    private static int intLoginStatusLock = 1;

    public Login(Scanner scaScan) {
        if (getIntLoginStatusLock() != 1) {
            setLoginStatus(scaScan);
        }
    }


    public int login(Scanner scaScan) {
        System.out.print("请问是否解密显示数据(Y/y):");
        String string = scaScan.next();
        if ("y".equals(string) || "Y".equals(string)) {
            return 1;
        }
        return 0;
    }

    public void logout() {
        setIntLoginStatusLock(0);
    }

    public void setLoginStatus(Scanner scaScan) {
        setIntLoginStatusLock(login(scaScan));
    }

    public static int getIntLoginStatusLock() {
        return intLoginStatusLock;
    }

    private void setIntLoginStatusLock(int intLoginStatusLock) {
        Login.intLoginStatusLock = intLoginStatusLock;
    }
}
