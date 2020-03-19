package com.kevin.job20200308.bookmanager.control;

import com.kevin.job20200308.bookmanager.entity.Book;
import com.kevin.job20200308.bookmanager.util.DateTimeUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/3/6 18:55
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200308.bookmanager.control
 * @classname Control
 * @description
 * @interface/enum
 */
public class Control extends BookDao {
    Scanner scaScan = new Scanner(System.in);
    /**
     * 系统测试内置账户
     */
    private static final String STR_ACCOUNT = "admin";
    /**
     * 提供当前系统是否需要进行强制登录的状态锁
     */
    private static final boolean SYSTEM_FORCED_LOGIN_LOCK = true;
    /**
     * 当前已登陆账户
     */
    private String strAccountLoggedIn;
    protected static final String[] STR_IMPLEMENT_FUNCTION = {"登陆", "添加", "修改", "删除", "借出", "归还", "书列表", "Exit"};
    protected static int bookId = 3;
    Book[] b = {
            new Book(1, "西游记", 0, 0, 1),
            new Book(2, "变形金刚", 1, 11, 2.1),
            null,
            null
    };

    public Control() {
        Login.loginByUserAccount(STR_ACCOUNT, STR_ACCOUNT);
        setStrAccountLoggedIn(STR_ACCOUNT);
    }

    /**
     * @author Kevin KDA on 2020/3/6 18:09
     * @description Control / login 登录处理功能
     */
    public void login() {
        if (!Login.isBoolLoginStatus()) {
            System.out.print("请输入用户名：");
            String strUserAcc = scaScan.next();
            System.out.print("请输入用户密码：");
            String strUserPass = scaScan.next();

            if (Login.loginByUserAccount(strUserAcc, strUserPass)) {
                setStrAccountLoggedIn(strUserAcc);
                System.out.println("登陆成功" + strUserAcc + "欢迎您");
            } else {
                System.out.println("您提供的用户名或密码错误");
            }
        } else {
            System.out.println("您当前已登陆系统，可进行访问");
        }
    }

    /**
     * @author Kevin KDA on 2020/3/7 18:09
     * @description Control / forceLoginCheck 检查系统是否需要强制登录
     */
    protected void forceLoginCheckBySystem() {
        if (SYSTEM_FORCED_LOGIN_LOCK) {
            forceLoginCheckByFunction();
        }
    }

    /**
     * @author Kevin KDA on 2020/3/7 18:09
     * @description Control / forceLoginCheck 调用方法受访问权限控制，检查登录状态，进行强制登录
     */
    protected void forceLoginCheckByFunction() {
        if (!Login.isBoolLoginStatus()) {
            System.out.println("您正在访问需强制登录功能，即将跳转至登录界面");
            login();
//        } else {
//            System.out.println("您已登录 " +getStrAccountLoggedIn());
        }
    }

