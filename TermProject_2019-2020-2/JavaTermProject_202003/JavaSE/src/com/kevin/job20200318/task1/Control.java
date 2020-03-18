package com.kevin.job20200318.task1;

import com.kevin.util.io.StorageFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Kevin KDA on 2020/3/18 12:43
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200318.task1
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control {
    /**
     * 程序运行时数据存储空间
     */
    private final List<Time> list = new ArrayList<>();
    /**
     * 文件路径
     */
    private final static String FILE_PATH = "." + File.separator +
            "JavaSE" + File.separator +
            "src" + File.separator +
            "com" + File.separator +
            "kevin" + File.separator +
            "job20200317" + File.separator +
            "job_20200317.txt";

    /**
     * 读取磁盘数据
     *
     * @return void
     * @author Kevin KDA on 2020/3/18 12:49
     * @description Control / read 读取磁盘数据
     */
    public static void read() {
        System.out.println("\n\n正在从磁盘中读取数据\n路径为\t" + FILE_PATH);
        List<Time> list = new StorageFile<Time>().readList(FILE_PATH);
        boolean flag = list != null;
        System.out.println("文件读取结果：" + flag);
        System.out.println("成功读取到" + Objects.requireNonNull(list).size() + "条数据");
        System.out.println("\n方法名\t\t\t执行时间");
        for (Time s :
                list) {
            System.out.printf("%-12s\t%fs\n", s.getFuncName(), s.getDurationBySecond());
        }
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/18 13:13
     * @description Control / write job20200317
     */
    public static void write() {
        Time time;
        List<Time> list = new ArrayList<>();
        double tA, tB;

        time = new Time("testA");
        System.out.println("testA\t这是一个关于1-100000累加的方法计时\n方法运算过程将不会被输出");
        time.startTime();
        System.out.println("testA\t执行结果" + com.kevin.job20200317.Function0317.testA());
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
