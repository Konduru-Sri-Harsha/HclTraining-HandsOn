package com.hcl1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		if(con!=null)
		{
			st=con.createStatement();
			rs=st.executeQuery("select eno,name,address from emp");
			while(rs.next()) {
			System.out.println("ID:"+rs.getInt(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Location:"+ rs.getString(3));
			System.out.println();
			}
			
		}
		st.close();
		con.close();
	}

}
