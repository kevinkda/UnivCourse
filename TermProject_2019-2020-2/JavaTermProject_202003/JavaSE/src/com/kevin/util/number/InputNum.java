/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.util.number;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/3/18 18:24
 * @version 1.0
 * @package com.kevin.util.number
 * @classname InputNum
 * @description 提供对输入数字的检查
 * @interface/enum
 */
public class InputNum {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * @param prompt: 提示信息
     * @return int 返回一个可以使用的数字
     * @author Kevin KDA on 2020/3/18 18:29
     * @description InputNum / getInt 提供键盘接收的操作
     */
    public static int getInt(String prompt) {
        int num = 0;
        boolean flag = true;
        while (flag) {
//            打印提示信息
            System.out.print(prompt);
            if (SCANNER.hasNextInt()) {
                flag = false;
                num = SCANNER.nextInt();
            } else {
                System.out.println("输入的内容不是数字！");
            }
        }
        return num;
    }

    private InputNum() {
    }
}
