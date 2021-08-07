/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.database;

import com.kevin.contact.newbuild.contact.Contact;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author Kevin KDA on 2019/10/31 22:09
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.database
 * @classname DataManipulation
 * @description TODO
 * @interface/enum
 */
public class DataManipulation {
    /**
     * @param [arrayListData]
     * @throws
     * @author Kevin KDA on 2019/10/31 22:36
     * @description DataManipulation / addData TODO 提供arrayListData整体导入数据库
     * @returns void
     */
    public static void addData(ArrayList<Contact> arrayListData) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "" + "insert into BasicInfo" + "(name,phone) " + "values(?,?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);

            for (Contact contact : arrayListData
            ) {
                psmt.setString(1, contact.getStrName());
                psmt.setString(2, contact.getStrPhone());
                psmt.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param [contact]
     * @throws
     * @author Kevin KDA on 2019/10/31 22:37
     * @description DataManipulation / addData TODO 提供单个Contact导入数据库
     * @returns void
     */
    public static void addData(Contact contact) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "" + "insert into BasicInfo" + "(name,phone) " + "values(?,?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);

            psmt.setString(1, contact.getStrName());
            psmt.setString(2, contact.getStrPhone());
            psmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/10/31 22:37
     * @description DataManipulation / getDbData TODO 提供查询数据库全部数据功能
     * @returns java.util.ArrayList<com.kevin.contact.newbuild.contact.Contact>
     */
    public static ArrayList<Contact> getDbData() throws SQLException {
        ArrayList<Contact> arrayList = new ArrayList<Contact>();
        try {
            Connection conn = DBUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name,phone from BasicInfo");
            Contact contact = null;
            while (rs.next()) {//如果对象中有数据，就会循环打印出来
                contact = new Contact();
                contact.setStrName(rs.getString("name"));
                contact.setStrPhone(rs.getString("phone"));
                arrayList.add(contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
