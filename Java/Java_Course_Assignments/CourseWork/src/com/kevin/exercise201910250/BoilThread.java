/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910250;

/**
 * @author Kevin KDA on 2019/10/25 9:08
 * @version 1.0
 * @project Java_Course_Assignments
 * @package exercise201910251
 * @classname BoilThread
 * @description TODO 烧开水的线程
 * @interface/enum
 */
public class BoilThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("开始烧水...");
            //假设烧水需要10秒
            Thread.sleep(10000);
            System.out.println("水烧开了。");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
