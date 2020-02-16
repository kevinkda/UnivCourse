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
 * @author Kevin KDA on 2019/10/24 12:42
 * @version 1.1
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.contact
 * @classname People
 * @description TODO 提供个人特征信息
 * @interface/enum Serializable
 */
public class People implements Serializable {
    /**
     * Serializable参数
     */
    private static final long serialVersionUID = 7745184695911240530L;
    private String strName;
    private int intSex;
    private int intHeight;

    public People() {
    }

    public People(String strName) {
        this.strName = strName;
    }

    public People(String strName, int intSex, int intHeight) {
        this.strName = strName;
        this.intSex = intSex;
        this.intHeight = intHeight;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public int getIntSex() {
        return intSex;
    }

    public void setIntSex(int intSex) {
        this.intSex = intSex;
    }

    public int getIntHeight() {
        return intHeight;
    }

    public void setIntHeight(int intHeight) {
        this.intHeight = intHeight;
    }
}