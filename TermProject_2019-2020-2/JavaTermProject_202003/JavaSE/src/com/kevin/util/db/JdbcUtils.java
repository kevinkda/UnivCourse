/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.kevin.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author Kevin KDA on 2020/3/23 09:14
 * @version 1.0
 * @project GPACalculator
 * @package com.kevin.util.db
 * @classname JdbcUtils
 * @description
 * @interface/enum
 */
public class JdbcUtils implements AutoCloseable {
    /**
     * 数据库驱动名称
     */
    private static final String DRIVER;
    /**
     * 数据库链接地址
     */
    private static final String URL;
    /**
     * 数据库用户名
     */
    private static final String USER;
    /**
     * 数据库密码
     */
    private static final String PASSWORD;
    private static Connection conn = null;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.kevin.util.resource.db.MySql");
        DRIVER = resourceBundle.getString("jdbc.driver");
        URL = resourceBundle.getString("jdbc.url");
        USER = resourceBundle.getString("jdbc.user");
        PASSWORD = resourceBundle.getString("jdbc.password");
    }

    /**
     * 对外提供一个方法来获取数据库连接
     *
     * @return void
     * @author Kevin KDA on 2019/10/31 21:53
     * @description DataBaseUtil / getConnection
     */
    public static Connection getConnection() {
        try {
//            1.加载驱动程序
            Class.forName(DRIVER);
//            2.获得数据库的连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 实现AutoCloseable接口 关闭数据库连接
     *
     * @return void
     * @author Kevin KDA on 2019/10/31 21:53
     * @description DataBaseUtil / getConnection
     */
    @Override
    public void close() throws Exception {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private JdbcUtils() {
    }
}
