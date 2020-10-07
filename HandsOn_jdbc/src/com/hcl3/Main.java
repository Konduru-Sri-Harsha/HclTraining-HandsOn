package com.hcl3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con= null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			if(con!=null) {
			pst= con.prepareStatement("insert into emp(eno,name,address) values(?,?,?)");
			pst.setInt(1, 1);
			pst.setString(2, "varun");
			pst.setString(3, "hyd");
			int i=pst.executeUpdate();
			if(i>0)
				System.out.println("successfully inserted");
			else
				System.out.println("not inserted");
			con.close();
		}
		}catch (Exception e) {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		}
		finally {
			try {
				if(con!=null)
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
