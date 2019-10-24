/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build4;

import com.kevin.contact.obsolete.build4.connector.RelationshipType;
import com.kevin.contact.obsolete.build4.contact.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Program
 * @ClassName Main
 * @Description TODO 提供主程序接口
 * @Author Kevin KDA
 * @Date 2019-10-03 22:08
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class Main implements Serializable {
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
    }

    private static final long serialVersionUID = 1L;

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

    private static void testC() throws Exception {
        Contact s1 = new Contact("张三", "23");
        Contact s2 = new Contact("李四", "24");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("./Contact/resource/record.txt"));
        os.writeObject(s1);
        os.writeObject(s2);
        os.close();

    }

    private static void testB() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./Contact/resource/record.txt"));
        Contact s1 = (Contact) ois.readObject();
        Contact s2 = (Contact) ois.readObject();
        System.out.println(s1.getStrName());
        System.out.println(s2);
        ois.close();
    }

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
}