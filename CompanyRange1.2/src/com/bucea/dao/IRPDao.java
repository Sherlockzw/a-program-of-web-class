package com.bucea.dao;

import java.util.ArrayList;

import com.bucea.bean.Employee;

public interface IRPDao {
	
	//奖励增加
	public void awardAdd(Employee emp);
	//员工信息删除
	public void awardDelete(int id);
	//员工信息查找
	public Employee awardFind(int id);
	//员工信息修改
	public void awardUpdate(Employee emp);
	//员工信息显示
	public ArrayList<Employee> employeeShow();
}
