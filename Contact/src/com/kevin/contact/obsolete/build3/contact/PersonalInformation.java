/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build3.contact;

/**
 * @Program
 * @ClassName PersonalInformation
 * @Description TODO
 * @Author Kevin KDA
 * @Date 2019-10-03 22:19
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class PersonalInformation extends People {
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
