package com.kevin.job20200308.bookmanager.entity;

import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * @author Kevin KDA on 2020/3/6 18:39
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200308.bookmanager.entity
 * @classname Book
 * @description
 * @interface/enum
 */
public class Book {
    /**
     * 书的ID
     */
    private int bookId;
    /**
     * 书的名称
     */
    private String bookName;
    /**
     * 0没有借出去 1借出去
     */
    private int bookStatus;
    /**
     * 书的借出次数
     */
    private int bookBorrowCount;
    /**
     * 每天的租金
     */
    private double bookDayPrice;
    /**
     * 出借日期
     */
    private Date dateLendTime;

    public Book() {
    }

    public Book(int bookId, String bookName, int bookStatus,
                int bookBorrowCount, double bookDayPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookStatus = bookStatus;
        this.bookBorrowCount = bookBorrowCount;
        this.bookDayPrice = bookDayPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(int bookStatus) {
        this.bookStatus = bookStatus;
    }

    public int getBookBorrowCount() {
        return bookBorrowCount;
    }

    public void setBookBorrowCount(int bookBorrowCount) {
        this.bookBorrowCount = bookBorrowCount;
    }

    public double getBookDayPrice() {
        return bookDayPrice;
    }

    public void setBookDayPrice(double bookDayPrice) {
        this.bookDayPrice = bookDayPrice;
    }

    public Date getDateLendTime() {
        return dateLendTime;
    }

    public void setDateLendTime(Date dateLendTime) {
        this.dateLendTime = dateLendTime;
    }

    public void setDateLendTime(long time) {
    }
}
