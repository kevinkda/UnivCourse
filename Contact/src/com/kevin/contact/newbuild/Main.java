/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild;

import com.kevin.contact.newbuild.connecter.RelationshipType;
import com.kevin.contact.newbuild.contact.Contact;
import com.kevin.contact.newbuild.management.ManageControl;
import com.kevin.contact.newbuild.management.UserView;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/10/24 12:43
 * @version 5.1
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild
 * @classname Main
 * @description TODO 程序入口类，提供部分测试方法，用于导入数据和测试
 * @interface/enum Serializable
 */
public class Main implements Serializable {
    /**
     * Serializable参数
     */
    private static final long serialVersionUID = -5542151638731493989L;

    /**
     * @param [args]
     * @throws
     * @author Kevin KDA on 2019/10/24 13:17
     * @description Main / main TODO
     * @returns void
     */
    public static void main(String[] args) throws Exception {
        Scanner scaScan = new Scanner(System.in);
//        Login login = new Login(scaScan);
        ManageControl manageControl = new ManageControl();
        manageControl.readData();
//        testA(scaScan, manageControl);
        UserView viewInterface = new UserView(scaScan, manageControl);
//        testC();
//        testB();
//        testD();
//        testE();
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 20:08
     * @description Main / testE TODO 测试加密解密
     * @returns void
     */
    private static void testE() {
        String data = "ABCDEFG";
        String result = encode(data);
        System.out.println("加密后:" + result);
        //解密
        String str = decode(result);
        System.out.println("解密后:" + str);


        //加密中文
        data = "1234567890";
        result = encode(data);
        System.out.println("加密后:" + result);
        String str1 = decode(result);
        System.out.println("解密后:" + str1);
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 19:27
     * @description Main / testD TODO 测试ObjectInputStream
     * @returns void
     */
    private static void testD() throws Exception {
        ArrayList<Contact> list1 = new ArrayList<Contact>();
        list1.add(new Contact("张三", "23"));
        list1.add(new Contact("李四", "24"));
        list1.add(new Contact("王五", "25"));
        list1.add(new Contact("赵六", "26"));
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("record.txt"));
//        os.writeObject(list1);
        for (
                Contact student : list1) {
//            System.out.println(student);
            os.writeObject(student);
        }
        System.out.println("集合对象写入到文件成功！");
        os.close();
        ObjectInputStream osi = new ObjectInputStream(new FileInputStream("record.txt"));
        ArrayList<Contact> list2 = (ArrayList<Contact>) osi.readObject();

        System.out.println("从磁盘读取到的集合遍历结果");
        for (
                Contact student : list2) {
//            System.out.println(student);
            student.getContactData();
        }
        osi.close();
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 19:26
     * @description Main / testC TODO 测试ObjectInputStream
     * @returns void
     */
    private static void testC() throws Exception {
        Contact s1 = new Contact("张三", "23");
        Contact s2 = new Contact("李四", "24");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./Contact/resource/record.txt"));
        os.writeObject(s1);
        os.writeObject(s2);
        os.close();

    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 19:26
     * @description Main / testB TODO 测试ObjectInputStream
     * @returns void
     */
    private static void testB() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./Contact/resource/record.txt"));
        Contact s1 = (Contact) ois.readObject();
        Contact s2 = (Contact) ois.readObject();
        System.out.println(s1.getStrName());
        System.out.println(s2);
        ois.close();
    }

    /**
     * @param [scaScan, manageControl]
     * @throws
     * @author Kevin KDA on 2019/10/24 19:25
     * @description Main / testA TODO 用于在程序启动时自动添加数据，方便测试
     * @returns void
     */
    private static void testA(Scanner scaScan, ManageControl manageControl) {
//        manageControl.setRelation(scaScan, new Contact());
//        RelationshipType.values();
        manageControl.createDataItem(
                new Contact(
                        "王俊凯",
                        0,
                        182,
                        "17607130921",
                        "北京市海淀区中关村",
                        RelationshipType.Family,
                        "Haha"
                )
        );
        manageControl.createDataItem(
                new Contact(
                        "jkhk",
                        0,
                        182,
                        "2987591",
                        "shkgaldg",
                        RelationshipType.Classmate,
                        "Wuhan"
                )
        );
        manageControl.createDataItem(
                new Contact(
                        "dsjhg",
                        0,
                        182,
                        "135879",
                        "sdjog",
                        RelationshipType.BusinessRelated,
                        "ssgnui"
                )
        );
        manageControl.createDataItem(
                new Contact(
                        "sgjl",
                        0,
                        182,
                        "23508",
                        "sdgjhknvj"
                )
        );
        manageControl.createDataItem(
                new Contact(
                        "sds156",
                        0,
                        182,
                        "+1 16516",
                        "kjhbkl"
                )
        );
    }

    /**
     * @param [data]
     * @throws
     * @author Kevin KDA on 2019/10/24 20:18
     * @description Main / encode TODO 加密 在原有的基础上*2后+1
     * @returns java.lang.String
     */
    public static String encode(String data) {
        //把字符串转为字节数组
        byte[] b = data.getBytes();
        //遍历
        for (int i = 0; i < b.length; i++) {
            //在原有的基础上*2后+1
            b[i] = (byte) (b[i] * 2 + 1);
        }
        return new String(b);
    }

    /**
     * @param [data]
     * @throws
     * @author Kevin KDA on 2019/10/24 20:17
     * @description Main / decode TODO 解密 在原有的基础上-1后/2
     * @returns java.lang.String
     */
    public static String decode(String data) {
        //把字符串转为字节数组
        byte[] b = data.getBytes();
        //遍历
        for (int i = 0; i < b.length; i++) {
            //在原有的基础上-1后/2
            b[i] = (byte) ((b[i] - 1) / 2);
        }
        return new String(b);
    }


}
