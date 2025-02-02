package com.bucea.service.impl;

import java.util.ArrayList;

import com.bucea.bean.Employee;
import com.bucea.dao.impl.ManDaoImpl;
import com.bucea.service.IManService;

public  class ManServiceImpl implements IManService {
	ManDaoImpl md = new ManDaoImpl();
	public void empAdd(Employee emp) {
		md.employeeAdd(emp);
	}
	public void empDelete(int id) {
		md.employeeDelete(id);
	}
	public Employee empFind(int id) {
		return md.employeeFind(id);
	}
	public void empUpdate(Employee emp) {
		md.employeeUpdate(emp);
	}
	public  ArrayList<Employee> empShow(){
		return md.employeeShow();
	}
}
