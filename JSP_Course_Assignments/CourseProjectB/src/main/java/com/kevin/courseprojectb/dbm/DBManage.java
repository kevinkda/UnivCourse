package com.kevin.courseprojectb.dbm;

import java.sql.*;

/**
 * @author Kevin KDA on 2019/12/5 23:08
 * @version 1.0
 * @project JSP_Course_Assignments
 * @package com.kevin.courseprojectb.dbm
 * @classname DBManage
 * @description TODO
 * @interface/enum
 */
public class DBManage {
    static Connection con = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    /**
     * 连接MSSQL
     */
//	private final static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	private final static String url = "jdbc:sqlserver://localhost;databasename=jsp";
    /**
     * 连接MySQL 5 JDK 7 以下
     */
    private final static String driver = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://127.0.0.1:3306/jsp?characterEncoding=UTF-8";
    /**
     * 连接MySQL  JDK 8 以下
     */
//    private final static String url = "jdbc:mysql://192.168.1.22:3306/jsp?characterEncoding=UTF-8";
//    private final static String driver = "com.mysql.cj.jdbc.Driver";
//    private final static String url = "jdbc:mysql://localhost:3306/jsp?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
    /**
     * 连接Oracle
     */
    //连接驱动
//	private final static String driver = "oracle.jdbc.driver.OracleDriver";
    //访问oracle路径
//	private final static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/11/20 00:49
     * @description DBManage / getConnect TODO 提供一个私有方法来获取数据库连接
     * @returns java.sql.Connection
     */
    private static Connection getConnect() {
        try {
            Class.forName(driver);
            //连接MSSQL
//            con = DriverManager.getConnection(url, "kevin", "0921");
            //连接mysql
            con = DriverManager.getConnection(url, "kevin", "0921");
            //连接mysql
//			con = DriverManager.getConnection(url,"scott","tiger");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static ResultSet getResultSet(String sql) {
        con = getConnect();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static ResultSet getResultSet(String sql, Object[] params) {
        con = getConnect();
        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            rs = ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static int modifyEntiy(String sql, Object[] params) {
        int num = 0;
        con = getConnect();
        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            num = ps.executeUpdate();
            closeAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }


    /**
     * @param table
     * @param values
     * @param params
     * @throws
     * @author Kevin KDA on 2019/11/21 11:23
     * @description DBManage / addData TODO 提供单个Contact导入数据库
     * @returns boolean
     */
//    public static boolean addData(String table, String values, Object... params) {
//        Connection conn = DBUtil.getConnection();
//        String sql = "INSERT INTO " + table + " VALUES(" + values + ")";
////        String sql = "insert into"+" table + "(name,phone) " + "values(?,?)";
//        try {
//            System.out.println(sql);
//            PreparedStatement psmt = conn.prepareStatement(sql);
//
//            for (int i = 0; i < params.length; i++) {
//                psmt.setString(i+1, String.valueOf(params[i]));
//            }
//
//            return psmt.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
    public static boolean addData(String table, String values, Object... params) {
        Connection conn = getConnect();
//        String sql = "INSERT INTO " + table + " VALUES(" + values + ")";
//        String sql = "insert into"+" table + "(name,phone) " + "values(?,?)";
        String sql = "INSERT INTO jsp.table_db(loginID,loginPass,phoneNum) VALUES(?,?,?)";

        try {
            System.out.println(sql);
            PreparedStatement psmt = conn.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                System.out.println(String.valueOf(params[i]));
                psmt.setString(i + 1, String.valueOf(params[i]));
                System.out.println(psmt);
            }

            return psmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @param []
     * @throws
     * @author Kevin KDA on 2019/11/20 00:49
     * @description DBManage / closeAll TODO 提供关闭数据库连接的方法
     * @returns void
     */
    public static void closeAll() {
        if (ps != null) {
            try {
                ps.close();
                ps = null;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
                con = null;
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
