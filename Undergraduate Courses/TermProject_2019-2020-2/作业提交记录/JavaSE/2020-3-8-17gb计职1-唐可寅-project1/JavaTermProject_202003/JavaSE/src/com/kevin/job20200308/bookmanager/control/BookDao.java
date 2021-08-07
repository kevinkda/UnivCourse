package com.kevin.job20200308.bookmanager.control;

import com.kevin.job20200308.bookmanager.entity.Book;

import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/3/6 18:41
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200308.bookmanager.control
 * @classname BookDao
 * @description 提供图书管理功能，此类由老师提供，已被修改
 * @interface/enum
 */
public class BookDao {
    public static Scanner scaScan = new Scanner(System.in);

    public static void printBookInfo(Book[] b) {
        //如果账号没有登陆
        if (Login.isBoolLoginStatus()) {
            System.out.println("书本ID\t书的名称\t\t书的状态\t借出次数\t每天租金");
            for (Book book : b) {
                if (book != null) {
                    System.out.println(book.getBookId() + "\t\t" + book.getBookName() + "\t\t" + book.getBookStatus() + "\t\t" + book.getBookBorrowCount() + "\t\t" + book.getBookDayPrice());
                }
            }
        } else {
            System.out.println("您好，您这边没有登陆，无权进行任何操作");
        }
    }

    public static void addBook(Book[] b) {
        if (Login.isBoolLoginStatus()) {
            //不是直接1开始输入书的名字
            //默认是满的
            int index = -1;
            for (int i = 0; i < b.length; i++) {
                //证明还有空的位置
                if (b[i] == null) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("不好意思，仓库的书已经满了");
            } else {
                System.out.println("您好，有空余的位置可以执行新增的操作");
                System.out.print("请输入书的名字:");
                String bookName = scaScan.next();
                //默认书的名字是没有重复的
                boolean result1 = false;
                for (Book book : b) {
                    //如果有书的这个对象
                    if (book != null) {
                        if (book.getBookName().equals(bookName)) {
                            //你从控制台输入的书的名字和我的仓库里面存在的书的名字是有重复现象的
                            result1 = true;
                            break;
                        }
                    }
                }
                if (result1) {
                    System.out.println("您好，您这边输入的书的名字在仓库中是已经存在了不能新增");
                } else {
                    System.out.println("您好，系统准备开始新增的操作...");
                    System.out.println("请输入书的每天的租金");
                    double price = scaScan.nextDouble();
                    Book b1 = new Book(Control.bookId, bookName, 0, 0, price);
                    b[index] = b1;
                    //为下一次新增做准备
                    Control.bookId++;
                    System.out.println("您好，新增书:" + bookName + "成功了！请查阅");
                }
            }
        } else {
            System.out.println("您好，您这边没有登陆，无权进行任何操作");
        }


    }
}
