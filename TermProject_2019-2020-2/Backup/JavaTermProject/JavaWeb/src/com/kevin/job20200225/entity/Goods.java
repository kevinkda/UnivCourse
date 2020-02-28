/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.job20200225.entity;

/**
 * @author Kevin KDA on 2020/2/24 14:25
 * @version 1.0
 * @project JavaTermProject
 * @package com.kevin.job20200225.entity
 * @classname Goods
 * @description TODO
 * @interface/enum
 */
public class Goods {
    private String strGoodsName;
    private String strGoodsModel;
    private String strGoodsUrl;
    private String strGoodsUrlByPhoto;
    private double douGoodsPrice;

    public Goods() {
    }

    public Goods(String strGoodsName, String strGoodsModel, double douGoodsPrice) {
        this.strGoodsName = strGoodsName;
        this.strGoodsModel = strGoodsModel;
        this.douGoodsPrice = douGoodsPrice;
    }

    public Goods(String strGoodsName, String strGoodsModel, String strGoodsUrl,
                 String strGoodsUrlByPhoto, double douGoodsPrice) {
        this.strGoodsName = strGoodsName;
        this.strGoodsModel = strGoodsModel;
        this.strGoodsUrl = strGoodsUrl;
        this.strGoodsUrlByPhoto = strGoodsUrlByPhoto;
        this.douGoodsPrice = douGoodsPrice;
    }

    public String getStrGoodsName() {
        return strGoodsName;
    }

    public void setStrGoodsName(String strGoodsName) {
        this.strGoodsName = strGoodsName;
    }

    public String getStrGoodsUrlByPhoto() {
        return strGoodsUrlByPhoto;
    }

    public void setStrGoodsUrlByPhoto(String strGoodsUrlByPhoto) {
        this.strGoodsUrlByPhoto = strGoodsUrlByPhoto;
    }

    public double getDouGoodsPrice() {
        return douGoodsPrice;
    }

    public void setDouGoodsPrice(double douGoodsPrice) {
        this.douGoodsPrice = douGoodsPrice;
    }

    public String getStrGoodsModel() {
        return strGoodsModel;
    }

    public void setStrGoodsModel(String strGoodsModel) {
        this.strGoodsModel = strGoodsModel;
    }

    public String getStrGoodsUrl() {
        return strGoodsUrl;
    }

    public void setStrGoodsUrl(String strGoodsUrl) {
        this.strGoodsUrl = strGoodsUrl;
    }
}
