package com.bucea.service;

import java.util.ArrayList;

import com.bucea.bean.Department;

public interface IDepService {
	//部门信息添加
	public void depAdd(Department dep);
	//部门信息删除
	public void depDelete(int id);
	//部门信息查询
	public Department depFind(int id);
	//部门信息修改
	public void depUpdate(Department dep);
	//部门信息显示
	public ArrayList<Department> depShow();
}
