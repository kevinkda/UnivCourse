package com.kevin.job20200319.bookmanager.control;

import com.kevin.job20200319.bookmanager.pojo.Account;
import com.kevin.job20200319.bookmanager.pojo.Book;
import com.kevin.job20200319.bookmanager.service.AccManagerLocalIo;
import com.kevin.job20200319.bookmanager.service.BookManagerLocalIo;
import com.kevin.job20200319.bookmanager.service.DataPersistenceLayer;
import com.kevin.util.date.TimeUtil;
import com.kevin.util.number.InputNum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kevin KDA on 2020/3/19 12:23
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.control
 * @classname Control
 * @description 提供系统统一操纵方法
 * @interface/enum
 */
public class Control extends SysInitOperation {
    private final Scanner scaScan = new Scanner(System.in);
    /**
     * 系统测试内置账户
     */
    private static final String STR_ACCOUNT = "admin";
    /**
     * 提供当前系统是否需要进行强制登录的状态锁
     */
    private static final boolean SYSTEM_FORCED_LOGIN_LOCK = true;
    /**
     * 当前已登陆账户 用户名
     */
    private String strAccountLoggedIn;
    /**
     * 当前已登陆账户 全部属性
     */
    private Account accAccountLoggedIn;
    /**
     * 系统规划提供功能
     */
    protected static final String[] STR_PROVIDE_FUNCTION = {"登陆", "注册", "充值", "修改密码", "购买小说", "书列表"};
    /**
     * 提供当前可用功能
     */
    protected static final String[] STR_REALIZATION_FUNCTION = {"登陆", "注册", "充值", "修改密码", "购买小说", "书列表"};
    /**
     * 系统登录前可用功能
     * 关联对象 STR_IMPLEMENT_FUNCTION
     * 值为数组下标
     */
    protected static final int FEATURES_AVAILABLE_BEFORE_LOGIN = 2 - 1;
    /**
     * 系统登录后可用功能
     * 关联对象 STR_IMPLEMENT_FUNCTION
     * 值为数组下标
     */
    protected static final int FEATURES_AVAILABLE_AFTER_LOGIN = 3 - 1;


    /**
     * 登录处理功能
     *
     * @author Kevin KDA on 2020/3/6 18:09
     * @description Control / login 登录处理功能
     */
    public void login() {
        int count = DataPersistenceLayer.getAccountList().size();
        if (DataPersistenceLayer.getAccountList().size() == 0) {
            System.out.println("系统中无已注册用户，程序将跳转至注册界面");
            register();
            return;
        }
        if (!AccManagerLocalIo.isBoolLoginStatus()) {
            System.out.print("请输入用户名：");
            String strUserAcc = scaScan.next();
            System.out.print("请输入用户密码：");
            String strUserPass = scaScan.next();

            if (AccManagerLocalIo.loginByUserAccount(strUserAcc, strUserPass)) {
                setStrAccountLoggedIn(strUserAcc);
                accAccountLoggedIn = AccManagerLocalIo.searchAccountByUserName(strUserAcc);
                System.out.println("登陆成功" + strUserAcc + "欢迎您" + TimeUtil.getTimeStatus());
            } else {
                System.out.println("您提供的用户名或密码错误");
            }
        } else {
            System.out.println("您当前已登陆系统，可进行访问");
        }
    }

    /**
     * 注册处理功能
     *
     * @author Kevin KDA on 2020/3/6 18:09
     * @description Control / register 注册处理功能
     */
    public void register() {
        System.out.print("请输入用户名：");
        String strUserAcc = scaScan.next();
        System.out.print("请输入用户密码：");
        String strUserPass = scaScan.next();

        if (AccManagerLocalIo.registrationUser(strUserAcc, strUserPass)) {
            AccManagerLocalIo.loginByUserAccount(strUserAcc, strUserPass);
            setStrAccountLoggedIn(strUserAcc);
            accAccountLoggedIn = AccManagerLocalIo.searchAccountByUserName(strUserAcc);
            System.out.println("注册成功" + strUserAcc + "欢迎您，已为您自动登录" + TimeUtil.getTimeStatus());
        } else {
            System.out.println("因为某些未知的原因您的请求失败，请重试");
        }
    }

    /**
     * 充值处理功能
     *
     * @return void
     * @author Kevin KDA on 2020/3/19 17:01
     * @description Control / recharge 充值处理功能
     */
    public void recharge() {
        System.out.println(strAccountLoggedIn + "，欢迎您");
        System.out.println("您当前的余额：" + accAccountLoggedIn.getDouBalance());
        System.out.print("请输入您要充值的金额：");
        double recharge = scaScan.nextDouble();
        accAccountLoggedIn.setDouBalance(recharge);
        if (AccManagerLocalIo.modifyAccInfo(accAccountLoggedIn)) {
            System.out.println("您的充值操作成功");
        } else {
            System.out.println("因为某些未知的原因您的请求失败，请重试");
        }
        systemPauseByEnter();
    }

