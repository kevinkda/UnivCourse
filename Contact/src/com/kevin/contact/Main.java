/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact;

import com.kevin.contact.obsolete.OldMain;

import java.util.Scanner;

/**
 * @Project Contact
 * @Package com.kevin
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 9:41
 * @Interface
 * @Enum
 * @Version 1.4
 */
public class Main {
    public static void main(String[] args) {
//        OldMain oldMain = new OldMain();
//        oldMain.viewMain();
        Scanner scaScan = new Scanner(System.in);
        ContactManage contactManage = new ContactManage();
        View viewInterface = new View(scaScan, contactManage);
    }
}
