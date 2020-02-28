/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.entity;

/**
 * @author Kevin KDA on 2020/2/24 16:15
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.entity
 * @classname CartItems
 * @description TODO
 * @interface/enum
 */
public class CartItems extends Goods {
    private String id;
    private int intItemQuantity;
    private int intItemCheck;
    private String strUserAccount;

    public CartItems() {
    }

    public CartItems(String strGoodsName, String strGoodsModel, double douGoodsPrice, int intItemQuantity,
                     String strUserAccount) {
        super(strGoodsName, strGoodsModel, douGoodsPrice);
        this.intItemQuantity = intItemQuantity;
        this.strUserAccount = strUserAccount;
    }

    public CartItems(String strGoodsName, String strGoodsModel, double douGoodsPrice, int intItemQuantity,
                     int intItemCheck, String strUserAccount) {
        super(strGoodsName, strGoodsModel, douGoodsPrice);
        this.intItemQuantity = intItemQuantity;
        this.intItemCheck = intItemCheck;
        this.strUserAccount = strUserAccount;
    }

    public CartItems(String strGoodsName, String strGoodsModel, String strGoodsUrl, String strGoodsUrlByPhoto,
                     double douGoodsPrice, int intItemQuantity, int intItemCheck, String strUserAccount) {
        super(strGoodsName, strGoodsModel, strGoodsUrl, strGoodsUrlByPhoto, douGoodsPrice);
        this.intItemQuantity = intItemQuantity;
        this.intItemCheck = intItemCheck;
        this.strUserAccount = strUserAccount;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIntItemQuantity() {
        return intItemQuantity;
    }

    public void setIntItemQuantity(int intItemQuantity) {
        this.intItemQuantity = intItemQuantity;
    }

    public int getIntItemCheck() {
        return intItemCheck;
    }

    public void setIntItemCheck(int intItemCheck) {
        this.intItemCheck = intItemCheck;
    }

    public String getStrUserAccount() {
        return strUserAccount;
    }

    public void setStrUserAccount(String strUserAccount) {
        this.strUserAccount = strUserAccount;
    }
}
