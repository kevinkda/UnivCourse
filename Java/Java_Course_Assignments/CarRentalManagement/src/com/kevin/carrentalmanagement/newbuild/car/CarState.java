/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild.car;

import java.util.Date;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.carrentalmanagement.newbuild.car
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/10/11 9:19
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class CarState extends Brand {
    /**
     * 0.可借    1.已借出   2.损坏    3.维修    4.报废
     */
    private int intCarState;
    /**
     * 借出时间
     */
    private Date dateOutTime;

    public CarState() {
    }

    public CarState(int intCarState) {
        this.intCarState = intCarState;
    }

    public CarState(String strSn, String strBrand, int intCarState) {
        super(strSn, strBrand);
        this.intCarState = intCarState;
    }

    public CarState(int intCarState, Date dateOutTime) {
        this.intCarState = intCarState;
        this.dateOutTime = dateOutTime;
    }

    public CarState(String strSn, String strBrand, int intCarState, Date dateOutTime) {
        super(strSn, strBrand);
        this.intCarState = intCarState;
        this.dateOutTime = dateOutTime;
    }

    public int getIntCarState() {
        return intCarState;
    }

    public void setIntCarState(int intCarState) {
        this.intCarState = intCarState;
    }

    public Date getDateOutTime() {
        return dateOutTime;
    }

    public void setDateOutTime(Date dateOutTime) {
        this.dateOutTime = dateOutTime;
    }
}
