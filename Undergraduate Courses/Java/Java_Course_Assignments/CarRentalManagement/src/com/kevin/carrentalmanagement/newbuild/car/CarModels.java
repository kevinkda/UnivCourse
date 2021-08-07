/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild.car;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.carrentalmanagement.newbuild.car
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/11 9:10
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class CarModels extends Brand {
    private int intNumberOfSeats;
    private String strModel;
//    private String strNumberPlate;

    public CarModels() {
    }

    public CarModels(String strSn, String strBrand) {
        super(strSn, strBrand);
    }

    public CarModels(String strSn, String strBrand, int intNumberOfSeats, String strModel) {
        super(strSn, strBrand);
        this.intNumberOfSeats = intNumberOfSeats;
        this.strModel = strModel;
    }

    public int getIntNumberOfSeats() {
        return intNumberOfSeats;
    }

    public void setIntNumberOfSeats(int intNumberOfSeats) {
        this.intNumberOfSeats = intNumberOfSeats;
    }
}
