package com.kevin.job20200311.task1;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/3/11 15:56
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200311.task1
 * @classname ExceptionTest
 * @description
 * @interface/enum
 */
public class ExceptionTest {
    /**
     * @param x:
     * @param y:
     * @return void
     * @author Kevin KDA on 2020/3/11 15:58
     * @description ExceptionTest / mathException 数学异常
     */
    public static void mathException(int x, int y) {
        try {
            System.out.println("x = " + x + " y = " + y + ",x / y = " + x / y);
        } catch (ArithmeticException e) {
            System.out.println("x = " + x + " y = " + y + "，若要x/y，除数不能为零！");
        } finally {
            System.out.println("计算完毕\n");
        }
    }

    /**
     * @param str:
     * @return void
     * @author Kevin KDA on 2020/3/11 15:59
     * @description ExceptionTest / emptyPointException 空指针异常
     */
    public static void emptyPointException(String str) {
        try {
            System.out.println("该字符串的长度为：" + str.length());
        } catch (NullPointerException e) {
            System.out.println("空指针异常\n");
        }
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/11 16:14
     * @description ExceptionTest / numTypeException 数字格式异常
     */
    public static void numTypeException() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入两个数，a:");
            int a = input.nextInt();
            System.out.print("b:");
            int b = input.nextInt();
            int sum = a + b;
            System.out.println("a = " + a + ",b = " + b + ",a+b=" + sum);
        } catch (Exception e) {
            System.out.println("输入数据错误\n");
        }
    }

    /**
     * @param str:
     * @return void
     * @author Kevin KDA on 2020/3/11 16:16
     * @description ExceptionTest / indexOutException 索引越界异常
     */
    public static void indexOutException(String[] str) {
        try {
            System.out.println("该字符串");
            for (int i = 0; i <= str.length; i++) {
                System.out.print("第" + (i + 1) + "个元素为" + str[i] + ",");
            }
        } catch (Exception e) {
            System.out.println("元素越界\n");
        }
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/11 16:16
     * @description ExceptionTest / typeChangeException 类型转换异常
     */
    public static void typeChangeException() {
        try {
            Father father = new Son();
            Son son = (Son) father;
            son.eat();
            Father father2 = new Father();
            Son son2 = (Son) father2;
            son2.eat();
        } catch (ClassCastException e) {
            System.out.println("类型转换异常\n");
        }
    }
}
