/*
 * Copyright (c) 2019 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.carrentalmanagement.newbuild.car;

/**
 * @Project Java_Course_Assignments
 * @Package com.kevin.carrentalmanagement.car
 * @Author Kevin KDA
 * @Description TODO Brand
 * @Date 2019/9/27 11:41
 * @Interface
 * @Enum
 * @Version 1.0
 */
public class Brand {
    private String strSn;
    private String strBrand;

    enum CarBrand {
        宝马, 别克, 奔驰
    }

//    private static int intSn;

    public Brand() {
    }

    public Brand(String strSn, String strBrand) {
        this.strSn = strSn;
        this.strBrand = strBrand;
    }

    public String getStrSn() {
        return strSn;
    }

    public void setStrSn(String strSn) {
        this.strSn = strSn;
    }

    public String getStrBrand() {
        return strBrand;
    }

    public void setStrBrand(String strBrand) {
        this.strBrand = strBrand;
    }
}
