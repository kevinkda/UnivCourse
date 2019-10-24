/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.management;

import com.kevin.contact.newbuild.connecter.RelationshipType;
import com.kevin.contact.newbuild.contact.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2019/10/24 13:08
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.Management
 * @classname ManageControl
 * @description TODO 提供对Contact的操纵&管理
 * @interface/enum Serializable
 */
public class ManageControl extends Contact implements Serializable {
    /**
     * Serializable参数
     */
    private static final long serialVersionUID = 7072613562065712096L;
    /**
     * 用于外部存储数据
     */
    String filepath = "./Contact/resource/Data.txt";

    public ManageControl() throws Exception {
    }

    public ManageControl(Contact contact) {
        createDataItem(contact);
    }

    public void createDataItem(Contact contact) {
        arrayListData.add(contact);
    }

    public void createDataItem(Scanner scaScan) {
        Contact contact = new Contact();
        System.out.println("（在数据输入时请注意将光标移至最后，已知在MyEclipse中不移动输入位置可能会出现异常，IDEA中验证正常）");
        System.out.println("\n\n\t\t\t添加好友\n-------------------------------");
        System.out.print("请输入姓名：");
        contact.setStrName(scaScan.next());
        System.out.print("请输入性别（请输入0男或1女）：");
        contact.setIntSex(scaScan.nextInt());
        System.out.print("请输入手机号：");
        contact.setStrPhone(encryption(scaScan.next()));
        System.out.print("请输入地址：");
        contact.setStrAdd(scaScan.next());
        System.out.print("请输入身高：");
        contact.setIntHeight(scaScan.nextInt());

        setRelation(scaScan, contact);

        arrayListData.add(contact);
    }

    public void setRelation(Scanner scaScan, Contact contact) {
        System.out.print("是否添加关系 1添加 任意键不添加:");
        if (scaScan.nextInt() == 1) {
            System.out.println("可供选择的关系如下\n1." + RelationshipType.Classmate + "\n2." + RelationshipType.Family + "\n3." + RelationshipType.BusinessRelated + "\n请选择关系类型的序号：");
            switch (scaScan.nextInt()) {
                default:
                    System.out.println("输入错误");
                case 1:
                    System.out.print("请输入您的同学所在城市:");
                    contact.setRelationship(RelationshipType.Classmate, scaScan.next());
                    break;
                case 2:
                    System.out.print("请输入您与家人的关系:");
                    contact.setRelationship(RelationshipType.Family, scaScan.next());
                    break;
                case 3:
                    System.out.print("请输入您与对方的业务关系:");
                    contact.setRelationship(RelationshipType.BusinessRelated, scaScan.next());
                    break;
            }
        }
    }

    public int showAllData() {
        System.out.println("\n***************************************************************");
        if (arrayListData.isEmpty()) {
            System.out.println("通讯录信息为空\n请插入信息后再试");
            return 1;
        }

        int intCount = 0;
        System.out.println("\n系统中存在的联系人如下：");
        System.out.println("序号\t\t姓名\t\t\t性别\t\t身高\t\t手机号\t\t\t\t地址");
        for (Contact contact : arrayListData) {
            System.out.print(++intCount + "\t\t");
            contact.getContactData();
            String strValue = contact.getStrRelationalValue();
            try {
                if (!strValue.isEmpty()) {
                    showRelation(contact);
                }
            } catch (NullPointerException e) {
                continue;
            }
        }
        System.out.println("\n系统中共存在 " + arrayListData.size() + " 位联系人");
        if (Login.getIntLoginStatusLock() == 0) {
            System.out.println("电话号码以加密显示");
        }
        return 0;
    }

    public void showRelation(Contact contact) {
        System.out.println("\t\t与您的关系是\t\t:\t" + contact.getRelationshipType());
        switch (contact.getRelationshipType()) {
            default:
            case Classmate:
                System.out.println("\t\t您的同学所在城市\t\t:\t" + contact.getStrRelationalValue());
                break;
            case Family:
                System.out.println("\t\t您与家人的关系\t\t:\t" + contact.getStrRelationalValue());
                break;
            case BusinessRelated:
                System.out.println("\t\t您与对方的业务关系\t:\t" + contact.getStrRelationalValue());
                break;
        }
    }

    public void deleteData(Scanner scaScan) {
        showAllData();
        System.out.print("请输入您需要删除的联系人的标号:");
        int intDeleteSn = scaScan.nextInt();
        arrayListData.remove(intDeleteSn - 1);
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
     * @param []
     * @throws [IOException]
     * @author Kevin KDA on 2019/10/24 19:20
     * @description ManageControl / storageData TODO 保存数据
     * @returns void
     */
    public void storageData() throws IOException {
        //注意filepath的内容
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(filepath)));
        objectOutputStream.writeObject(arrayListData);
        objectOutputStream.close();
    }

    /**
     * @param []
     * @throws [IOException, ClassNotFoundException]
     * @author Kevin KDA on 2019/10/24 19:20
     * @description ManageControl / readData TODO 读取数据
     * @returns void
     */
    public void readData() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(filepath)));
        try {
            arrayListData = (ArrayList<Contact>) objectInputStream.readObject();
        }catch (InvalidClassException e){
            System.out.println("载入数据异常，已保存数据将被清空");
            File file=new File(filepath);
            if(file.exists()&&file.isFile()){
                file.delete();
            }
        }
        objectInputStream.close();
    }

    /**
     * @param [intSearchLabel, strSearchData]
     * @throws
     * @author Kevin KDA on 2019/10/24 18:51
     * @description ManageControl / retriever TODO 供查找功能使用的查找器
     * @returns void
     */
    protected void retriever(int intSearchLabel, String strSearchData) {
        for (Contact contact : arrayListData) {
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
     * @param [intSearchLabel, strSearchData, strModifyData]
     * @throws
     * @author Kevin KDA on 2019/10/24 18:51
     * @description ManageControl / retriever TODO 供修改器使用的查找器
     * @returns void
     */
    protected void retriever(int intSearchLabel, String strSearchData, Contact strModifyData) {
        for (Contact contact : arrayListData) {
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
     * @param [contact, strModifyData]
     * @throws
     * @author Kevin KDA on 2019/10/24 18:52
     * @description ManageControl / modifier TODO 执行数据修改
     * @returns void
     */
    protected void modifier(Contact contact, Contact strModifyData) {
        contact.setContactData(strModifyData.getStrName(), strModifyData.getIntSex(), strModifyData.getStrPhone(), strModifyData.getStrAdd(), strModifyData.getIntHeight());
    }
}
