package com.bucea.dao;

import java.util.ArrayList;

import com.bucea.bean.Employee;
import com.bucea.bean.Limit;

public interface ILimDao {
	//权限信息修改
	public int disUpdate(Employee emp);
	//职务修改
	public void dutyUpdate(Employee emp);
	//权限信息显示
	public ArrayList<Limit> disShow();
	//员工权限信息显示
	public ArrayList<Employee> show();
}
