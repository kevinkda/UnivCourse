/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910251;

/**
 * @author Kevin KDA on 2019/10/25 9:42
 * @version 1.0
 * @project Java_Course_Assignments
 * @package exercise201910252
 * @classname Main
 * @description TODO
 * @interface/enum
 */
public class Main {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicket st = new SellTicket();
        // 创建三个线程对象
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");
        // 启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
