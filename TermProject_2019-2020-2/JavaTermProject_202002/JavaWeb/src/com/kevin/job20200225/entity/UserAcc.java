/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.entity;

import java.util.Date;

/**
 * @author Kevin KDA on 2020/2/25 14:19
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.entity
 * @classname UserAcc
 * @description TODO
 * @interface/enum
 */
public class UserAcc extends UserInformation {
    private String strUserAccount;
    private String strUserPassword;
    private Date dateUserRegistrationTime;
    private String strUserPhone;

    public UserAcc() {
    }

    public UserAcc(String strPersonName, String strPersonBirth, String strPersonPhone, String strPersonAddress, String strUserQq, int intPersonSex) {
        super(strPersonName, strPersonBirth, strPersonPhone, strPersonAddress, strUserQq, intPersonSex);
    }

    public UserAcc(String strUserAccount, String strUserPassword) {
        this.strUserAccount = strUserAccount;
        this.strUserPassword = strUserPassword;
    }

    public UserAcc(String strPersonName, String strPersonBirth, String strPersonPhone, String strPersonAddress, String strUserQq, int intPersonSex, String strUserAccount, String strUserPassword) {
        super(strPersonName, strPersonBirth, strPersonPhone, strPersonAddress, strUserQq, intPersonSex);
        this.strUserAccount = strUserAccount;
        this.strUserPassword = strUserPassword;
    }

    public UserAcc(String strUserAccount, String strUserPassword, Date dateUserRegistrationTime, String strUserPhone) {
        this.strUserAccount = strUserAccount;
        this.strUserPassword = strUserPassword;
        this.dateUserRegistrationTime = dateUserRegistrationTime;
        this.strUserPhone = strUserPhone;
    }

    public UserAcc(String strPersonName, String strPersonBirth, String strPersonPhone, String strPersonAddress, String strUserQq, int intPersonSex, String strUserAccount, String strUserPassword, Date dateUserRegistrationTime, String strUserPhone) {
        super(strPersonName, strPersonBirth, strPersonPhone, strPersonAddress, strUserQq, intPersonSex);
        this.strUserAccount = strUserAccount;
        this.strUserPassword = strUserPassword;
        this.dateUserRegistrationTime = dateUserRegistrationTime;
        this.strUserPhone = strUserPhone;
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

    public Date getDateUserRegistrationTime() {
        return dateUserRegistrationTime;
    }

    public void setDateUserRegistrationTime(Date dateUserRegistrationTime) {
        this.dateUserRegistrationTime = dateUserRegistrationTime;
    }

    public String getStrUserPhone() {
        return strUserPhone;
    }

    public void setStrUserPhone(String strUserPhone) {
        this.strUserPhone = strUserPhone;
    }
}
