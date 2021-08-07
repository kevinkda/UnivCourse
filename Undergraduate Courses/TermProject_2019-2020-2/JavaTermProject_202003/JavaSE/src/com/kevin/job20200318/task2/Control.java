package com.kevin.job20200318.task2;

import com.kevin.job20200318.task2.pojo.Student;
import com.kevin.util.io.StorageFile;

import java.io.File;
import java.util.*;

/**
 * @author Kevin KDA on 2020/3/18 11:35
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200318.task2
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control {
    /**
     * 程序运行时数据存储空间
     */
    private final List<Student> list = new ArrayList<>(Arrays.asList(
            new Student("Kevin", 21, 92),
            new Student("Karry", 21, 91),
            new Student("Jackson", 20, 88),
            new Student("PasserbyA", 19, 87),
            new Student("PasserbyB", 24, 60),
            new Student("PasserbyC", 18, 94),
            new Student("Roy", 20, 90)
    ));
    /**
     * 文件路径
     */
    private final static String FILE_PATH = "." + File.separator +
            "JavaSE" + File.separator +
            "src" + File.separator +
            "com" + File.separator +
            "kevin" + File.separator +
            "job20200318" + File.separator +
            "task2" + File.separator +
            "job_20200318T2.txt";
    private final Scanner scaScan = new Scanner(System.in);

    /**
     * @return add
     * @author Kevin KDA on 2020/3/18 12:45
     * @description Control / add 添加学生信息
     */
    public void add() {
        System.out.print("系统中已存在" + list.size() + "条数据\n请问是否添加数据（1添加 0跳过）:");
        while (scaScan.nextInt() == 1) {
            Student s = new Student();
            System.out.print("请输入学生姓名：");
            s.setStrStuName(scaScan.next());
            System.out.print("请输入学生年龄：");
            s.setIntAge(scaScan.nextInt());
            System.out.print("请输入学生成绩：");
            s.setDouScore(scaScan.nextDouble());
            list.add(s);
            System.out.print("请问是否继续添加数据（1添加 0跳过）：");
        }
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/18 12:45
     * @description Control / write 向磁盘存入数据
     */
    public void write() {
        System.out.println("\n开始向磁盘写数据\n路径为\t" + FILE_PATH);
        Collections.sort(list);
        StorageFile<Student> storageFile = new StorageFile<>();
        System.out.println("文件存储结果：" + storageFile.storage(FILE_PATH, list));
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/18 12:45
     * @description Control / read 从磁盘读入数据
     */
    public void read() {
        System.out.println("\n\n正在从磁盘中读取数据\n路径为\t" + FILE_PATH);
        StorageFile<Student> storageFile = new StorageFile<>();
        List<Student> list = storageFile.readList(FILE_PATH);
        boolean flag = list != null;
        System.out.println("文件读取结果：" + flag);
        System.out.println("成功读取到" + Objects.requireNonNull(list).size() + "条数据");
        System.out.println("\n姓名\t\t\t\t年龄\t\t分数");
        for (Student s :
                list) {
            System.out.printf("%-12s\t%d\t\t%s%n", s.getStrStuName(), s.getIntAge(), s.getDouScore());
        }
    }

    /**
     * @return void
     * @author Kevin KDA on 2020/3/18 12:45
     * @description Control / show 从运行时空间读出list数据
     */
    public void show() {
        System.out.println("\n系统中存在" + list.size() + "条数据");
        System.out.println("姓名\t\t\t\t年龄\t\t分数");
        for (Student s :
                list) {
            System.out.printf("%-12s\t%d\t\t%s%n", s.getStrStuName(), s.getIntAge(), s.getDouScore());
        }
    }

    public Control() {
    }


}
