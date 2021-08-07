/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200217.entity;

import java.util.Date;

/**
 * @author Kevin KDA on 2020/2/17 14:26
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200217.entity
 * @classname Vitae
 * @description TODO
 * @interface/enum
 */
public class Vitae extends PersonalInformation {
    private String strPhone;
    private String strQq;
    private String strWeChat;
    private String strEmail;
    private String strLearnExp;
    private String strProjExp;
    private String strMajor;

    public Vitae(String strName, String strSex, int intHeight, Date dateBirth, String strPhone,
                 String strQq, String strWeChat, String strEmail, String strLearnExp, String strProjExp,
                 String strMajor) {
        super(strName, strSex, intHeight, dateBirth);
        this.strPhone = strPhone;
        this.strQq = strQq;
        this.strWeChat = strWeChat;
        this.strEmail = strEmail;
        this.strLearnExp = strLearnExp;
        this.strProjExp = strProjExp;
        this.strMajor = strMajor;
    }

    public String getStrPhone() {
        return strPhone;
    }

    public void setStrPhone(String strPhone) {
        this.strPhone = strPhone;
    }

    public String getStrQq() {
        return strQq;
    }

    public void setStrQq(String strQq) {
        this.strQq = strQq;
    }

    public String getStrWeChat() {
        return strWeChat;
    }

    public void setStrWeChat(String strWeChat) {
        this.strWeChat = strWeChat;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrLearnExp() {
        return strLearnExp;
    }

    public void setStrLearnExp(String strLearnExp) {
        this.strLearnExp = strLearnExp;
    }

    public String getStrProjExp() {
        return strProjExp;
    }

    public void setStrProjExp(String strProjExp) {
        this.strProjExp = strProjExp;
    }

    public String getStrMajor() {
        return strMajor;
    }

    public void setStrMajor(String strMajor) {
        this.strMajor = strMajor;
    }
}
