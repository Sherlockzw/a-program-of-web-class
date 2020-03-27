package com.bucea.service.impl;

import java.util.ArrayList;

import com.bucea.bean.Department;
import com.bucea.dao.impl.DepDaoImpl;

public class DepServiceImpl {
	DepDaoImpl dd = new DepDaoImpl();
	//部门信息添加
	public void depAdd(Department dep) {
		dd.departmentAdd(dep);
	}
	//部门信息删除
	public void depDelete(int id) {
		dd.departmentDelete(id);
	}
	//部门信息查询
	public Department depFind(int id) {
		return dd.departmentFind(id);
	}
	//部门信息修改
	public void depUpdate(Department dep) {
		dd.departmentUpdate(dep);
	}
	//部门信息显示
	public ArrayList<Department> depShow(){
		return dd.departmentShow();
	}
}