    /**
     * @author Kevin KDA on 2020/3/7 19:02
     * @description Control / modifyByBookId 提供添加图书的功能
     */
    public void addBook() {
        addBook(b);
        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 19:02
     * @description Control / modifyByBookId 提供对图书数名和租金修改的功能，索引依据BookID
     */
    public void modifyByBookId() {
        forceLoginCheckByFunction();
        printBookInfo(b);
        System.out.print("请输入您需要修改的书目编号：");
        int intSubscript = getSubscriptByBookId();
        if (intSubscript == -1) {
            System.out.println("没有找到您需要的书目编号，请检查后重试");
            return;
        } else if (b[intSubscript].getBookStatus() == 1) {
            System.out.println("您选中的书目正处于借出状态不允许修改书籍信息");
            return;
        }

        System.out.print("请输入书的名字:");
        String strModifyBookName = scaScan.next();
        for (Book bookNameCheck :
                b) {
            if ((bookNameCheck != null) && (strModifyBookName.equals(bookNameCheck.getBookName()))) {
                System.out.println("您输入的书目名字" + strModifyBookName + "系统中已存在，请重试");
            }
        }
        b[intSubscript].setBookName(strModifyBookName);
        System.out.print("请输入书目每日租金:");
        b[intSubscript].setBookDayPrice(getNumberByUserInput());

//        for (Book book :
//                b) {
//            if ((book != null) && (intByBookId == book.getBookId())) {
//                System.out.print("请输入书的名字:");
//                String strModifyBookName = scaScan.next();
//                for (Book bookNameCheck :
//                        b) {
//                    if ((bookNameCheck != null) && (strModifyBookName.equals(bookNameCheck.getBookName()))) {
//                        System.out.println("您输入的书目名字" + strModifyBookName + "系统中已存在，请重试");
//                    }
//                }
//                book.setBookName(strModifyBookName);
//                System.out.print("请输入书目每日租金:");
//                book.setBookDayPrice(getNumberByUserInput());
//                break;
//            }
//        }
        System.out.println("操作成功");
        printBookInfo(b);
        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 19:04
     * @description Control / modifyByBookId 提供对图书数名和租金修改的功能，索引依据BookID
     */
    public void deleteByBookId() {
        forceLoginCheckByFunction();
        printBookInfo(b);
        System.out.print("请输入您需要删除的书目编号：");
        int intSubscript = getSubscriptByBookId();
        if (intSubscript == -1) {
            System.out.println("没有找到您需要的书目编号，请检查后重试");
            return;
        }

        b[intSubscript] = null;

        System.out.println("操作成功");
        printBookInfo(b);
        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 19:13
     * @description Control / modifyByBookId 提供对图书数名和租金修改的功能，索引依据BookID
     */
    public void lendByBookId() {
        forceLoginCheckByFunction();
        printBookInfo(b);
        System.out.print("请输入您需要借出的书目编号：");
        int intSubscript = getSubscriptByBookId();
        if (intSubscript == -1) {
            System.out.println("没有找到您需要的书目编号，请检查后重试");
            return;
        }

        if (b[intSubscript].getBookStatus() == 0) {
            b[intSubscript].setBookStatus(1);
            int intBorrowCount = b[intSubscript].getBookBorrowCount() + 1;
            b[intSubscript].setBookBorrowCount(intBorrowCount);
            b[intSubscript].setDateLendTime(new Date());
            System.out.println("\n操作成功 书目借出时间为" +
                    DateTimeUtil.formatStringByDate(b[intSubscript].getDateLendTime()) +
                    "归还日前将会以" + b[intSubscript].getBookDayPrice() + "元/天产生费用\n");
            printBookInfo(b);
        } else {
            System.out.println("您所选取的书目以借出，请检查后重试或选择其他书目");
        }

        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 19:22
     * @description Control / modifyByBookId 提供对图书数名和租金修改的功能，索引依据BookID
     */
    public void giveBackByBookId() {
        forceLoginCheckByFunction();
        printBookInfo(b);
        System.out.print("请输入您需要归还的书目编号：");
        int intSubscript = getSubscriptByBookId();
        if (intSubscript == -1) {
            System.out.println("没有找到您需要的书目编号，请检查后重试");
            return;
        }

        if (b[intSubscript].getBookStatus() == 1) {
            try {
                b[intSubscript].setBookStatus(0);
                double douLendDay = DateTimeUtil.startToEnd(b[intSubscript].getDateLendTime(), new Date());
                double douRent = douLendDay * b[intSubscript].getBookDayPrice();
                System.out.println("\n本次租赁共" + douLendDay + "天，产生费用" + douRent + "元");
                System.out.println("操作成功\n");
            } catch (NullPointerException e) {
                System.out.println("\n系统无法找到您租赁的日期，暂时无法计算租赁费用和时长");
                System.out.println("书目归还成功\n");
            }
            printBookInfo(b);
        } else {
            System.out.println("\n您所选取的书目已在库中，请检查后重试或选择其他书目\n");
        }
        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 19:02
     * @description Control / modifyByBookId 提供添加图书的功能
     */
    public void printBookInfo() {
        forceLoginCheckByFunction();
        printBookInfo(b);
        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 16:34
     * @description Control / systemPauseByEnter 提供系统暂停方法
     * 键入Enter键后被调用方法结束，返回调用方法
     */
    private static void systemPauseByEnter() {
        System.out.println("按回车返回主菜单");
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return int 数组下标
     * @author Kevin KDA on 2020/3/7 19:41
     * @description Control / getSubscriptByBookId 获取用户需要操作的数据下标，返回给调用方法
     */
    private int getSubscriptByBookId() {
        int intByBookId = (int) getNumberByUserInput();
        for (int i = 0; i < b.length; i++) {
            if ((b[i] != null) && (intByBookId == b[i].getBookId())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @return double
     * @author Kevin KDA on 2020/3/7 19:46
     * @description Control / getNumberByUserInput 获得用户输入数纸
     */
    private double getNumberByUserInput() {
        double userInput;
        try {
            userInput = scaScan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("您输入的书目编号错误，请输入数字，请重新输入");
            userInput = scaScan.nextInt();
        }
        return userInput;
    }

    public String getStrAccountLoggedIn() {
        return strAccountLoggedIn;
    }

    public void setStrAccountLoggedIn(String strAccountLoggedIn) {
        this.strAccountLoggedIn = strAccountLoggedIn;
    }
}
