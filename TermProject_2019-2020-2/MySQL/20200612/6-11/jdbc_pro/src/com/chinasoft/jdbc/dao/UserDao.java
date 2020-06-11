package com.chinasoft.jdbc.dao;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.chinasoft.jdbc.basemanage.BaseConnection;
import com.mysql.jdbc.PreparedStatement;

public class UserDao extends BaseConnection {
	
	public static int insertTbUser(String userName){
		int count=0;
		Connection con=null;
		CallableStatement stmt=null;
		try {
			con=getConnection();
			stmt=con.prepareCall("{CALL pro_tb_user_data(?)}");
			stmt.setString(1, userName);
			count=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}//得到Connection对象
		finally{
			try {
				stmt.close();
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int count=new UserDao().insertTbUser("user123");
		System.out.println(count);
	}

}
