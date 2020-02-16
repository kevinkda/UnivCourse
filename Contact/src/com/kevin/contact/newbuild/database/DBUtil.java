/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.contact.newbuild.database;

import java.sql.*;

/**
 * @author Kevin KDA on 2019/10/31 21:53
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.contact.newbuild.database
 * @classname DBUtil
 * @description TODO
 * @interface/enum
 */
public class DBUtil {
    //这里可以设置数据库名称
    private final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final static String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=People";
//    private final static String DRIVER= "com.mysql.jdbc.Driver";
//    private final static String URL = "jdbc:mysql://127.0.0.1:3306/jsp?characterEncoding=UTF-8";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";
//    private static final String USER = "kevin";
//    private static final String PASSWORD = "0921";

    private static Connection conn = null;

    //静态代码块（将加载驱动、连接数据库放入静态块中）
    static {
        try {
            //1.加载驱动程序
            Class.forName(DRIVER);
            //2.获得数据库的连接
            conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //对外提供一个方法来获取数据库连接
    public static Connection getConnection() {
        return conn;
    }

    //测试用例
//    public static void main(String[] args) throws Exception {
//
//        //3.通过数据库的连接操作数据库，实现增删改查
//        Statement stmt = conn.createStatement();
//        //ResultSet executeQuery(String sqlString)：执行查询数据库的SQL语句   ，返回一个结果集（ResultSet）对象。
//        ResultSet rs = stmt.executeQuery("select id,name,age from BasicInfo");
//        while (rs.next()) {//如果对象中有数据，就会循环打印出来
//            System.out.println(rs.getInt("id") + "," + rs.getString("name") + "," + rs.getInt("age"));
//        }
//    }
}
