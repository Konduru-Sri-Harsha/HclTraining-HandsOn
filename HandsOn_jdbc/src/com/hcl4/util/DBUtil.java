package com.hcl4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection(String driver,String url,String uname,String pwd) throws ClassNotFoundException {
	Connection con=null;
	
		Class.forName(driver);
		try {
			con= DriverManager.getConnection(url,uname,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	
	
	}
}
