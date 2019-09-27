/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Project Contact
 * @Package com.kevin.contact
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 9:44
 * @Interface
 * @Enum
 * @Version 1.2
 */
public class OldMain {
//    private static final Set<String> STR_CHECKS = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("Y", "y")));
//    private static final Set<String> STR_CHECKS1 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("Y", "y")));

    static ArrayList<Contact> contactArrayListlist = new ArrayList<Contact>();

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 10:12
     * @Description //TODO
     * @Param  * @param args
     * @Return void
     */
    public void viewMain() {
        // TODO Auto-generated method stub
        Scanner scannerSC = new Scanner(System.in);
        voidMainInterface(scannerSC);
//		createContact(SC);
//		showAllData();
//		int i=0;
//		do {
//			System.out.println(i);
//			i++;
//		}while (i<100);
    }

    /**
     //     * Title
     //     * @Author Kevin KDA
     //     * @Date 2019-09-18 10:56
     //     * @Description //TODO
     //     * @Param  * @param
     //     * @Return void
     //     * @param scannerSC
     //     */
    private static void voidMainInterface(Scanner scannerSC) {
        System.out.println("\n\n\t\t\t通讯录\n===============================");
        System.out.println("1.查看");
        System.out.println("2.添加");
        System.out.println("3.删除");
        System.out.println("4.修改");
        System.out.println("5.退出");
        System.out.print("请选择需要执行的指令:");
        switch (scannerSC.nextInt()) {
            default:
//				throw new IllegalStateException("Unexpected value: " + SC.nextInt());
                System.out.print("\n输入错误，请重新输入\n");
                voidMainInterface(scannerSC);
            case 1:showAllData();
                voidMainInterface(scannerSC);
                break;
            case 2:
                String strCheck;
                do {
                    createContact(scannerSC);
                    System.out.print("是否继续添加(Y/N:)");
                    strCheck = scannerSC.next();
//				}while ((strCheck == "Y") ||(strCheck == "y"));
//				}while (Objects.equals(strCheck, "Y"));
                }while (Objects.equals(strCheck, "Y") || Objects.equals(strCheck, "y"));
                voidMainInterface(scannerSC);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(-1);
                break;
        }
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-18 11:14
     * @Description //TODO
     * @Param  * @param
     * @Return void
     */
    private static void showAllData() {
        System.out.println("");
        System.out.println("***************************************************************");
        System.out.println("");
        System.out.println("系统中存在的联系人如下：");
//		System.out.println("姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t地址");
        System.out.println("姓名\t\t性别\t\t身高\t\t手机号\t\t\t地址");

        int intCount = 0;

        for (Contact DataA:contactArrayListlist) {
            DataA.showValue();
            intCount++;
        }
        System.out.println("系统中共存在 "+ Integer.toString(intCount) +" 位联系人");
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-18 11:15
     * @Description //TODO
     * @Param  * @param SC
     * @Return void
     */
    private static void createContact(Scanner scannerSC){
        Contact Data = new Contact();
//		Scanner SC = new Scanner(System.in);

//		System.out.print("请输入需要录入的联系人数量：");
//		int intContactNum = SC.nextInt();
        int intContactNum = 1;
        System.out.println("（在数据输入时请注意将光标移至最后，已知在MyEclipse中不移动输入位置可能会出现异常，IDEA中验证正常）");
        System.out.println("\n\n\t\t\t添加好友\n-------------------------------");


        for (int i = 0; i < intContactNum; i++) {
            System.out.print("请输入姓名：");
            Data.setStrName(scannerSC.next());
//			Data.setStrName("王俊凯");
            System.out.print("请输入性别（请输入0男或1女）：");
            Data.setIntSex(scannerSC.nextInt());
//			Data.setIntSex(SC.next()=="男"?0:1);
//			Data.setIntSex(0);
            System.out.print("请输入手机号：");
            Data.setStrPhone(scannerSC.next());
//			Data.setStrPhone("13012345678");
            System.out.print("请输入地址：");
            Data.setStrAdd(scannerSC.next());
//			Data.setStrAdd("北京市海淀区中关村");
            System.out.print("请输入身高：");
            Data.setIntHeight(scannerSC.nextInt());
//			Data.setIntHeight(182);

//			System.out.println("");
//
//			System.out.println("姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t地址");
//			Data.showValue();
            contactArrayListlist.add(Data);
        }
    }
}

