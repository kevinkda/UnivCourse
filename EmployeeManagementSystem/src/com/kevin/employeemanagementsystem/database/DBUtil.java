/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.employeemanagementsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Kevin KDA on 2019/11/1 9:38
 * @version 1.0
 * @project Java_Course_Assignments
 * @package com.kevin.employeemanagementsystem.database
 * @classname DBUtil
 * @description TODO
 * @interface/enum
 */
public class DBUtil {
    private final static String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    private final static String DRIVER_MYSQL8 = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/employeemanagementsystem?characterEncoding=UTF-8";
    private final static String URL_MYSQL8 = "jdbc:mysql://localhost:3306/employeemanagementsystem?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "0921";
    private static Connection conn = null;

    //静态代码块（将加载驱动、连接数据库放入静态块中）
    static {
        try {
            //1.加载驱动程序
            Class.forName(DRIVER_MYSQL);
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

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
