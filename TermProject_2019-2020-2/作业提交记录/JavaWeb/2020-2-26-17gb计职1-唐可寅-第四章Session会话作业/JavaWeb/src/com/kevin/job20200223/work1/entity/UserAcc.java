/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200223.work1.entity;

/**
 * @author Kevin KDA on 2020/2/21 19:46
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200223.work1.entity
 * @classname UserAcc
 * @description TODO
 * @interface/enum
 */
public class UserAcc {
    private String strUserAccount;
    private String strUserPassword;
    private String strUserQq;
    private String strUserAddress;
    private int intUserSex;

    public UserAcc(String strUserAccount, String strUserPassword, String strUserQq) {
        this.strUserAccount = strUserAccount;
        this.strUserPassword = strUserPassword;
        this.strUserQq = strUserQq;
    }

    public UserAcc(String strUserAccount, String strUserPassword, String strUserQq,
                   String strUserAddress, String intUserSex) {
        this.strUserAccount = strUserAccount;
        this.strUserPassword = strUserPassword;
        this.strUserQq = strUserQq;
        this.strUserAddress = strUserAddress;
        setStringSex(intUserSex);
    }

    public String getStrUserAccount() {
        return strUserAccount;
    }

    public void setStrUserAccount(String strUserAccount) {
        this.strUserAccount = strUserAccount;
    }

    public String getStrUserPassword() {
        return strUserPassword;
    }

    public void setStrUserPassword(String strUserPassword) {
        this.strUserPassword = strUserPassword;
    }

    public String getStrUserQq() {
        return strUserQq;
    }

    public void setStrUserQq(String strUserQq) {
        this.strUserQq = strUserQq;
    }

    public String getStrUserAddress() {
        return strUserAddress;
    }

    public void setStrUserAddress(String strUserAddress) {
        this.strUserAddress = strUserAddress;
    }

    public int getIntUserSex() {
        return intUserSex;
    }

    public void setIntUserSex(int intUserSex) {
        this.intUserSex = intUserSex;
    }

    /**
     * @param
     * @return String:返回文字化的性别数据
     * @author Kevin KDA on 2020/2/17 14:26
     * @description PersonalInformation /  TODO 对已清洗的性别数据进行可视化，使人能理解
     */
    public String getStringSex() {
        return intUserSex == 1 ? "男" : "女";
    }

    /**
     * @param strSex: 提供文字化性别数据
     * @return void
     * @author Kevin KDA on 2020/2/17 14:26
     * @description PersonalInformation /  TODO 将文字化性别数据转化为0(女)、1(男)，确保数据统一
     */
    public void setStringSex(String strSex) {
        if ("男".equals(strSex)) {
            this.intUserSex = 1;
        } else {
            this.intUserSex = 0;
        }
    }
}
