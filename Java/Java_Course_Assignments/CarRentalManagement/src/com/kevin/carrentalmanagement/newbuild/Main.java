/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild;

import com.kevin.carrentalmanagement.newbuild.car.Car;

import java.util.Scanner;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.CarRentalManagement
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 11:39
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scaScan = new Scanner(System.in);
        CarManage carManage = new CarManage();
        testA(scaScan,carManage);
        InterfaceView interfaceView = new InterfaceView(carManage, scaScan);
    }

    private static void testA(Scanner scaScan,CarManage carManage) {
        carManage.createCar(
                new Car(
                        "S001","BMW",1
                )
        );
    }
}
