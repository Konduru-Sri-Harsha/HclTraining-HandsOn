package com.hcl4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hcl4.model.Employee;
import com.hcl4.util.DBConstants;
import com.hcl4.util.DBUtil;

public class Empdaoimpl implements Empdao {
	public boolean insert(Employee emp) {
		boolean isInserted=false;
		Connection con=null;
		PreparedStatement pst=null;
		try {
		con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				pst=con.prepareStatement("insert into emp(eno,name,address) values (?,?,?)");
				pst.setInt(1, emp.getEno());
				pst.setString(2,emp.getName());
				pst.setString(3, emp.getAddress());
				int i=pst.executeUpdate();
				if(i>0) {
					isInserted=true;
					pst.close();
					con.close();
				}
				
			}
		}
		catch(Exception e){
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		return isInserted;
	}

	public boolean delete(int eno) {
		boolean isDeleted=false;
		Connection con=null;
		PreparedStatement pst=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				pst=con.prepareStatement("delete from emp where eno=?");
				pst.setInt(1,eno);
				int i=pst.executeUpdate();
				if(i>0) {
					isDeleted=true;
					pst.close();
					con.close();
				}
			}
		}catch(Exception e) {
			try {
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return isDeleted;
	}

	public Employee get(int eno) {
		Employee emp=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				pst=con.prepareStatement("select * from emp where eno=?");
				pst.setInt(1,eno);
				rs=pst.executeQuery();
				rs.next();
				emp=new Employee(rs.getInt(1),rs.getString(2), rs.getString(3));
				con.close();
			}
		}catch(Exception e) {
			try {
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return emp;
	}

	public List<Employee> getAll() {
		List<Employee> emp= new ArrayList<>();
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DBUtil.getConnection(DBConstants.DRIVER,DBConstants.URL,DBConstants.UNAME,DBConstants.PWD);
			if(con!=null) {
				st=con.createStatement();
				rs=st.executeQuery("select eno,name,address from emp");
				while(rs.next()) {
				emp.add(new Employee(rs.getInt(1),rs.getString(2), rs.getString(3)));
			}
				con.close();
			}
		}catch(Exception e) {
			try {
				con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return emp;
	}

	

	
	}