    /**
     * 修改密码处理功能
     *
     * @return void
     * @author Kevin KDA on 2020/3/19 17:01
     * @description Control / modifyAccPass 修改密码处理功能
     */
    public void modifyAccPass() {
        System.out.println(strAccountLoggedIn + "，欢迎您");
        System.out.print("请输入您的原始密码：");
        String userPassOld = scaScan.next();
        if (userPassOld.equals(accAccountLoggedIn.getStrUserPass())) {
            System.out.print("请输入新密码：");
            String userPassNew = scaScan.next();
            if (userPassNew.equals(userPassOld)) {
                System.out.println("您的原始密码与新密码一直，请检查后重试");
            } else {
                accAccountLoggedIn.setStrUserPass(userPassNew);
                if (AccManagerLocalIo.modifyAccInfo(accAccountLoggedIn)) {
                    System.out.println("您的修改密码操作成功");
                } else {
                    System.out.println("因为某些未知的原因您的请求失败，请重试");
                }
            }
        } else {
            System.out.println("请输入您的原始密码错误");
        }
        systemPauseByEnter();
    }

    /**
     * 显示所有账户
     *
     * @return void
     * @author Kevin KDA on 2020/3/19 17:48
     * @description Control / showAccList 显示所有账户
     */
    public void showAccList() {
        System.out.println("userName\tuserPass");
        List<Account> list = DataPersistenceLayer.getAccountList();
        for (Account i :
                list) {
            System.out.println(i.getStrUserName() + "\t" + i.getStrUserPass());
        }
    }

    /**
     * 购买小说
     *
     * @return void
     * @author Kevin KDA on 2020/3/19 17:48
     * @description Control / showAccList 购买小说
     */
    public void buyingNovels() {
        List<Book> bookList = DataPersistenceLayer.getBookList();
        System.out.println("系统中已存在的书目如下：\n");
        System.out.printf("%4s\t%-20s\t%-12s\t%5s\t\t%4s\n", "书目ID", "书名", "作者", "总价", "购买状态");
        for (Book i :
                bookList) {
            System.out.printf("%4d\t%-20s\t%-12s\t%5.2f\t\t%-4s\n", i.getIntBookId(), i.getBookName(), i.getPeopleName(), i.getBookPrice(), i.getBookStatus() == 1 ? "已购买" : "未购买");
        }
        int id = InputNum.getInt("请输入您需要购买的书目ID：");
        Book book = BookManagerLocalIo.searchBookByBookId(id);
        if (book != null) {
            if (book.getBookStatus() != 1) {
                if (accAccountLoggedIn.getDouBalance() >= book.getBookPrice()) {
                    if (!BookManagerLocalIo.buyingNovelsByBookId(book.getIntBookId())) {
                        System.out.println("因为某些未知的原因您的请求失败，请重试");
                        return;
                    }
                    double douDeductionFee = accAccountLoggedIn.getDouBalance() - book.getBookPrice();
                    accAccountLoggedIn.setDouBalance(douDeductionFee);
                    AccManagerLocalIo.modifyAccInfo(accAccountLoggedIn);
                    System.out.println("购买成功\n当前账户余额：" + accAccountLoggedIn.getDouBalance());
                } else {
                    System.out.println("很抱歉您当前帐户余额不足，未完成购买。\n当前账户余额：" + accAccountLoggedIn.getDouBalance());
                }
                System.out.println("您希望购买的书目：" + book.getBookName() + "需要" + book.getBookPrice() + "元\n请充值后重试");
            } else {
                System.out.println("您所选中的书目已购买，请检查后重试");
            }
        } else {
            System.out.println("因为某些未知的原因您的请求失败，请重试");
        }
        systemPauseByEnter();
    }

    /**
     * 显示所有图书
     *
     * @return void
     * @author Kevin KDA on 2020/3/19 17:48
     * @description Control / showBookList 显示所有图书
     */
    public void showBookList() {
        List<Book> bookList = DataPersistenceLayer.getBookList();
        System.out.println("系统中已存在的书目如下：\n");
        System.out.printf("%4s\t%-20s\t%-12s\t%5s\t\t%4s\n", "书目ID", "书名", "作者", "总价", "购买状态");
        for (Book i :
                bookList) {
            System.out.printf("%4d\t%-20s\t%-12s\t%5.2f\t\t%-4s\n", i.getIntBookId(), i.getBookName(), i.getPeopleName(), i.getBookPrice(), i.getBookStatus() == 1 ? "已购买" : "未购买");
        }
        systemPauseByEnter();
    }

    /**
     * @author Kevin KDA on 2020/3/7 16:34
     * @description Control / systemPauseByEnter 提供系统暂停方法
     * 键入Enter键后被调用方法结束，返回调用方法
     */
    static void systemPauseByEnter() {
        System.out.println("按回车返回主菜单");
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Control() {
        super();
//        AccManagerLocalIo.loginByUserAccount(STR_ACCOUNT, STR_ACCOUNT);
//        setStrAccountLoggedIn(STR_ACCOUNT);
    }

    public static String getStrAccount() {
        return STR_ACCOUNT;
    }

    public static boolean isSystemForcedLoginLock() {
        return SYSTEM_FORCED_LOGIN_LOCK;
    }

    public String getStrAccountLoggedIn() {
        return strAccountLoggedIn;
    }

    public void setStrAccountLoggedIn(String strAccountLoggedIn) {
        this.strAccountLoggedIn = strAccountLoggedIn;
    }

    public static String[] getStrProvideFunction() {
        return STR_PROVIDE_FUNCTION;
    }
}
