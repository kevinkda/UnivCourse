package com.kevin.job20200319.bookmanager.control;

import com.kevin.job20200319.bookmanager.pojo.Account;
import com.kevin.job20200319.bookmanager.pojo.Book;
import com.kevin.job20200319.bookmanager.pojo.PageBean;
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
    protected static final String[] STR_PROVIDE_FUNCTION = {"登陆", "注册", "充值", "修改密码", "购买小说", "书列表", "读书"};
    /**
     * 提供当前可用功能
     */
    protected static final String[] STR_REALIZATION_FUNCTION = {"登陆", "注册", "充值", "修改密码", "购买小说", "书列表", "读书"};
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
        showBookList();
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
                    System.out.println("您希望购买的书目：" + book.getBookName() + ":" + book.getBookPrice() + "元");
                } else {
                    System.out.println("很抱歉您当前帐户余额不足，未完成购买。\n当前账户余额：" + accAccountLoggedIn.getDouBalance());
                    System.out.println("您希望购买的书目：" + book.getBookName() + "需要" + book.getBookPrice() + "元\n请充值后重试");
                }
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
        System.out.printf("%4s\t%-20s\t%-12s\t%5s\t\t%4s\t\t%s\n", "书目ID", "书名", "作者", "总价", "购买状态", "URL");
        for (Book i :
                bookList) {
            System.out.printf("%4d\t%-20s\t%-12s\t%5.2f\t\t%-4s\t\t%s\n", i.getIntBookId(), i.getBookName(), i.getPeopleName(), i.getBookPrice(), i.isBuy(), i.getBookUrl());
//            System.out.println(i.getFullBookUrl());
        }
    }

    /**
     * 显示所有图书
     * View调用方法
     *
     * @return void
     * @author Kevin KDA on 2020/3/19 17:48
     * @description Control / showBookList 显示所有图书
     */
    public void showBookListImpl() {
        showBookList();
        systemPauseByEnter();
    }

    /**
     * 读书
     *
     * @return void
     * @author Kevin KDA on 2020/3/22 19:16
     * @description Control / readBook 提供读书方法
     */
    public void readBook() {
        showBookList();
        int choose = InputNum.getInt("请输入您将要阅读的书目ID：");
        Book book = BookManagerLocalIo.searchBookByBookId(choose);
        if (book == null) {
            System.out.println("查无此书，请确认书目ID！");
            return;
        }
        if (book.getBookStatus() == 0) {
            System.out.println("您所选择的书目ID尚未购买，请购买后重试");
            return;
        }
        List<String> list = DataPersistenceLayer.readBookFromDisk(book.getFullBookUrl());
        PageBean p = new PageBean(
                15,
                list.size(),
                list,
                book.getBookStatus() == 1
        );
        int pageIndex = 1;
        //用户的选项
        String choice;
        label:
        do {
            try {
                pageIndex = p.setPageIndex(pageIndex, accAccountLoggedIn);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = p.startRow(); i < p.endRow(); i++) {
                try {
                    System.out.println(list.get(i).trim());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("当前页:" + p.getPageIndex());
            System.out.println("总的页数:" + p.getTotalPage());
//            System.out.println("总的数量:" + p.getTotalCount());
//            System.out.println("每页的最大条数:" + p.getPageSize());
            if (p.getPageIndex() > 1 && p.getPageIndex() < p.getTotalPage()) {
                System.out.println("a:上一页b:下一页c:自己输入相应的页数d:退出");
            } else if (p.getPageIndex() == 1) {
                System.out.println("b:下一页c:自己输入相应的页数d:退出");
            } else if (p.getPageIndex() == p.getTotalPage()) {
                System.out.println("a:上一页c:自己输入相应的页数d:退出");
            }
            choice = scaScan.next();
            switch (choice) {
                case "d":
                    System.out.println("正在退出《" + book.getBookName() + "》...");
                    break label;
                case "a":
                    if (pageIndex <= 1) {
                        pageIndex = 1;
                    } else {
                        pageIndex--;    //表示上一页，当前页要-1

                    }
                    break;
                case "b":
                    if (pageIndex >= p.getTotalPage()) {
                        pageIndex = p.getTotalPage();
                        System.out.println("当前已是最后一页了。");
                    } else {
                        pageIndex++;    //表示下一页，当前页要+1

                    }
                    break;
                case "c":
                    System.out.print("请输入自定义的页数:");
                    int number = InputNum.getInt("");
                    //判断输入的页数是否正确
                    if (number >= 1 && number <= p.getTotalPage()) {
                        pageIndex = number;
                    } else {
                        System.out.println("输入的页码不正确！");
                    }
                    break;
            }
        } while (true);
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
