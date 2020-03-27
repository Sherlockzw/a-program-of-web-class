package com.bucea.bean;

import java.util.Date;
import java.util.List;

public class Employee {
	int e_id;
	int li_id;
	int d_id;
	String e_name;
	Date birth;
	String duty;
	Date entry_time;
	String id;
	int week_num;
	int month_num;
	String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public int getLi_id() {
		return li_id;
	}
	public void setLi_id(int li_id) {
		this.li_id = li_id;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWeek_num() {
		return week_num;
	}
	public void setWeek_num(int week_num) {
		this.week_num = week_num;
	}
	public int getMonth_num() {
		return month_num;
	}
	public void setMonth_num(int month_num) {
		this.month_num = month_num;
	}
}
