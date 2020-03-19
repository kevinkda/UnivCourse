package com.kevin.job20200319.bookmanager.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/3/19 12:15
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.pojo
 * @classname Account
 * @description 用户信息
 * @interface/enum Serializable, Comparable<Account>
 */
public class Account implements Serializable, Comparable<Account> {
    private static final long serialVersionUID = 42L;
    /**
     * 用户UID
     */
    private int intUserId;
    /**
     * 用户名
     */
    private String strUserName;
    /**
     * 用户密码
     */
    private String strUserPass;
    /**
     * 账户余额
     */
    private double douBalance;
    /**
     * 状态0禁用1启用
     */
    private int intUserStatus;
    /**
     * 注册时间
     */
    private Date dateRegTime;
    /**
     * 最后一次登录时间
     */
    private Date dateLastLoginTime;
    /**
     * 最后一次登录IP
     */
    private String strLastLoginIp;

    @Override
    public int compareTo(Account o) {
        return this.intUserId - o.intUserId;
    }

    public Account() {
    }

    private Account(String strUserName, String strUserPass) {
        this.strUserName = strUserName;
        this.strUserPass = strUserPass;
    }

    public Account(int intUserId, String strUserName, String strUserPass) {
        this.intUserId = intUserId;
        this.strUserName = strUserName;
        this.strUserPass = strUserPass;
        this.dateRegTime = new Date();
        this.douBalance = 0;
    }

    public Account(int intUserId, String strUserName, String strUserPass, Date dateRegTime, double douBalance) {
        this.intUserId = intUserId;
        this.strUserName = strUserName;
        this.strUserPass = strUserPass;
        this.dateRegTime = dateRegTime;
        this.douBalance = douBalance;
    }

    public int getIntUserId() {
        return intUserId;
    }

    public void setIntUserId(int intUserId) {
        this.intUserId = intUserId;
    }

    public String getStrUserName() {
        return strUserName;
    }

    public void setStrUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getStrUserPass() {
        return strUserPass;
    }

    public void setStrUserPass(String strUserPass) {
        this.strUserPass = strUserPass;
    }

    public double getDouBalance() {
        return douBalance;
    }

    public void setDouBalance(double douBalance) {
        this.douBalance = douBalance;
    }

    public int getIntUserStatus() {
        return intUserStatus;
    }

    public void setIntUserStatus(int intUserStatus) {
        this.intUserStatus = intUserStatus;
    }

    public Date getDateRegTime() {
        return dateRegTime;
    }

    public void setDateRegTime(Date dateRegTime) {
        this.dateRegTime = dateRegTime;
    }

    public Date getDateLastLoginTime() {
        return dateLastLoginTime;
    }

    public void setDateLastLoginTime(Date dateLastLoginTime) {
        this.dateLastLoginTime = dateLastLoginTime;
    }

    public String getStrLastLoginIp() {
        return strLastLoginIp;
    }

    public void setStrLastLoginIp(String strLastLoginIp) {
        this.strLastLoginIp = strLastLoginIp;
    }
}
