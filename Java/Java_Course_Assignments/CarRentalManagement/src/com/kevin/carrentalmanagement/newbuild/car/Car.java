/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild.car;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.carrentalmanagement.newbuild.car
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/11 9:36
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Car extends CarState {
    public double calcRent(int days) {
        return 0;
    }

    protected static ArrayList<Car> carArrayList = new ArrayList<Car>();

    public Car() {
    }

    public Car(int intCarState) {
        super(intCarState);
    }

    public Car(String strSn, String strBrand, int intCarState) {
        super(strSn, strBrand, intCarState);
    }

    public Car(int intCarState, Date dateOutTime) {
        super(intCarState, dateOutTime);
    }

    public Car(String strSn, String strBrand, int intCarState, Date dateOutTime) {
        super(strSn, strBrand, intCarState, dateOutTime);
    }

    public void createCar() {

    }

    public void getContactData() {
        System.out.println("\t"+getStrSn()+"\t\t"+getStrBrand()+"\t\t\t"+stateTranslation(getIntCarState()));
    }
    protected String stateTranslation(int intCarState){
        switch(getIntCarState()){
            case 0:
                return "可借";
            case 1:
                return "已借出";
            case 2:
                return "损坏";
            case 3:
                return "维修";
            case 4:
                return "报废";
        }
        return "";
    }
}
