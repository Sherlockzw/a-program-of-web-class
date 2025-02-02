package com.bucea.dao.impl;

import java.sql.*;
import java.util.*;
import java.util.Date;

import org.junit.Test;

import com.bucea.bean.Employee;
import com.bucea.dao.IManDao;
import com.bucea.util.JDBCutil;

public class ManDaoImpl implements IManDao {
	Connection conn = null;
	PreparedStatement st = null;	
	ResultSet rs = null;

	/*
	 * @Test
	public void test() {
		Employee emp = new Employee();
		emp.setBirth(new Date());
		emp.setDuty("111");
		emp.setE_name("222");
		emp.setEntry_time(new Date());
		emp.setId("111");
		emp.setPassword("1234556");
		employeeAdd(emp);
	}
	 */
	public void employeeAdd(Employee emp) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "INSERT INTO employee(e_name,birth,duty,entry_time,id,password) VALUES(?,?,?,?,?,?)";
			st = conn.prepareStatement(sql);

			java.util.Date date=new java.util.Date();
			st.setString(1, emp.getE_name());
			st.setDate(2, new java.sql.Date(emp.getBirth().getTime()));
			st.setString(3, emp.getDuty());
			st.setDate(4, new java.sql.Date(emp.getEntry_time().getTime()));
			st.setString(5, emp.getId());
			st.setString(6, emp.getPassword());

			st.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}

	/*
	@Test
	public void Test2() {
		int id = 1012;
		employeeDelete(id);
	}
	 */
	public void employeeDelete(int id) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "DELETE FROM employee WHERE e_id = ?";
			st = conn.prepareStatement(sql);

			st.setInt(1, id);

			st.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}
	/*
	@Test 
	public void Test3() {
		employeeFind(1009);
	}
	*/
	public Employee employeeFind(int id) {
		Employee emo = null;
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT e_id,e_name,birth,duty,entry_time,id,password FROM employee WHERE e_id = ?";
			st = conn.prepareStatement(sql);

			st.setInt(1, id);

			rs = st.executeQuery();
			emo = new Employee();
			while(rs.next())  
			{  
				emo.setE_id(rs.getInt(1));
				emo.setE_name(rs.getString(2));
				emo.setBirth(rs.getDate(3));
				emo.setDuty(rs.getString(4));
				emo.setEntry_time(rs.getDate(5));
				emo.setId(rs.getString(6));
				emo.setPassword(rs.getString(7));
			} 
			System.out.println(emo.getBirth());
			System.out.println(emo.getDuty());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return emo;
	}
	
	@Test
	public void test() {
		Employee emp = new Employee();
		emp.setBirth(new Date());
		emp.setDuty("333");
		emp.setE_name("赵四");
		emp.setEntry_time(new Date());
		emp.setId("666");
		emp.setPassword("1234556");
		emp.setE_id(1013);
		employeeUpdate(emp);

	}
	 
	public void employeeUpdate(Employee emp) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "UPDATE employee SET e_name=?,birth=?,duty=?,entry_time=?,id=?,password=? WHERE e_id=? ";
			st = conn.prepareStatement(sql);

			java.util.Date date=new java.util.Date();
			st.setString(1, emp.getE_name());
			st.setDate(2, new java.sql.Date(emp.getBirth().getTime()));
			st.setString(3, emp.getDuty());
			st.setDate(4, new java.sql.Date(emp.getEntry_time().getTime()));
			st.setString(5, emp.getId());
			st.setString(6, emp.getPassword());
			st.setInt(7, emp.getE_id());

			int n = st.executeUpdate();
			System.out.println(emp.getE_id());

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}

	public ArrayList<Employee> employeeShow() {
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT e_id,e_name,birth,duty,entry_time,id,password FROM employee";
			st = conn.prepareStatement(sql);            

			rs = st.executeQuery();
			Employee emp = null;
			while(rs.next())  
			{  
				emp = new Employee();
				emp.setE_id(rs.getInt(1));
				emp.setE_name(rs.getString(2));
				emp.setBirth(rs.getDate(3));
				emp.setDuty(rs.getString(4));
				emp.setEntry_time(rs.getDate(5));
				emp.setId(rs.getString(6));
				emp.setPassword(rs.getString(7));

				list.add(emp);
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}

		return list;
	}
	public Employee employeeCheck(String name) {
		Employee emo = null;
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT e_name,li_id,password FROM employee WHERE e_name = ?";
			st = conn.prepareStatement(sql);

			st.setString(1, name);
			rs = st.executeQuery();
			emo = new Employee();
			while(rs.next())  
			{  
				emo.setE_name(rs.getString(1));
				emo.setLi_id(rs.getInt(2));
				emo.setPassword(rs.getString(3));
			} 
			System.out.println(emo.getE_name());
			System.out.println(emo.getPassword());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return emo;
	}
}