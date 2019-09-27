/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.obsolete;

/**
 * @Project Contact
 * @Package com.kevin.contact
 * @Author Kevin KDA
 * @Description TODO
 * @Date 2019/9/27 10:17
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Contact {
    private String strName;
    private int intSex;
    private String strPhone;
    private String strAdd;
    private int intHeight;

    public void setIntSex(int intSex) {
        this.intSex = intSex;
    }

    public int getIntSex() {
        return intSex;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrAdd(String strAdd) {
        this.strAdd = strAdd;
    }

    public String getStrAdd() {
        return strAdd;
    }

    public void setIntHeight(int intHeight) {
        this.intHeight = intHeight;
    }

    public int getIntHeight() {
        return intHeight;
    }

    public void setStrPhone(String strPhone) {
        this.strPhone = strPhone;
    }

    public String getStrPhone() {
        return strPhone;
    }

    public void setValue(String strName, int intSex, String strPhone, String strAdd, int intHeight){
        setIntHeight(intHeight);
        setIntSex(intSex);
        setStrAdd(strAdd);
        setStrName(strName);
        setStrPhone(strPhone);
    }

    public void showValue(){
        String strName = getStrName();
        int intSex = getIntSex();
        String strPhone = getStrPhone();
        String strAdd = getStrAdd();
        int intHeight = getIntHeight();

//        System.out.printf("%s\t%s\t%d\t%d\t%s%n", getStrName(), getStrPhone(), getIntSex(), getIntHeight(), getStrAdd());
//        System.out.println(strName + "\t\t" + Integer.toString(intSex) + "\t\t" + Integer.toString(intHeight) + "\t\t" + strPhone + "\t\t" + strAdd);

        if (intSex == 0){
            System.out.println(strName + "\t\t" + "男" + "\t\t" + Integer.toString(intHeight) + "\t\t" + strPhone + "\t\t" + strAdd);
        }
        else {
            System.out.println(strName + "\t\t" + "女" + "\t\t" + Integer.toString(intHeight) + "\t\t" + strPhone + "\t\t" + strAdd);
        }
    }
}
