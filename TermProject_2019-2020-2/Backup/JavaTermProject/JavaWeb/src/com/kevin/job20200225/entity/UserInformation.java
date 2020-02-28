/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.entity;

/**
 * @author Kevin KDA on 2020/2/24 16:39
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

    public UserInformation(String strPersonName, String strPersonBirth,
                           String strPersonPhone, String strPersonAddress, String strUserQq,
                           String strPersonSex) {
        this.strPersonName = strPersonName;
        this.strPersonBirth = strPersonBirth;
        this.strPersonPhone = strPersonPhone;
        this.strPersonAddress = strPersonAddress;
        this.strUserQq = strUserQq;
        setStringSex(strPersonSex);
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

    /**
     * @param
     * @return String:返回文字化的性别数据
     * @author Kevin KDA on 2020/2/17 14:26
     * @description PersonalInformation / getStringSex TODO 对已清洗的性别数据进行可视化，使人能理解
     */
    public String getStringSex() {
        return intPersonSex == 1 ? "男" : "女";
    }

    /**
     * @param strSex: 提供文字化性别数据
     * @return void
     * @author Kevin KDA on 2020/2/17 14:26
     * @description PersonalInformation / setStringSex TODO 将文字化性别数据转化为0(女)、1(男)，确保数据统一
     */
    public void setStringSex(String strSex) {
        if ("男".equals(strSex)) {
            this.intPersonSex = 1;
        } else {
            this.intPersonSex = 0;
        }
    }
}
