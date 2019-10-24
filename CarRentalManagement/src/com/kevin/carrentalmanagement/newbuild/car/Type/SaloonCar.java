/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild.car.Type;

import com.kevin.carrentalmanagement.newbuild.car.Car;

import java.util.Date;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.carrentalmanagement.newbuild.car.Type
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/11 9:42
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class SaloonCar extends Car {
    private int intNumberOfSeats;
    private String strModel;
    private double douUnitOfTheRent = 400;

    @Override
    public double calcRent(int intDays) {
        return intDays*douUnitOfTheRent;
    }

    public SaloonCar() {
    }

    public SaloonCar(int intNumberOfSeats, String strModel) {
        this.intNumberOfSeats = intNumberOfSeats;
        this.strModel = strModel;
    }

    public SaloonCar(int intNumberOfSeats) {
        this.intNumberOfSeats = intNumberOfSeats;
    }

    public SaloonCar(int intCarState, int intNumberOfSeats) {
        super(intCarState);
        this.intNumberOfSeats = intNumberOfSeats;
    }

    public SaloonCar(String strSn, String strBrand, int intCarState, int intNumberOfSeats) {
        super(strSn, strBrand, intCarState);
        this.intNumberOfSeats = intNumberOfSeats;
    }

    public SaloonCar(int intCarState, Date dateOutTime, int intNumberOfSeats) {
        super(intCarState, dateOutTime);
        this.intNumberOfSeats = intNumberOfSeats;
    }

    public SaloonCar(String strSn, String strBrand, int intCarState, Date dateOutTime, int intNumberOfSeats) {
        super(strSn, strBrand, intCarState, dateOutTime);
        this.intNumberOfSeats = intNumberOfSeats;
    }

    public SaloonCar(int intCarState, int intNumberOfSeats, String strModel) {
        super(intCarState);
        this.intNumberOfSeats = intNumberOfSeats;
        this.strModel = strModel;
    }

    public SaloonCar(String strSn, String strBrand, int intCarState, int intNumberOfSeats, String strModel) {
        super(strSn, strBrand, intCarState);
        this.intNumberOfSeats = intNumberOfSeats;
        this.strModel = strModel;
    }

    public SaloonCar(int intCarState, Date dateOutTime, int intNumberOfSeats, String strModel) {
        super(intCarState, dateOutTime);
        this.intNumberOfSeats = intNumberOfSeats;
        this.strModel = strModel;
    }

    public SaloonCar(String strSn, String strBrand, int intCarState, Date dateOutTime, int intNumberOfSeats, String strModel) {
        super(strSn, strBrand, intCarState, dateOutTime);
        this.intNumberOfSeats = intNumberOfSeats;
        this.strModel = strModel;
    }

    public int getIntNumberOfSeats() {
        return intNumberOfSeats;
    }

    public void setIntNumberOfSeats(int intNumberOfSeats) {
        this.intNumberOfSeats = intNumberOfSeats;
    }

    public String getStrModel() {
        return strModel;
    }

    public void setStrModel(String strModel) {
        this.strModel = strModel;
    }

}
