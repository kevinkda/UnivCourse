package com.kevin.job20200317;

/**
 * @author Kevin KDA on 2020/3/17 14:35
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200317
 * @classname Function0317
 * @description
 * @interface/enum
 */
public class Function0317 {
    private static final int MAX = 1000000;

    public static int testA() {
        int sum = 0;
        for (int i = 0; i < MAX + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static int testB() {
        boolean flag;
        int sum = 0;
//      从2开始一直循环到m
        for (int i = 2; i < MAX + 1; i++) {
            flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    //如果有一个数除得断则这个数就不是质数
                    flag = true;
                    break;
                }
            }
//          所有的都除不断后就是质数 所以输出
            if (!flag) {
                sum++;
            }
        }
        return sum;
    }
}
