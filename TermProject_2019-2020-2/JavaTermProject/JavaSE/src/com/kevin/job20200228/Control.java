/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200228;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/2/27 15:25
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200228
 * @classname Control
 * @description TODO
 * @interface/enum
 */
public class Control {
    private Scanner scaScan = new Scanner(System.in);

    void task1() {
        int intRabbit = 1;
        int intSum = 1;
        int intTemp;
        for (int i = 3; i <= 12; i++) {
            intTemp = intRabbit;
            intRabbit = intSum;
            intSum = intTemp;
        }
        intSum *= 2;
        System.out.println("12月后共有" + intSum + "只兔子");
    }

    void task2() {
        int intSum = 0;
        boolean b;
        for (int i = 10; i <= 105; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    intSum++;
                    break;
                }
            }
        }
        System.out.print("10~105中共有" + intSum + "个素数");
    }

    void task3() {
        int intSum = 0;
        for (int i = 100; i <= 500; i++) {
            if (Math.pow((i / 100), 3) +
                    Math.pow((i / 10 % 10), 3) +
                    Math.pow((i % 10), 3) == i) {
                intSum++;
            }
        }
        System.out.print("100~500中共有" + intSum + "个水仙花数");

    }

    void task4() {
        int intSum = 0;
        for (int i = 2; i <= 100; i++) {
            int intNum = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    intNum += j;
                }
            }
            if (i == intNum) {
                intSum++;
                System.out.println(i + "\t");
                if (intSum % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print("1~101中共有" + intSum + "个完美数");
    }

    void task5() {
        System.out.print("请输入一个正整数：");
        String s = scaScan.next();
        if (Integer.parseInt(s) < 0) {
            System.out.println("请重新输入一个正整数：");
            s = scaScan.next();
        }
        System.out.print("输入数字长度为：" + s.length() + "逆序结果：");
        for (int i = s.length() - 1; i >= 0; i++) {
            System.out.print(s.charAt(i));
        }
    }

    void task6() {
        int intSum = 0;
        for (int i = 2000; i <= 3000; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                intSum++;
                System.out.println(i + "\t");
                if (intSum % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.print("2000-3000年中闰年有" + intSum + "个素数");
    }
}
