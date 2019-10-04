/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild;

import com.kevin.contact.newbuild.connector.RelationshipType;
import com.kevin.contact.newbuild.contact.Contact;

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
public class Main {
    public static void main(String[] args) {
        Scanner scaScan = new Scanner(System.in);
        ContactManage contactManage = new ContactManage();
        testa(scaScan, contactManage);
        UserView viewInterface = new UserView(scaScan, contactManage);
    }

    private static void testa(Scanner scaScan, ContactManage contactManage) {
//        contactManage.setRelation(scaScan, new Contact());
//        RelationshipType.values();
        contactManage.createContact(
                new Contact(
                        "王俊凯",
                        0,
                        182,
                        "17607130921",
                        "北京市海淀区中关村",
                        RelationshipType.Family,
                        "Baby"
                )
        );
        contactManage.createContact(
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
        contactManage.createContact(
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
        contactManage.createContact(
                new Contact(
                        "sgjl",
                        0,
                        182,
                        "23508",
                        "sdgjhknvj"
                )
        );
    }
}