package com.bucea.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.bucea.bean.Award;
import com.bucea.bean.Award2;
import com.bucea.bean.Employee;
import com.bucea.bean.Punish;
import com.bucea.bean.Punish2;
import com.bucea.util.JDBCutil;

public class RPDaoImpl {
	Connection conn = null;
	PreparedStatement st = null;	
	ResultSet rs = null;
	/*
	@Test
	public void test() {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		ArrayList<Award> awas = new ArrayList<Award>();
		awardShow(emps,awas);
	}
	 */
	/*
	public ArrayList awardShow() {
		ArrayList list = new ArrayList();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT distinct employee.e_id,e_name,award.awa_id,awa_name FROM employee,award,award2 WHERE award.awa_id=award2.awa_id and award2.e_id=employee.e_id  ";
			st = conn.prepareStatement(sql);

			rs = st.executeQuery();
			Employee emp = null;
			Award awa = null;
			Award2 awa2 = null;
			while(rs.next())  
			{  
				emp = new Employee();
				awa = new Award();
				awa2 = new Award2();
				emp.setE_id(rs.getInt(1));
				emp.setE_name(rs.getString(2));
				list.add(emp);
				awa.setAwa_id(rs.getInt(3));
				awa.setAwa_name(rs.getString(4));
				list.add(awa);
			} 
			System.out.println(emp.getE_id());
			System.out.println(awa.getAwa_id());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
		return list;
	}
	 */

	public void awardShow(ArrayList<Employee> emps,ArrayList<Award> awas) {
		//ArrayList list = new ArrayList();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT distinct employee.e_id,e_name,award.awa_id,awa_name FROM employee,award,award2 WHERE award.awa_id=award2.awa_id and award2.e_id=employee.e_id  ";
			st = conn.prepareStatement(sql);

			rs = st.executeQuery();
			Employee emp = null;
			Award awa = null;
			Award2 awa2 = null;
			while(rs.next())  
			{  
				emp = new Employee();
				awa = new Award();
				awa2 = new Award2();
				emp.setE_id(rs.getInt(1));
				emp.setE_name(rs.getString(2));
				emps.add(emp);
				awa.setAwa_id(rs.getInt(3));
				awa.setAwa_name(rs.getString(4));
				awas.add(awa);
			} 
			System.out.println(emp.getE_id());
			System.out.println(awa.getAwa_id());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}
	@Test
	public void test() {
		Award2 awa2 = new Award2();
		awa2.setAwa_id(1);
		awa2.setE_id(1013);
		awardAdd(awa2);
	}
	public void awardAdd(Award2 awa2) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "INSERT INTO award2(e_id,awa_id) VALUES(?,?)";
			st = conn.prepareStatement(sql);

			st.setInt(1, awa2.getAwa_id());
			st.setInt(2, awa2.getE_id());

			st.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}

	public void awardDelete(int e_id,int awa_id) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "DELETE FROM award2 WHERE e_id = ? AND awa_id=?";
			st = conn.prepareStatement(sql);

			st.setInt(1, e_id);
			st.setInt(2, awa_id);

			st.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}
	public void awardUpdate(Award awa) {
		try {
			conn = JDBCutil.getConnection();
			String sql = "UPDATE award SET awa_id=?,awa_name=? ";
			st = conn.prepareStatement(sql);

			st.setInt(1, awa.getAwa_id());
			st.setString(2, awa.getAwa_name());

			int n = st.executeUpdate();
			System.out.println(awa.getAwa_name());

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}

	public void punishShow(ArrayList<Employee> emps,ArrayList<Punish> awas) {
		//ArrayList list = new ArrayList();
		try {
			conn = JDBCutil.getConnection();
			String sql = "SELECT distinct employee.e_id,e_name,punishment.pun_id,pun_name FROM employee,punish,punishment WHERE punishment.pun_id=punish.pun_id and puish.e_id=employee.e_id  ";
			st = conn.prepareStatement(sql);

			rs = st.executeQuery();
			Employee emp = null;
			Punish awa = null;
			Punish2 awa2 = null;
			while(rs.next())  
			{  
				emp = new Employee();
				awa = new Punish();
				awa2 = new Punish2();
				emp.setE_id(rs.getInt(1));
				emp.setE_name(rs.getString(2));
				emps.add(emp);
				awa.setPunish_id(rs.getInt(3));
				awa.setPunish_name(rs.getString(4));
				awas.add(awa);
			} 
			System.out.println(emp.getE_id());
			System.out.println(awa.getPunish_id());
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.colseResource(conn, st, rs);
		}
	}
}
