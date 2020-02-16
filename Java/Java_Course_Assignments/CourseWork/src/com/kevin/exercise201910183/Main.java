/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package e201910183;

import java.io.*;

/**
 * @Project E2017
 * @Package e20191018
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/18 11:20
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileDemo();
        FileInputStreamDemo1();
        FileInputStreamDemo2();
        FileOutputStreamDemo1();
        FileOutputStreamDemo2();
        CopyFileDemo();
    }

    public static void FileDemo() {
        //创建一个文件对象，使之与一个文件关联
        File file = new File("test.txt");

        //显示与文件有关的属性信息
        System.out.println("文件或目录是否存在：" + file.exists());
        System.out.println("是文件吗：" + file.isFile());
        System.out.println("是目录吗：" + file.isDirectory());
        System.out.println("名称：" + file.getName());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("文件大小：" + file.length());
    }

    public static void FileInputStreamDemo1() {
        try {
            File file = new File("test.txt");  //创建文件对象
            //使用文件对象创建文件输入流对象，相当于打开文件
            FileInputStream fis = new FileInputStream(file);
            for (int i = 0; i < file.length(); i++) {
                char ch = (char) (fis.read());  //循环读取字符
                System.out.print(ch);
            }
            System.out.println();
            fis.close();     //关闭流
        } catch (FileNotFoundException fnfe) {
            System.out.println("文件打开失败。");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void FileInputStreamDemo2() {
        try {
            File file = new File("test.txt");  //创建文件对象
            FileInputStream fis = new FileInputStream(file);
            //根据文件的字节长度创建字节数组
            byte[] buf = new byte[(int) (file.length())];
            fis.read(buf);  //读取文件中的数据存放到字节数组中
            String str = new String(buf);  //利用字节数组创建字符串
            System.out.println(str);   //打印字符串
            fis.close();     //关闭流
        } catch (FileNotFoundException fnfe) {
            System.out.println("文件打开失败。");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void FileOutputStreamDemo1() throws IOException {
        String str = "Hello world!";
        File file = new File("test.txt");  //创建文件对象
        //通过文件对象创建文件输出流对象
        //附加第二个参数true，指定进行文件追加，默认为不追加
        FileOutputStream fos = new FileOutputStream(file, true);

        //逐个将字符写入到文件中
        for (int i = 0; i < str.length(); i++) {
            fos.write(str.charAt(i));
        }
        fos.close();    //关闭流
    }

    public static void FileOutputStreamDemo2() throws Exception {
        String str = "I Love Java";
        //通过文件名创建文件输出流对象
        FileOutputStream fos = new FileOutputStream("test.txt");

        //将字符串转化为字节数组
        byte[] buffer = str.getBytes();
        //将字节数组中包含的数据一次性写入到文件中
        fos.write(buffer);
        //关闭流
        fos.close();
    }

    public static void CopyFileDemo() throws IOException {
        File srcFile = new File("src.dat");    //源文件对象
        File destFile = new File("dest.dat");  //目标文件对象
        if (!(destFile.exists())) {  //判断目标文件是否存在
            destFile.createNewFile();  //如果不存在则创建新文件
        }
        //使用源文件对象创建文件输入流对象
        FileInputStream fis = new FileInputStream(srcFile);
        //使用目标文件对象创建文件输出流对象
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] buf = new byte[1024];  //创建字节数组，作为临时缓冲
        System.out.println("开始复制文件...");
        while (fis.read(buf) != -1) {  //循环从文件输入流中读取数据
            fos.write(buf);    //写入到文件输出流中
        }
        System.out.println("文件复制成功！");
        fis.close();    //关闭流
        fos.close();
    }
}
