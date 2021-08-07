package com.kevin.job20200317;

import com.kevin.util.io.StorageFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kevin KDA on 2020/3/17 14:20
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200317
 * @classname Main0317
 * @description
 * @interface/enum
 */
public class Main0317 {
    public static void main(String[] args) {
        Time time = null;
        List<Time> list = new ArrayList<>();
        double tA, tB;

        time = new Time("testA");
        System.out.println("testA\t这是一个关于1-100000累加的方法计时\n方法运算过程将不会被输出");
        time.startTime();
        System.out.println("testA\t执行结果" + Function0317.testA());
        time.stopTime();
        System.out.println("testA\t执行时间共" + time.getDurationBySecond() + "s");
        tA = time.getDurationBySecond();
        list.add(time);

        System.out.println();

        time = new Time("testB");
        System.out.println("testB\t这是一个关于1-100000素数个数的方法计时\n方法运算过程将不会被输出");
        time.startTime();
        System.out.println("testA\t执行结果" + Function0317.testB());
        time.stopTime();
        System.out.println("testA\t执行时间共" + time.getDurationBySecond() + "s");
        tB = time.getDurationBySecond();
        list.add(time);

        if (tA > tB) {
            System.out.println("testA执行时间最长，时间为" + tA);
        } else {
            System.out.println("testB执行时间最长，时间为" + tB);
        }

        StorageFile<Time> storageFile = new StorageFile<>();
        String filePath = "." + File.separator +
                "JavaSE" + File.separator +
                "src" + File.separator +
                "com" + File.separator +
                "kevin" + File.separator +
                "job20200317" + File.separator +
                "job_20200317.txt";
        System.out.println("文件存储结果：\t" + storageFile.storage(filePath, list));
    }
}
