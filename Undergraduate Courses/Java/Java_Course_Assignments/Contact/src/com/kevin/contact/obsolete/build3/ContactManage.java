/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete.build3;

import com.kevin.contact.obsolete.build3.connector.RelationshipType;
import com.kevin.contact.obsolete.build3.contact.Contact;

import java.util.Scanner;

/**
 * @Program
 * @ClassName ContactManage
 * @Description TODO 提供关于Contact类的操纵
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
    public ContactManage() {
    }

    public ContactManage(Contact contact) {
        createContact(contact);
    }

    public void createContact(Contact contact) {
        contactArrayList.add(contact);
    }

    public void createContact(Scanner scaScan) {
        Contact contact = new Contact();
        System.out.println("（在数据输入时请注意将光标移至最后，已知在MyEclipse中不移动输入位置可能会出现异常，IDEA中验证正常）");
        System.out.println("\n\n\t\t\t添加好友\n-------------------------------");
        System.out.print("请输入姓名：");
        contact.setStrName(scaScan.next());
        System.out.print("请输入性别（请输入0男或1女）：");
        contact.setIntSex(scaScan.nextInt());
        System.out.print("请输入手机号：");
        contact.setStrPhone(scaScan.next());
        System.out.print("请输入地址：");
        contact.setStrAdd(scaScan.next());
        System.out.print("请输入身高：");
        contact.setIntHeight(scaScan.nextInt());

        setRelation(scaScan, contact);

        contactArrayList.add(contact);
    }

    public void setRelation(Scanner scaScan, Contact contact) {
        System.out.print("是否添加关系 1添加 任意键不添加:");
        if (scaScan.nextInt() == 1) {
            System.out.println("可供选择的关系如下\n1." + RelationshipType.Classmate + "\n2." + RelationshipType.Family + "\n3." + RelationshipType.BusinessRelated + "\n请选择关系类型的序号：");
            switch (scaScan.nextInt()){
                default:System.out.println("输入错误");
                case 1:
                    System.out.print("请输入您的同学所在城市:");
                    contact.setRelationship(RelationshipType.Classmate,scaScan.next());
                    break;
                case 2:
                    System.out.print("请输入您与家人的关系:");
                    contact.setRelationship(RelationshipType.Family,scaScan.next());
                    break;
                case 3:
                    System.out.print("请输入您与对方的业务关系:");
                    contact.setRelationship(RelationshipType.BusinessRelated,scaScan.next());
                    break;
            }
        }
    }

    public int showAllData() {
        System.out.println("\n***************************************************************");
        if (contactArrayList.isEmpty()) {
            System.out.println("通讯录信息为空\n请插入信息后再试");
            return 1;
        }

        int intCount = 0;
        System.out.println("\n系统中存在的联系人如下：");
        System.out.println("序号\t\t姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t\t地址");
        for (Contact contact : contactArrayList) {
            System.out.print(++intCount + "\t\t");
            contact.getContactData();
            String strValue= contact.getStrRelationalValue();
            try {
                if (!strValue.isEmpty()){
                    showRelation(contact);
                }
            }catch (NullPointerException e){
                continue;
            }
        }
        System.out.println("\n系统中共存在 " + contactArrayList.size() + " 位联系人");
        return 0;
    }

    public void showRelation(Contact contact){
        System.out.println("\t\t与您的关系是\t\t:\t"+contact.getRelationshipType());
        switch (contact.getRelationshipType()){
            default:
            case Classmate:
                System.out.println("\t\t您的同学所在城市\t\t:\t"+contact.getStrRelationalValue());
                break;
            case Family:
                System.out.println("\t\t您与家人的关系\t\t:\t"+contact.getStrRelationalValue());
                break;
            case BusinessRelated:
                System.out.println("\t\t您与对方的业务关系\t:\t"+contact.getStrRelationalValue());
                break;
        }
    }

    public void deleteData(Scanner scaScan) {
        showAllData();
        System.out.print("请输入您需要删除的联系人的标号:");
        int intDeleteSn = scaScan.nextInt();
        contactArrayList.remove(intDeleteSn - 1);
        showAllData();
    }

    public void searchData(Scanner scaScan) {
        System.out.println("\n***************************************************************");
        System.out.println("请按关键字查找\n1.姓名\n2.手机号\n请输入您需要查找关键字的数字：");

        String strSearchData;

        switch (scaScan.nextInt()) {
            default:
                System.out.print("\n输入错误，请重新输入\n");
                searchData(scaScan);
            case 1:
                System.out.print("请输入您需要查找姓名：");
                strSearchData = scaScan.next();
                retriever(1, strSearchData);
                break;
            case 2:
                System.out.print("请输入您需要查找手机号：");
                strSearchData = scaScan.next();
                retriever(3, strSearchData);
                break;
        }
    }

    public void changeDataView(Scanner scaScan) {
        System.out.println("\n***************************************************************");
        System.out.println("请按关键字进行修改\n0.显示所有数据\n1.姓名(暂未实现请勿使用)\n2.手机号(暂未实现请勿使用)");
        System.out.print("请输入您需要查找关键字的数字：");

        String strSearchData;
        Contact strModifyData = new Contact();

        switch (scaScan.nextInt()) {
            default:
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

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 13:35
     * @Description //TODO 供查找功能使用的查找器
     * @Params [intSearchLabel, strSearchData]
     * @Return void
     */
    protected void retriever(int intSearchLabel, String strSearchData) {
        for (Contact contact : contactArrayList) {
            switch (intSearchLabel) {
                default:
                case 1:
                    //Name
                    contact.getStrName();
                    if (strSearchData.equals(contact.getStrName())) {
                        contact.getContactData();
//                        break;
                    }
                    break;
                case 3:
                    //Phone
                    if (strSearchData.equals(contact.getStrPhone())) {
                        contact.getContactData();
//                        break;
                    }
                    break;
            }
        }
    }

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 13:34
     * @Description //TODO 供修改器使用的查找器
     * @Params [intSearchLabel, strSearchData, strModifyData]
     * @Return void
     */
    protected void retriever(int intSearchLabel, String strSearchData, Contact strModifyData) {
        for (Contact contact : contactArrayList) {
            switch (intSearchLabel) {
                default:
                case 1:
                    //Name
                    contact.getStrName();
                    if (strSearchData.equals(contact.getStrName())) {
                        modifier(contact, strModifyData);
                        System.out.println("姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t\t地址");
                        contact.getContactData();
                    }
                    break;
                case 3:
                    //Phone
                    if (strSearchData.equals(contact.getStrPhone())) {
                        contact.getContactData();
                    }
                    break;
            }
        }
    }

    /**
     * Title
     *
     * @Author Kevin KDA
     * @Date 2019-10-04 13:46
     * @Description //TODO 执行数据修改
     * @Params [contact, strModifyData]
     * @Return void
     */
    protected void modifier(Contact contact, Contact strModifyData) {
        contact.setContactData(strModifyData.getStrName(), strModifyData.getIntSex(), strModifyData.getStrPhone(), strModifyData.getStrAdd(), strModifyData.getIntHeight());
    }
}
