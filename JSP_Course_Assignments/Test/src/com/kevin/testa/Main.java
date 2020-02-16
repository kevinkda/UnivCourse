package com.kevin.testa;

import com.kevin.testa.dbm.DBManage;

/**
 * @author Kevin KDA on 2019/12/5 22:15
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.testa
 * @classname Main
 * @description TODO
 * @interface/enum
 */
public class Main {
    public static void main(String[] args) {
        DBManage.addData("1", "1", "abcd", "add", "add&");
        System.out.println("aaa");
    }
}
