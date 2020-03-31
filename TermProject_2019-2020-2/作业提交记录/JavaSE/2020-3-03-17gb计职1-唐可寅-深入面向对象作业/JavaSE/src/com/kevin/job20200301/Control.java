/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200301;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/2/27 15:25
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200301
 * @classname Control
 * @description TODO
 * @interface/enum
 */
public class Control {
    private Scanner scaScan = new Scanner(System.in);

    void task1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void task2() {
        int a, n, sum = 0;
        boolean b = true;
        System.out.println("本程序将计算s = a + aa + aaa + ... + aaa...a的值\n" +
                "请输入a和n的值");

        do {
            System.out.print("请输入a的值(1~9):");
            a = scaScan.nextInt();
            if (a > 0 && a < 10) {
                b = false;
                break;
            } else {
                System.out.println("您的输入有误，请输入1~9之间的数字！\n");
                b = true;
            }
        } while (b);
        do {
            System.out.print("请输入n(正整数):");
            n = scaScan.nextInt();
            if (n > 0) {
                b = false;
                break;
            } else {
                System.out.println("您的输入有误，请输入一个正整数！\n");
                b = true;
            }
        } while (b);
        for (int i = 1; i <= n; i++) {
            sum += a;
            a = a * 10 + a;
        }
        System.out.println("s的值为：" + sum);
    }

    void task3() {
        int n, sum1 = 1, sum2 = 0;
        boolean b = true;
        do {
            System.out.print("请输入一个正整数(大于1):");
            n = scaScan.nextInt();
            if (n > 1) {
                b = false;
                break;
            } else {
                System.out.println("输入有误，请重新输入\n");
                b = true;
            }
        } while (b);
        for (int i = 1; i <= n; i++) {
            sum1 *= i;
            sum2 += sum1;
        }
        System.out.println("1 ~ " + n + "的阶乘为：" + sum2);
    }

    void task4() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }
}
