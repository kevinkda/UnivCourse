/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.homeproject.entity;

/**
 * @author Kevin KDA on 2019/12/5 23:46
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.homeproject.entity
 * @classname ShoppingCart
 * @description TODO
 * @interface/enum
 */
public class ShoppingCart {
    private String tradeName;
    private int checked;
    private String model;
    private double price;
    private int amount;
    private String photo;
    private String guid;
    private String commodityUrl;
    private String photoUrl;

    public ShoppingCart() {
    }

    public ShoppingCart(String tradeName, int checked, double price, int amount) {
        this.tradeName = tradeName;
        this.checked = checked;
        this.price = price;
        this.amount = amount;
    }

    public ShoppingCart(String tradeName, int checked, String model, double price, int amount, String photo, String guid, String commodityUrl, String photoUrl) {
        this.tradeName = tradeName;
        this.checked = checked;
        this.model = model;
        this.price = price;
        this.amount = amount;
        this.photo = photo;
        this.guid = guid;
        this.commodityUrl = commodityUrl;
        this.photoUrl = photoUrl;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }


    public int getChecked() {
        return checked;
    }

    public void setChecked(int checked) {
        this.checked = checked;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }


    public String getCommodityUrl() {
        return commodityUrl;
    }

    public void setCommodityUrl(String commodityUrl) {
        this.commodityUrl = commodityUrl;
    }


    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
