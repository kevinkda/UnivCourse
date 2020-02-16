/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build2;

import java.util.ArrayList;

/**
 * @Project Contact
 * @Package com.kevin.contact
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 10:26
 * @Interface
 * @Enum
 * @Version 1.0
 */
@Deprecated
public class ContactDataManage extends ContactData {
    public ContactDataManage() {
    }

    public ContactDataManage(String strName, int intSex, String strPhone, String strAdd, int intHeight) {
        super(strName, intSex, strPhone, strAdd, intHeight);
    }

    static ArrayList<ContactData> contactArrayList = new ArrayList<ContactData>();

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019/9/27 10:27
     * @Description //TODO
     * @Params []
     * @Return int
     */
    public int showAllData() {
        System.out.println("\n***************************************************************");
        int intCountSys = 0;
        int intCount = 0;
        for (ContactData contactData:contactArrayList) {
            intCountSys++;
        }
        if (intCountSys == 0){
            System.out.println("通讯录信息为空\n请插入信息后再试");
            return 1;
        }
        else {
            System.out.println("");
            System.out.println("系统中存在的联系人如下：");
//            System.out.println("姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t地址");
            System.out.println("序号\t\t姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t\t地址");

            for (ContactData contactData:contactArrayList) {
                System.out.print(++intCount + "\t\t");
                contactData.showValue();
            }
            System.out.println("系统中共存在 "+ Integer.toString(intCount) +" 位联系人");
        }
        return 0;

    }
}
