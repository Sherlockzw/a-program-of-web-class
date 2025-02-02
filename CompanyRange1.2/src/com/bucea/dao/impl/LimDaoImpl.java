package com.bucea.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bucea.bean.Employee;
import com.bucea.bean.Limit;
import com.bucea.dao.ILimDao;
import com.bucea.util.JDBCutil;

public class LimDaoImpl implements ILimDao {
	Connection conn = null;
	PreparedStatement st = null;	
	ResultSet rs = null;
	public int disUpdate(Employee emp) {		
		try {
			conn = JDBCutil.getConnection();
			String sql = "UPDATE employee SET li_id=? WHERE e_id=? ";
			st = conn.prepareStatement(sql);

			st.setInt(1, emp.getLi_id());
			st.setInt(2, emp.getE_id());
			
			int n = st.executeUpdate();
			System.out.println(emp.getLi_id());

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return emp.getLi_id();
	}
	
	public void dutyUpdate(Employee emp) {		
		try {
			conn = JDBCutil.getConnection();
			String sql = "UPDATE employee SET duty=?,li_id=? WHERE e_id=? ";
			st = conn.prepareStatement(sql);

			st.setString(1, emp.getDuty());
			st.setInt(2, emp.getLi_id());
			st.setInt(3, emp.getE_id());
			
			int n = st.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}
	
	public ArrayList<Employee> show(){
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT e_id,e_name,li_id,duty FROM employee";
			st = conn.prepareStatement(sql);            

			rs = st.executeQuery();
			Employee emp = null;
			while(rs.next())  
			{  
				emp = new Employee();
				emp.setE_id(rs.getInt(1));
				emp.setE_name(rs.getString(2));
				emp.setLi_id(rs.getInt(3));
				emp.setDuty(rs.getString(4));

				list.add(emp);
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return list;
	}
	
	public ArrayList<Limit> disShow(){
		ArrayList<Limit> list = new ArrayList<Limit>();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT li_id=?,li_name=? FROM limit_";
			st = conn.prepareStatement(sql);            

			rs = st.executeQuery();
			Limit lim = null;
			while(rs.next())  
			{  
				lim = new Limit();
				lim.setLi_id(rs.getInt(1));
				lim.setLi_name(rs.getString(2));
				
				list.add(lim);
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return list;
	}
	
}
