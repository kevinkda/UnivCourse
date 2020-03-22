package com.kevin.job20200319.bookmanager.pojo;

import com.kevin.job20200319.bookmanager.service.DataPersistenceLayer;

import java.io.Serializable;

/**
 * @author Kevin KDA on 2020/3/19 13:28
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.pojo
 * @classname Book
 * @description 图书信息
 * @interface/enum
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 42L;
    /**
     * 书目UID
     */
    private int intBookId;
    /**
     * 书名
     */
    private String bookName;
    /**
     * 书的作者
     */
    private String peopleName;
    /**
     * 这本书的总价
     */
    private double bookPrice;
    /**
     * 0没买1买了 注意这个状态是需要有
     */
    private int bookStatus;
    /**
     * 存书的路径
     */
    private String bookUrl;


    /**
     * 返回书目购买状态
     *
     * @return String
     * @author Kevin KDA on 2020/3/22 19:59
     * @description Book / isBuy 返回书目购买状态
     */
    public String isBuy() {
        return bookStatus == 0 ? "未购买" : "已拥有";
    }


    public Book() {
    }

    public Book(String bookName, String peopleName, double bookPrice) {
        this.bookName = bookName;
        this.peopleName = peopleName;
        this.bookPrice = bookPrice;
    }

    public Book(String bookName, String peopleName, double bookPrice, int bookStatus) {
        this.bookName = bookName;
        this.peopleName = peopleName;
        this.bookPrice = bookPrice;
        this.bookStatus = bookStatus;
    }

    public Book(int intBookId, String bookName, String peopleName, double bookPrice, int bookStatus) {
        this.intBookId = intBookId;
        this.bookName = bookName;
        this.peopleName = peopleName;
        this.bookPrice = bookPrice;
        this.bookStatus = bookStatus;
    }

    public Book(int intBookId, String bookName, String peopleName, double bookPrice, int bookStatus, String bookUrl) {
        this.intBookId = intBookId;
        this.bookName = bookName;
        this.peopleName = peopleName;
        this.bookPrice = bookPrice;
        this.bookStatus = bookStatus;
        this.bookUrl = bookUrl;
    }

    public int getIntBookId() {
        return intBookId;
    }

    public void setIntBookId(int intBookId) {
        this.intBookId = intBookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }

    public String getFullBookUrl() {
        return DataPersistenceLayer.getBookRootPath() + bookUrl;
    }
}
