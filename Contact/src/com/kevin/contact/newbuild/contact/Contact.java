/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.contact;

import com.kevin.contact.newbuild.connecter.Encrypt;
import com.kevin.contact.newbuild.connecter.RelationshipType;
import com.kevin.contact.newbuild.management.Login;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2019/10/24 13:02
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.contact
 * @classname Contact
 * @description TODO
 * @interface/enum
 */
public class Contact extends Relationship implements Serializable, Encrypt {
    /**
     * Serializable参数
     */
    private static final long serialVersionUID = -9153343553163052230L;
    /**
     * 程序数据存储集合
     * 供子类使用
     */
    protected ArrayList<Contact> arrayListData = new ArrayList<Contact>();

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

    public Contact(String strName, int intSex, int intHeight, String strPhone, String strAdd, RelationshipType relationshipType, String strRelationalValue) {
        super(strName, intSex, intHeight, strPhone, strAdd, relationshipType, strRelationalValue);
    }

    public Contact(String strName, int intSex, int intHeight, String strPhone, String strAdd, RelationshipType relationshipType, String strRelationalValue, String strCity, String strRelation, String strBusinessType) {
        super(strName, intSex, intHeight, strPhone, strAdd, relationshipType, strRelationalValue, strCity, strRelation, strBusinessType);
    }

    public void setContactData(String strName, int intSex, String strPhone, String strAdd, int intHeight) {
        setIntHeight(intHeight);
        setIntSex(intSex);
        setStrAdd(strAdd);
        setStrName(strName);
        setStrPhone(strPhone);
    }

    public void getContactData() {
        if (Login.getIntLoginStatusLock() == 1) {
            if (getIntSex() == 0) {
                System.out.printf("%s\t\t男\t\t%d\t\t%-11s\t\t\t%s%n", getStrName(), getIntHeight(), getStrPhone(), getStrAdd());
            } else {
                System.out.printf("%s\t\t女\t\t%d\t\t%-11s\t\t\t%s%n", getStrName(), getIntHeight(), getStrPhone(), getStrAdd());
            }
        } else {
            if (getIntSex() == 0) {
                System.out.printf("%s\t\t男\t\t%d\t\t%-11s\t\t\t%s%n", getStrName(), getIntHeight(), encryption(getStrPhone()), getStrAdd());
            } else {
                System.out.printf("%s\t\t女\t\t%d\t\t%-11s\t\t\t%s%n", getStrName(), getIntHeight(), encryption(getStrPhone()), getStrAdd());
            }
        }
    }

    /**
     * @param [string]
     * @throws
     * @author Kevin KDA on 2019/10/24 13:06
     * @description Contact / encryption TODO
     * @returns java.lang.String
     */
    @Override
    public String encryption(String string) {
        return "******";
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/24 13:06
     * @description Contact / decryption TODO
     * @returns void
     */
    @Override
    public void decryption() {
//正常输出
    }
}
