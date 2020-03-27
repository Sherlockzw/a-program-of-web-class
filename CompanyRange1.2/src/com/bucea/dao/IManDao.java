package com.bucea.dao;

import java.util.ArrayList;
import java.util.List;

import com.bucea.bean.Employee;

public interface IManDao {
	//员工信息添加
	public void employeeAdd(Employee emp);
	//员工信息删除
	public void employeeDelete(int id);
	//员工信息查找
	public Employee employeeFind(int id);
	//员工信息修改
	public void employeeUpdate(Employee emp);
	//员工信息显示
	public ArrayList<Employee> employeeShow();
}
