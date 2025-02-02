package com.bucea.service.impl;

import java.util.ArrayList;

import com.bucea.bean.Employee;
import com.bucea.bean.Limit;
import com.bucea.dao.impl.LimDaoImpl;

public class LimServiceImpl {
	LimDaoImpl ld = new LimDaoImpl();
	//权限信息修改
	public int disUpdate(Employee emp) {
		return ld.disUpdate(emp);
	}
	//职务修改
	public void dutyUpdate(Employee emp) {
		ld.dutyUpdate(emp);
	}
	//权限信息显示
	public ArrayList<Limit> disShow(){
		return ld.disShow();
	}
	//员工权限信息显示
	public ArrayList<Employee> show(){
		return ld.show();
	}
}
