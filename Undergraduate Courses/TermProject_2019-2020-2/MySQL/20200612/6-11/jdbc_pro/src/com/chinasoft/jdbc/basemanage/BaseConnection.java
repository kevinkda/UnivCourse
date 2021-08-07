package com.chinasoft.jdbc.basemanage;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseConnection {
	private static String url="jdbc:mysql://127.0.0.1:3306/test";
	
	private static String driverClass="com.mysql.jdbc.Driver";
	
	private static String username="root";
	
	private static String password="root";
	
	
	public  static Connection getConnection(){
		Connection con=null;
		try {
			Class.forName(driverClass);
			con=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}
	
//	public static void main(String[] args) {
//		System.out.println(getConnection());
//	}

}
