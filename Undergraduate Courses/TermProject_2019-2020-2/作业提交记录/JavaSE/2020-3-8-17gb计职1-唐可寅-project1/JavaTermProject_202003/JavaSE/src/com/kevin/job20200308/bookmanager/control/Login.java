package com.kevin.job20200308.bookmanager.control;

/**
 * @author Kevin KDA on 2020/3/6 19:25
 * @version 1.0
 * @project JavaTermProject_202003
 * @package com.kevin.job20200308.bookmanager.control
 * @classname Login
 * @description
 * @interface/enum
 */
public class Login {
    private static boolean boolLoginStatus;
    private static final String USER_ACCOUNT = "admin";
    private static final String USER_PASS = "admin";

    public static boolean loginByUserAccount(String userName, String userPass) {
        if (userName.equals(USER_ACCOUNT) || userPass.equals(USER_PASS)) {
            setBoolLoginStatus(true);
            return boolLoginStatus;
        }
        return false;
    }

    public static boolean isBoolLoginStatus() {
        return boolLoginStatus;
    }

    protected static void setBoolLoginStatus(boolean boolLoginStatus) {
        Login.boolLoginStatus = boolLoginStatus;
    }
}
