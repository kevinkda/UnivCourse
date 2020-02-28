/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200227;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        checkTask();
    }

    private static void checkTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("----homework----");
        System.out.println("1.作业1\n2.作业2\n3.作业3\n4.作业4\n5.退出");
        System.out.print("请按下相应键进行操作:");
        switch (input.nextInt()) {
            default:
                System.out.println("输入错误，请重新输入！");
                checkTask();
                break;
            case 1:
                task1();
                break;
            case 2:
                task2();
                break;
            case 3:
                task3();
                break;
            case 4:
                task4();
                break;
            case 5:
                System.exit(-1);
                break;
        }
    }

    private static void isBack() {
        Scanner input = new Scanner(System.in);
        System.out.println("若继续查看请按'y',退出请按'5'。");
        String str = input.next();
        if (str.equals('y')) {
            checkTask();
        } else if (str.equals('Y')) {
            checkTask();
        } else {
            System.exit(-1);
        }
    }

    private static void task1() {
        String str1 = new String("hello world!");
        String strA = new String("hello world!");
        String str2 = "hello world!";
        String strB = "hello world!";
        System.out.println("str1:" + str1 + " (new赋值)\nstr2:" + str2 + " (=赋值)\nstrA:" + strA + " (new赋值)\nstrB:" + strB + " (=赋值)\n");
        System.out.println("str1 == strA is " + (str1 == strA));
        System.out.println("str2 == strB is " + (str2 == strB));
        System.out.println("str1 == str2 is " + (str1 == str2));
        System.out.println("strA == strB is " + (strA == strB));
        isBack();
    }

    private static void task2() {
        String str1 = "I am lonely.";
        String str2 = "But now I have a friend!";
        StringBuffer strA = new StringBuffer("I am lonely.");
        StringBuffer strB = new StringBuffer("But now I have a friend!");
        System.out.println("(String)str1:" + str1);
        System.out.println("(String)str2:" + str2);
        System.out.println("(StringBuffer)strA:" + strA);
        System.out.println("(StringBuffer)strB:" + strB);
        System.out.println("str1 + str2 = " + str1.compareTo(str2));
        System.out.println("strA + strB = " + strA.append(strB));
        isBack();
    }

    private static void task3() {
        int intNum = 1000;
        Integer integerNum = intNum;
        System.out.println("(装箱)integerNum = " + integerNum);
        int intNum2 = integerNum;
        System.out.println("(拆箱)intNum2 = " + intNum2);
        isBack();
    }

    private static void task4() {
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        int[] array2 = new int[]{1, 2, 3};
        int[] array3 = {1, 2, 3};
        System.out.println("array1中包含： ");
        for (int num : array1) {
            System.out.print(num + "  ");
        }
        System.out.println("\narray2中包含： ");
        for (int num : array2) {
            System.out.print(num + "  ");
        }
        System.out.println("\narray3中包含： ");
        for (int num : array3) {
            System.out.print(num + "  ");
        }

        System.out.println("\n一维维度为2，二维维度为3的二维数组：");
        int[][] array4 = new int[3][2];
        array4[0][0] = 11;
        array4[0][1] = 12;
        array4[1][0] = 21;
        array4[1][1] = 22;
        array4[2][0] = 31;
        array4[2][1] = 32;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(array4[i][j] + "  ");
            }
            System.out.println();
        }
        isBack();
    }
}
