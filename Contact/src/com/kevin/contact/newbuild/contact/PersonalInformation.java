/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.contact;

import java.io.Serializable;

/**
 * @author Kevin KDA on 2019/10/24 12:44
 * @version 1.1
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.contact
 * @classname PersonalInformation
 * @description TODO 提供个人私有信息
 * @interface/enum Serializable
 */
public class PersonalInformation extends People implements Serializable {
    /**
     * Serializable参数
     */
    private static final long serialVersionUID = 1578003152914340539L;
    private String strPhone;
    private String strAdd;

    public PersonalInformation() {
    }

    public PersonalInformation(String strName) {
        super(strName);
    }

    public PersonalInformation(String strName, int intSex, int intHeight) {
        super(strName, intSex, intHeight);
    }

    public PersonalInformation(String strName, String strPhone) {
        super(strName);
        this.strPhone = strPhone;
    }

    public PersonalInformation(String strName, String strPhone, String strAdd) {
        super(strName);
        this.strPhone = strPhone;
        this.strAdd = strAdd;
    }

    public PersonalInformation(String strName, int intSex, int intHeight, String strPhone, String strAdd) {
        super(strName, intSex, intHeight);
        this.strPhone = strPhone;
        this.strAdd = strAdd;
    }

    public String getStrPhone() {
        return strPhone;
    }

    public void setStrPhone(String strPhone) {
        this.strPhone = strPhone;
    }

    public String getStrAdd() {
        return strAdd;
    }

    public void setStrAdd(String strAdd) {
        this.strAdd = strAdd;
    }
}
