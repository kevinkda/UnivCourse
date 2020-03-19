package com.kevin.job20200319.bookmanager.service;

import com.kevin.job20200319.bookmanager.pojo.Account;

import java.util.Date;

/**
 * @author Kevin KDA on 2020/3/19 12:06
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200319.bookmanager.service
 * @classname AccManagerLocalIo
 * @description 提供账户管理服务类
 * @interface/enum
 */
public class AccManagerLocalIo extends DataPersistenceLayer {
    private static boolean boolLoginStatus;
    private static final String USER_ACCOUNT = "admin";
    private static final String USER_PASS = "admin";

    /**
     * 进行测试账户登录验证 供测试使用
     *
     * @param userName: 传入用户名
     * @param userPass: 传入密码
     * @return boolean 返回登录结果
     * @author Kevin KDA on 2020/3/19 12:09
     * @description AccManagerLocalIo / loginByTestUserAccount 进行测试账户登录验证 供测试使用
     */
    public static boolean loginByTestUserAccount(String userName, String userPass) {
        if (userName.equals(USER_ACCOUNT) || userPass.equals(USER_PASS)) {
            setBoolLoginStatus(true);
            return boolLoginStatus;
        }
        return false;
    }

    /**
     * 进行账户登录验证，数据来自数据持久层
     *
     * @param userName: 传入用户名
     * @param userPass: 传入密码
     * @return boolean 返回登录结果
     * @author Kevin KDA on 2020/3/19 12:09
     * @description AccManagerLocalIo / loginByUserAccount 进行账户登录验证，数据来自数据持久层
     */
    public static boolean loginByUserAccount(String userName, String userPass) {
        for (Account i :
                accountList) {
            if (userName.equals(i.getStrUserName()) && userPass.equals(i.getStrUserPass())) {
                setBoolLoginStatus(true);
                return boolLoginStatus;
            }
        }
        return false;
    }

    /**
     * 进行账户注册，数据保存进数据持久层
     *
     * @param userName: 传入用户名
     * @param userPass: 传入密码
     * @return boolean 返回注册结果
     * @author Kevin KDA on 2020/3/19 12:43
     * @description AccManagerLocalIo / registrationUser 进行账户注册，数据保存进数据持久层
     */
    public static boolean registrationUser(String userName, String userPass) {
        int count;
        try {
            count = DataPersistenceLayer.getAccountList().size();
            count++;
        } catch (NullPointerException e) {
            count = 1;
        }
        return registrationUser(new Account(count, userName, userPass));
    }

    /**
     * 进行账户注册，数据保存进数据持久层
     *
     * @param account: 注册账户信息
     * @return boolean 返回注册结果
     * @author Kevin KDA on 2020/3/19 12:43
     * @description AccManagerLocalIo / registrationUser 进行账户注册，数据保存进数据持久层
     */
    public static boolean registrationUser(Account account) {
        account.setDateRegTime(new Date());
        accountList.add(account);
        saveAccountInformation();
        return true;
    }

    /**
     * @param userName: 传入状态值
     * @return Account 返回用户全部属性
     * @author Kevin KDA on 2020/3/19 12:13
     * @description AccManagerLocalIo / setBoolLoginStatus 根据传入的用户名查找用户，返回用户全部属性
     */
    public static Account searchAccountByUserName(String userName) {
        for (Account item :
                accountList) {
            if (userName.equals(item.getStrUserName())) {
                return item;
            }
        }
        return null;
    }

    /**
     * @param uid:      传入需更改密码的用户ID
     * @param userPass: 传入更改后密码
     * @return boolean 返回修改结果
     * @author Kevin KDA on 2020/3/19 12:51
     * @description AccManagerLocalIo / changeUserPassByUerId 修改用户密码，检索依据intUserId
     */
    public static boolean changeUserPassByUerId(int uid, String userPass) {
        for (Account i :
                accountList) {
            if (uid == i.getIntUserId()) {
                i.setStrUserPass(userPass);
            }
        }
        return true;
    }

    /**
     * @param userName: 传入需更改密码的strUserName
     * @param userPass: 传入更改后密码
     * @return boolean 返回修改结果
     * @author Kevin KDA on 2020/3/19 12:51
     * @description AccManagerLocalIo / changeUserPassByUerId 修改用户密码，检索依据strUserName
     */
    public static boolean changeUserPassByUserName(String userName, String userPass) {
        for (Account i :
                accountList) {
            if (userName.equals(i.getStrUserName())) {
                i.setStrUserPass(userPass);
            }
        }
        return true;
    }

    /**
     * @param account: 传入完整用户信息
     * @return boolean 返回修改结果
     * @author Kevin KDA on 2020/3/19 12:51
     * @description AccManagerLocalIo / changeUserPassByUerId 修改有变动的用户信息，检索依据strUserName
     */
    public static boolean modifyAccInfo(Account account) {
        for (Account i :
                accountList) {
            if (account.getIntUserId() == i.getIntUserId()) {
                i = account;
                saveAccountInformation();
                return true;
            }
        }
        return false;
    }

    /**
     * @return boolean 返回系统登录状态
     * @author Kevin KDA on 2020/3/19 12:11
     * @description AccManagerLocalIo / isBoolLoginStatus 检查系统登录状态
     */
    public static boolean isBoolLoginStatus() {
        return boolLoginStatus;
    }

    /**
     * @param boolLoginStatus: 传入状态值
     * @return void 设置系统登录状态
     * @author Kevin KDA on 2020/3/19 12:13
     * @description AccManagerLocalIo / setBoolLoginStatus 改变系统登录状态值
     */
    protected static void setBoolLoginStatus(boolean boolLoginStatus) {
        AccManagerLocalIo.boolLoginStatus = boolLoginStatus;
    }

    public AccManagerLocalIo() {
    }
}
