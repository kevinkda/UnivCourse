/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.employeemanagementsystem.database;

import com.kevin.employeemanagementsystem.foundationclass.BasicData;

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
    public static void addData(ArrayList<BasicData> arrayListData) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "" + "insert into BasicInfo" + "(name,phone) " + "values(?,?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);

            for (BasicData contact : arrayListData
            ) {
                psmt.setString(1, contact.getStrName());
                psmt.execute();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param [basicData]
     * @throws
     * @author Kevin KDA on 2019/10/31 22:37
     * @description DataManipulation / addData TODO 提供单个Contact导入数据库
     * @returns void
     */
    public static void addData(BasicData basicData) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "" + "insert into EmpTbl" + "(ename,sex,Salary,dptid) " + "values(?,?,?,?)";
        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, basicData.getStrName());
            psmt.setString(2, basicData.getStrSex());
            psmt.setDouble(3, basicData.getdouWages());
            psmt.setString(4, basicData.getStrDepartment());
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
    public static ArrayList<BasicData> getDbData() throws SQLException {
        ArrayList<BasicData> arrayList = new ArrayList<BasicData>();
        try {
            Connection conn = DBUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT eid,ename,sex,Salary,Dptname FROM employeemanagementsystem.emptbl,employeemanagementsystem.depttbl\n" +
                    "where depttbl.Dptid=emptbl.dptid");
            BasicData basicData = null;
            //如果对象中有数据，就会循环打印出来
            while (rs.next()) {
                basicData = new BasicData();
                basicData.setintStaffSn(rs.getInt("eid"));
                basicData.setStrName(rs.getString("ename"));
                basicData.setStrSex(rs.getString("sex"));
                basicData.setdouWages(rs.getInt("Salary"));
                basicData.setStrDepartment(rs.getString("Dptname"));
                arrayList.add(basicData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static void deleteData(int intStaffSn) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql = "" + "delete from emptbl where eid = ?";
        PreparedStatement psmt = conn.prepareStatement(sql);
        psmt.setInt(1, intStaffSn);
        psmt.execute();
    }
    public static void closeAll(){
        DBUtil.closeConnection();
    }
}
