/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.contact;

/**
 * @Program
 * @ClassName Contact
 * @Description TODO
 * @Author Kevin KDA
 * @Date 2019-10-03 22:23
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class Contact extends PersonalInformation {
    public Contact() {
    }

    public Contact(String strName) {
        super(strName);
    }

    public Contact(String strName, int intSex, int intHeight) {
        super(strName, intSex, intHeight);
    }

    public Contact(String strName, String strPhone) {
        super(strName, strPhone);
    }

    public Contact(String strName, String strPhone, String strAdd) {
        super(strName, strPhone, strAdd);
    }

    public Contact(String strName, int intSex, int intHeight, String strPhone, String strAdd) {
        super(strName, intSex, intHeight, strPhone, strAdd);
    }

    enum buddyType{
        Classmate,Family,BusinessRelated
    }
}
