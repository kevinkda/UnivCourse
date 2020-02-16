/*
 * Copyright (c) 2020 Kevin KDA. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.pxy.lesson12;
import java.sql.*;

public class DBManage {
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	//连接MSSQL
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String url = "jdbc:sqlserver://localhost;databasename=db_music";
	//连接MySQL
//	static String driver = "com.mysql.jdbc.Driver";
//	static String url = "jdbc:mysql://127.0.0.1:3306/db_music?characterEncoding=UTF-8";
	//连接Oracle
//	static String driver = "oracle.jdbc.driver.OracleDriver";// 连接驱动
//	static String url = "jdbc:oracle:thin:@localhost:1521:ORCL";// 访问oracle路径

	private static Connection getConnect(){
		try {
			Class.forName(driver);	
			con = DriverManager.getConnection(url,"sa","123");		//连接MSSQL
//			con = DriverManager.getConnection(url,"root","root");	//连接mysql
//			con = DriverManager.getConnection(url,"scott","tiger");	//连接mysql
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static ResultSet getResultSet(String sql){
		con = getConnect();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static ResultSet getResultSet(String sql,Object[] params){
		con = getConnect();
		try {
			ps = con.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) 
				ps.setObject(i+1, params[i]);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static int modifyEntiy(String sql, Object[] params){
		int num = 0;
		con = getConnect();
		try {
			ps = con.prepareStatement(sql);
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i+1, params[i]);
			}
			num = ps.executeUpdate();
			closeAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return num;
	}

	public static void closeAll(){
		if (ps != null){
			try {
				ps.close();
				ps = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con != null){
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
