package com.bucea.dao;

import java.util.ArrayList;

import com.bucea.bean.Department;
public interface IDepDao {
	//部门信息添加
	public void departmentAdd(Department dep);
	//部门信息删除
	public void departmentDelete(int id);
	//部门信息查找
	public Department departmentFind(int id);
	//部门信息修改
	public void departmentUpdate(Department dep);
	//部门信息显示
	public ArrayList<Department> departmentShow();
}
