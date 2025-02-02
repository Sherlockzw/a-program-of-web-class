package com.bucea.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.bucea.bean.Department;
import com.bucea.bean.Employee;
import com.bucea.dao.IDepDao;
import com.bucea.util.JDBCutil;

public class DepDaoImpl implements IDepDao {
	Connection conn = null;
	PreparedStatement st = null;	
	ResultSet rs = null;
	/*
	@Test
	public void Test1() {
		Department dep = new Department();
		dep.setD_name("编辑部");
		dep.setManage("李白");
		departmentAdd(dep);
	}
	 */
	public void departmentAdd(Department dep) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "INSERT INTO department(d_name,manager) VALUES(?,?)";
			st = conn.prepareStatement(sql);

			st.setString(1, dep.getD_name());
			st.setString(2, dep.getManager());

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
		int id = 5;
		departmentDelete(id);
	}
	 */
	public void departmentDelete(int id) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "DELETE FROM department WHERE d_id = ?";
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
		int id = 4;
		departmentFind(id);
	}
	 */
	public Department departmentFind(int id) {
		Department dep = null;
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT d_id,d_name,manager FROM department WHERE d_id = ?";
			st = conn.prepareStatement(sql);

			st.setInt(1, id);
			rs = st.executeQuery();

			dep = new Department();
			while(rs.next())  
			{  
				dep.setD_id(rs.getInt(1));;
				dep.setD_name(rs.getString(2));;
				dep.setManager(rs.getString(3));
			} 
			System.out.println("Find");
			System.out.println(dep.getD_name());
			System.out.println(dep.getManager());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return dep;
	}
	/*
	@Test
	public void test4() {
		Department dep = new Department();
		dep.setD_id(7);
		dep.setD_name("123");
		departmentUpdate(dep);
	}
	 */
	public void departmentUpdate(Department dep) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "UPDATE department SET d_name=?,manager=? WHERE d_id=? ";
			st = conn.prepareStatement(sql);

			java.util.Date date=new java.util.Date();
			st.setString(1, dep.getD_name());
			st.setString(2, dep.getManager());
			st.setInt(3, dep.getD_id());

			int n = st.executeUpdate();
			System.out.println(dep.getD_id());

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}

	@Test
	public void Test5() {
		ArrayList<Department> list = new ArrayList<Department>();
		list = departmentShow();
		for (int i = 0; i < list.size(); i++) {
			Department dep = list.get(i);
			System.out.println(dep.getD_id());
		}
	}
	public ArrayList<Department> departmentShow(){
		ArrayList<Department> list = new ArrayList<Department>();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT d_id,d_name,manager FROM department";
			st = conn.prepareStatement(sql);            

			rs = st.executeQuery();
			Department dep = null;
			while(rs.next())  
			{  
				dep = new Department();
				dep.setD_id(rs.getInt(1));
				dep.setD_name(rs.getString(2));
				dep.setManager(rs.getString(3));

				list.add(dep);
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return list;
	}
}
