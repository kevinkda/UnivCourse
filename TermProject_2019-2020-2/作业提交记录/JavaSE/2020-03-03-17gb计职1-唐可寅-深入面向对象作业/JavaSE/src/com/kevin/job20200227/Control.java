/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200227;

/**
 * @author Kevin KDA on 2020/2/27 15:25
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200227
 * @classname Control
 * @description TODO
 * @interface/enum
 */
public class Control {
    void task1() {
        String strX = new String("hello world!");
        String strY = new String("hello world!");
        String strA = "hello world!";
        String strB = "hello world!";
        System.out.println("strX:" + strX + " (new)\n" +
                "strA:" + strA + " (赋值)\n" +
                "strY:" + strY + " (new)\n" +
                "strB:" + strB + " (赋值)\n");
        System.out.println("strX == strY is " + (strX == strY));
        System.out.println("strA == strB is " + (strA == strB));
        System.out.println("strX == strA is " + (strX == strA));
        System.out.println("strY == strB is " + (strY == strB));
    }

    void task2() {
        String str1 = "I want to go to England.";
        StringBuffer strA = new StringBuffer("I want to go to England.");
        String str2 = "But I don't have that much money!";
        StringBuffer strB = new StringBuffer("But I don't have that much money!");

        System.out.println("str1\tString\t\t\t" + str1);
        System.out.println("str2\tString\t\t\t" + str2);

        System.out.println("strA\tStringBuffer\t" + strA);
        System.out.println("strB\tStringBuffer\t" + strB);

        System.out.println("str1 + str2\t\t" + str1.compareTo(str2));
        System.out.println("strA + strB\t\t" + strA.append(strB));
    }

    void task3() {
        int intNum1 = 921;
        Integer integerNum2 = intNum1;
        System.out.println("integerNum2\tInteger 装箱\t\t" + integerNum2);
        int intNum3 = integerNum2;
        System.out.println("intNum3\t\tint 拆箱\t\t\t" + intNum3);
    }

    void task4() {
        int[] ints1 = new int[3];
        ints1[0] = 1;
        ints1[1] = 2;
        ints1[2] = 3;
        int[] ints2 = new int[]{1, 2, 3};
        int[] ints3 = {1, 2, 3};

        System.out.println("\nints1： ");
        for (int i :
                ints1) {
            System.out.print(i + "  ");
        }
        System.out.println("\nints2： ");
        for (int i :
                ints2) {
            System.out.print(i + "  ");
        }
        System.out.println("\nints3： ");
        for (int i :
                ints3) {
            System.out.print(i + "  ");
        }

        System.out.println("\n\n");

        System.out.println("\n以下提供2*3的二维数组");
        int[][] ints4 = {{11, 12}, {21, 22}, {31, 32}};
        for (int[] i :
                ints4) {
            System.out.println(i[0] + "\t" + i[1]);
        }
    }
}
