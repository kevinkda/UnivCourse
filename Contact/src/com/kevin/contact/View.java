/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact;

import java.util.Objects;
import java.util.Scanner;

/**
 * @Project Contact
 * @Package com.kevin.contact
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 10:29
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class View {
    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:02
     * @Description //TODO
     * @Param  * @param scaScan
     * @param contactManage
     * @Return
     */
    public View(Scanner scaScan, ContactManage contactManage) {
        View(scaScan, contactManage);
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:01
     * @Description //TODO
     * @Param  * @param scaScan
     * @param contactManage
     * @Return void
     */
    public void View(Scanner scaScan, ContactManage contactManage) {
        mainMenu();
        selectionFunction(scaScan, contactManage);
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 13:19
     * @Description //TODO
     * @Param  * @param
     * @Return void
     */
    private void mainMenu(){
        System.out.println("\n\n\t\t\t通讯录\n===============================");
        System.out.println("1.查看");
        System.out.println("2.添加");
        System.out.println("3.删除");
        System.out.println("4.查找");
        System.out.println("5.修改");
        System.out.println("6.退出");
        System.out.print("请选择需要执行的指令:");
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:11
     * @Description //TODO
     * @Param  * @param scaScan
     * @param contactManage
     * @Return void
     */
    void selectionFunction(Scanner scaScan, ContactManage contactManage){
        switch (scaScan.nextInt()) {
            default:
//				throw new IllegalStateException("Unexpected value: " + SC.nextInt());
                System.out.print("\n输入错误，请重新输入\n");
                View(scaScan, contactManage);
            case 1:
                if (contactManage.showAllData() == 1) {
                    View(scaScan, contactManage);
                }
                View(scaScan, contactManage);
                break;
            case 2:
                String strCheck;
                do {
                    contactManage.createContact(scaScan);
                    System.out.print("是否继续添加(Y/N:)");
                    strCheck = scaScan.next();
//				}while ((strCheck == "Y") ||(strCheck == "y"));
//				}while (Objects.equals(strCheck, "Y"));
                }while (Objects.equals(strCheck, "Y") || Objects.equals(strCheck, "y"));
                View(scaScan, contactManage);
                break;
            case 3:
                contactManage.deleteData(scaScan);
                View(scaScan, contactManage);
                break;
            case 4:
                contactManage.searchData(scaScan);
                View(scaScan, contactManage);
                break;
            case 5:
                contactManage.changeDataView(scaScan);
                View(scaScan, contactManage);
                break;
            case 6:
                System.exit(-1);
                break;
        }
    }
}
