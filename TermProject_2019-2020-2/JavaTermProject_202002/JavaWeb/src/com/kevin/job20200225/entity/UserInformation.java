/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.entity;

/**
 * @author Kevin KDA on 2020/2/25 14:17
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.entity
 * @classname UserInformation
 * @description TODO
 * @interface/enum
 */
public class UserInformation {
    private String strPersonName;
    private String strPersonBirth;
    private String strPersonPhone;
    private String strPersonAddress;
    private String strUserQq;
    private int intPersonSex;

    public UserInformation() {
    }

    public UserInformation(String strPersonName, String strPersonBirth, String strPersonPhone,
                           String strPersonAddress, String strUserQq, int intPersonSex) {
        this.strPersonName = strPersonName;
        this.strPersonBirth = strPersonBirth;
        this.strPersonPhone = strPersonPhone;
        this.strPersonAddress = strPersonAddress;
        this.strUserQq = strUserQq;
        this.intPersonSex = intPersonSex;
    }

    public String getStrPersonName() {
        return strPersonName;
    }

    public void setStrPersonName(String strPersonName) {
        this.strPersonName = strPersonName;
    }

    public String getStrPersonBirth() {
        return strPersonBirth;
    }

    public void setStrPersonBirth(String strPersonBirth) {
        this.strPersonBirth = strPersonBirth;
    }

    public String getStrPersonPhone() {
        return strPersonPhone;
    }

    public void setStrPersonPhone(String strPersonPhone) {
        this.strPersonPhone = strPersonPhone;
    }

    public String getStrPersonAddress() {
        return strPersonAddress;
    }

    public void setStrPersonAddress(String strPersonAddress) {
        this.strPersonAddress = strPersonAddress;
    }

    public String getStrUserQq() {
        return strUserQq;
    }

    public void setStrUserQq(String strUserQq) {
        this.strUserQq = strUserQq;
    }

    public int getIntPersonSex() {
        return intPersonSex;
    }

    public void setIntPersonSex(int intPersonSex) {
        this.intPersonSex = intPersonSex;
    }
}
