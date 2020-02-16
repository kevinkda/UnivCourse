/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild;

import java.util.Scanner;

/**
 * The type Interface view.
 *
 * @Project Java_Course_Assignments
 * @Package com.kevin.CarRentalManagement
 * @Author Kevin KDA
 * @Description TODO Interface View
 * @Date 2019 /9/27 11:31
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class InterfaceView {
    /**
     * Instantiates a new Interface view.
     */
    public InterfaceView() {
    }

    /**
     * Instantiates a new Interface view.
     *
     * @param scaScan the sca scan
     */
    public InterfaceView(CarManage carManage, Scanner scaScan) {
        interfaceView(scaScan, carManage);
    }

    public void interfaceView(Scanner scaScan, CarManage carManage) {
        mainMenu();
        selectionFunction(scaScan, carManage);
    }

    private void mainMenu() {
        System.out.println("\n\n\t\t汽车租赁系统\n===============================");
        System.out.println("1.查看");
        System.out.println("2.添加");
        System.out.println("3.删除");
        System.out.println("4.查找");
        System.out.println("5.修改");
        System.out.println("0.退出");
        System.out.print("请选择需要执行的指令:");
    }

    void selectionFunction(Scanner scaScan, CarManage carManage) {
        switch (scaScan.nextInt()) {
            default:
                System.out.print("\n输入错误，请重新输入\n");
                interfaceView(scaScan, carManage);
            case 0:
                System.exit(-1);
                break;
            case 1:
                if (carManage.showAllData() == 1) {
                    interfaceView(scaScan, carManage);
                }
                interfaceView(scaScan, carManage);
                break;
            case 2:
                String strCheck;
                do {
                    carManage.createCar(scaScan);
                    System.out.print("是否继续添加(Y/N:)");
                    strCheck = scaScan.next();
                } while ("Y".equals(strCheck) || "y".equals(strCheck));
                interfaceView(scaScan, carManage);
                break;
            case 3:
//                carManage.deleteData(scaScan);
                interfaceView(scaScan, carManage);
                break;
            case 4:
//                carManage.searchData(scaScan);
                interfaceView(scaScan, carManage);
                break;
            case 5:
//                carManage.changeDataView(scaScan);
                interfaceView(scaScan, carManage);
                break;
        }
    }
}
