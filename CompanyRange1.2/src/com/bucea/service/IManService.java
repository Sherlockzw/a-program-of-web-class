package com.bucea.service;

import java.util.ArrayList;

import com.bucea.bean.Employee;

public interface IManService {
	//员工信息添加
	public void empAdd(Employee emp);
	//员工信息删除
	public void empDelete(int id);
	//员工信息查询
	public Employee empFind(int id);
	//员工信息修改
	public void empUpdate(Employee emp);
	//员工信息显示
	public ArrayList<Employee> empShow();
}
