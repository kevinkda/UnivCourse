/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.exercise201910250;

/**
 * @author Kevin KDA on 2019/10/25 9:09
 * @version 1.0
 * @project Java_Course_Assignments
 * @package exercise201910251
 * @classname WashThread
 * @description TODO 洗茶杯的线程
 * @interface/enum
 */
public class WashThread extends Thread{
    @Override
    public void run() {
        try {
            //洗5个茶杯
            for (int i = 1; i <= 5; i++) {
                System.out.print("开始洗第" + i + "个茶杯...");
                //假设每洗一个茶杯需要1.5秒
                Thread.sleep(1500);
                System.out.println("第" + i + "个茶杯洗干净。");
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
