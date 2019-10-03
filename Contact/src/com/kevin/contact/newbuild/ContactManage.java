/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild;

import com.kevin.contact.newbuild.contact.Contact;

import java.util.ArrayList;

/**
 * @Program
 * @ClassName ContactManage
 * @Description TODO
 * @Author Kevin KDA
 * @Date 2019-10-03 22:25
 * @Interface
 * @Enum
 * @Modified By
 * @Version 1.0
 * @University HBUT
 * @Administrative Class 17GB CST 3
 */
public class ContactManage extends Contact {
    static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

    public ContactManage() {
    }

    public ContactManage(String strName) {
        super(strName);
    }

    public ContactManage(String strName, int intSex, int intHeight) {
        super(strName, intSex, intHeight);
    }

    public ContactManage(String strName, String strPhone) {
        super(strName, strPhone);
    }

    public ContactManage(String strName, String strPhone, String strAdd) {
        super(strName, strPhone, strAdd);
    }

    public ContactManage(String strName, int intSex, int intHeight, String strPhone, String strAdd) {
        super(strName, intSex, intHeight, strPhone, strAdd);
    }
}
