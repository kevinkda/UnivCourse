/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Project Contact
 * @Package com.kevin.contact
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 10:23
 * @Interface
 * @Enum
 * @Version 1.4
 */
@Deprecated
public class ContactManage {
    static ArrayList<ContactData> contactArrayList = new ArrayList<ContactData>();

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 13:28
     * @Description //TODO
     * @Param  * @param
     * @Return void
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

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 13:29
     * @Description //TODO
     * @Param  * @param scannerSC
     * @Return void
     */
    public void createContact(Scanner scaScan){
        ContactData contactData = new ContactData();
//		Scanner SC = new Scanner(System.in);

//		System.out.print("请输入需要录入的联系人数量：");
//		int intContactNum = SC.nextInt();
        int intContactNum = 1;
        System.out.println("（在数据输入时请注意将光标移至最后，已知在MyEclipse中不移动输入位置可能会出现异常，IDEA中验证正常）");
        System.out.println("\n\n\t\t\t添加好友\n-------------------------------");

        for (int i = 0; i < intContactNum; i++) {
            System.out.print("请输入姓名：");
            contactData.setStrName(scaScan.next());
//			contactData.setStrName("王俊凯");
            System.out.print("请输入性别（请输入0男或1女）：");
            contactData.setIntSex(scaScan.nextInt());
//			contactData.setIntSex(SC.next()=="男"?0:1);
//			contactData.setIntSex(0);
            System.out.print("请输入手机号：");
            contactData.setStrPhone(scaScan.next());
//			contactData.setStrPhone("13012345678");
            System.out.print("请输入地址：");
            contactData.setStrAdd(scaScan.next());
//			contactData.setStrAdd("北京市海淀区中关村");
            System.out.print("请输入身高：");
            contactData.setIntHeight(scaScan.nextInt());
//			contactData.setIntHeight(182);

//			System.out.println("");
//
//			System.out.println("姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t地址");
//			contactData.showValue();
            contactArrayList.add(contactData);
        }
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:39
     * @Description //TODO
     * @Param  * @param scaScan
     * @Return void
     */
    public void deleteData(Scanner scaScan){
        showAllData();
        int intDeleteSn = scaScan.nextInt();
        contactArrayList.remove(intDeleteSn - 1);
        showAllData();
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-25 14:39
     * @Description //TODO
     * @Param  * @param scaScan
     * @Return void
     */
    public void searchData(Scanner scaScan){
        System.out.println("\n***************************************************************");
        System.out.println("请按关键字查找\n1.姓名\n2.手机号");
        System.out.print("请输入您需要查找关键字的数字：");

        String strSearchData;

        switch (scaScan.nextInt()) {
            default:
                System.out.print("\n输入错误，请重新输入\n");
                searchData(scaScan);
            case 1:
                System.out.print("请输入您需要查找姓名：");
                strSearchData = scaScan.next();
//                for (ContactData contactData:contactArrayList) {
//                    if (strName == contactData.getStrName()){
//                        contactData.showValue();
////                        break;
//                    }
//                }
                retriever(1, strSearchData);
                break;
            case 2:
                System.out.print("请输入您需要查找手机号：");
                strSearchData = scaScan.next();
//                for (ContactData contactData:contactArrayList) {
//                    if (strPhone == contactData.getStrPhone()){
//                        contactData.showValue();
////                        break;
//                    }
//                }
                retriever(3, strSearchData);
                break;
        }
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-26 21:47
     * @Description //TODO
     * @Params [intSearchLabel, strSearchData]
     * @Return void
     */
    protected void retriever(int intSearchLabel, String strSearchData){
        for (ContactData contactData:contactArrayList) {
            switch (intSearchLabel){
                case 1:
                    //Name
                    contactData.getStrName();
                    if (strSearchData.equals(contactData.getStrName())) {
                        contactData.showValue();
//                        System.out.println(contactData);
//                        System.out.println(contactData.getStrPhone());
//                        break;
                    }
                    break;
                case 3:
                    //Phone
                    if (strSearchData.equals(contactData.getStrPhone())){
                        contactData.showValue();
//                        break;
                    }
                    break;
            }
//            System.out.println(1);
        }
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-26 21:47
     * @Description //TODO
     * @Params [intSearchLabel, strSearchData, strModifyData]
     * @Return void
     */
    protected void retriever(int intSearchLabel, String strSearchData, String strModifyData){
        for (ContactData contactData:contactArrayList) {
            switch (intSearchLabel){
                case 1:
                    //Name
                    contactData.getStrName();
                    if (strSearchData.equals(contactData.getStrName())) {
                        modifier(strModifyData);
                        contactData.showValue();
                    }
                    break;
                case 3:
                    //Phone
                    if (strSearchData.equals(contactData.getStrPhone())){
                        contactData.showValue();
                    }
                    break;
            }
        }
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-26 21:47
     * @Description //TODO
     * @Params [intSearchLabel, strSearchData, strModifyData]
     * @Return void
     */
    protected void retriever(int intSearchLabel, String strSearchData, ContactData strModifyData){
        for (ContactData contactData:contactArrayList) {
            switch (intSearchLabel){
                case 1:
                    //Name
                    contactData.getStrName();
                    if (strSearchData.equals(contactData.getStrName())) {
                        modifier(contactData, strModifyData);
                        System.out.println("姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t\t地址");
                        contactData.showValue();
                    }
                    break;
                case 3:
                    //Phone
                    if (strSearchData.equals(contactData.getStrPhone())){
                        contactData.showValue();
                    }
                    break;
            }
        }
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-26 21:47
     * @Description //TODO
     * @Params [strModifyData]
     * @Return void
     */
    protected void modifier(String strModifyData){

    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-26 21:47
     * @Description //TODO
     * @Params [contactData, strModifyData]
     * @Return void
     */
    protected void modifier(ContactData contactData, ContactData strModifyData){
        contactData.ContactData(strModifyData.getStrName(), strModifyData.getIntSex(), strModifyData.getStrPhone(), strModifyData.getStrAdd(), strModifyData.getIntHeight());
    }

    /**
     * Title
     * @Author Kevin KDA
     * @Date 2019-09-26 21:47
     * @Description //TODO
     * @Params [scaScan]
     * @Return void
     */
    public void changeDataView(Scanner scaScan){
        System.out.println("\n***************************************************************");
        System.out.println("请按关键字进行修改\n0.显示所有数据\n1.姓名(暂未实现请勿使用)\n2.手机号(暂未实现请勿使用)");
        System.out.print("请输入您需要查找关键字的数字：");

        String strSearchData;
        ContactData strModifyData = new ContactData();

        switch (scaScan.nextInt()) {
            case 0:
                showAllData();
                System.out.print("请输入您需要修改数据的姓名：");
                strSearchData = scaScan.next();

                System.out.print("请输入姓名：");
                strModifyData.setStrName(scaScan.next());
                System.out.print("请输入性别（请输入0男或1女）：");
                strModifyData.setIntSex(scaScan.nextInt());
                System.out.print("请输入手机号：");
                strModifyData.setStrPhone(scaScan.next());
                System.out.print("请输入地址：");
                strModifyData.setStrAdd(scaScan.next());
                System.out.print("请输入身高：");
                strModifyData.setIntHeight(scaScan.nextInt());


                retriever(1, strSearchData, strModifyData);
                break;
            case 1:

                break;
            case 2:

                break;
        }

    }
}
