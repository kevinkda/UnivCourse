/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild;

import com.kevin.carrentalmanagement.newbuild.car.Car;
import com.kevin.carrentalmanagement.newbuild.car.Type.Truck;
import com.kevin.carrentalmanagement.newbuild.car.Type.Bus;
import com.kevin.carrentalmanagement.newbuild.car.Type.SaloonCar;

import java.util.Date;
import java.util.Scanner;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.carrentalmanagement.newbuild
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/11 9:05
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class CarManage extends Car {
    @Override
    public double calcRent(int days) {
        return 0;
    }

    public CarManage() {
    }

    public CarManage(int intCarState) {
        super(intCarState);
    }

    public CarManage(String strSn, String strBrand, int intCarState) {
        super(strSn, strBrand, intCarState);
    }

    public CarManage(int intCarState, Date dateOutTime) {
        super(intCarState, dateOutTime);
    }

    public CarManage(String strSn, String strBrand, int intCarState, Date dateOutTime) {
        super(strSn, strBrand, intCarState, dateOutTime);
    }

    public void createCar(Car car) {
        carArrayList.add(car);
    }

    public void createContact(Car car) {
        carArrayList.add(car);
    }

    public void createCar(Scanner scaScan) {
        System.out.println("（在数据输入时请注意将光标移至最后，已知在MyEclipse中不移动输入位置可能会出现异常，IDEA中验证正常）");
        System.out.println("1.Bus\n2.SaloonCar\n3.Truck");
        System.out.print("请选择需要创建的汽车类型:");
        switch (scaScan.nextInt()) {
            case 1:
                Car car = new Bus();
                break;
            case 2:
                Car car1 = new SaloonCar();
                break;
            case 3:
                Car car2 = new Truck();
                break;
            default:
                System.out.println("输入错误");
        }
    }

    public void create(Scanner scaScan, Car car) {
        System.out.println("\n\n\t\t\t添加好友\n-------------------------------");
        System.out.print("请输入车辆SN:");
        car.setStrSn(scaScan.next());
        System.out.print("请输入车辆品牌:");
        car.setStrBrand(scaScan.next());
        System.out.print("请输入车辆状态:");
        car.setIntCarState(scaScan.nextInt());
        carArrayList.add(car);
    }

    public int showAllData() {
        System.out.println("\n***************************************************************");
        if (carArrayList.isEmpty()) {
            System.out.println("车辆信息为空\n请插入信息后再试");
            return 1;
        }

        int intCount = 0;
        System.out.println("\n系统中存在的联系人如下：");
//        System.out.println("序号\t\tSN\t\t\tBrand\t\t状态\t\t手机号\t\t\t\t地址");
        System.out.println("序号\t\tSN\t\t\tBrand\t\tState");
        for (Car car : carArrayList) {
            System.out.print(++intCount + "\t\t");
            car.getContactData();
        }
        System.out.println("\n系统中共存在 " + carArrayList.size() + " 位联系人");
        return 0;
    }
}
