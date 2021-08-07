/*
 * Copyright (c) Kevin KDA 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.courseprojectb.dao;

import com.kevin.courseprojectb.dbm.DBManage;

import java.sql.ResultSet;

/**
 * @author Kevin KDA on 2019/12/12 9:42
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.courseprojectb.dao
 * @classname UserDao
 * @description TODO
 * @interface/enum
 */
public class UserDao {
    /***
     @author Kevin KDA on 2019/12/12 9:44
     @param  * @param loginID
     @description UserDao / valiLoginID TODO 验证账号是否可用 true可用,false不可用
     @return boolean
     @throws
     */
    public static boolean valiLoginID(String loginID) {
        boolean state = true;
        try {
            String sql = "select uid from usertbl where loginID='" + loginID + "'";
            ResultSet rs = DBManage.getResultSet(sql);
            if (rs.next()) {
                state = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return state;
    }
}
