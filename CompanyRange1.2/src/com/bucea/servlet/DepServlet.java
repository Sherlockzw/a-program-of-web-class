package com.bucea.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bucea.bean.Department;
import com.bucea.service.impl.DepServiceImpl;

@WebServlet(name="depServlet",urlPatterns= {"servlet/depServlet"} )
public class DepServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		doPost(request,response);		
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		String act = request.getParameter("act");
		try {
			if("add".equals(act)) {
				dep_add(request,response);
			} 
			else if("delete".equals(act)) {
				dep_delete(request,response);
			}
			else if("update".equals(act)) {
				dep_update(request,response);
			}
			else {
				dep_find(request,response);
			}
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dep_add(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Department dep = new Department();

		String d_name = request.getParameter("d_name");
		d_name = new String(d_name.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(d_name);
		String manager = request.getParameter("manager");
		manager = new String(manager.getBytes("ISO-8859-1"), "UTF-8");	
		System.out.println(manager);
		dep.setD_name(d_name);
		dep.setManager(manager);
		
		DepServiceImpl ds = new DepServiceImpl();
		ds.depAdd(dep);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}

	public void dep_delete(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Department dep = new Department();		

		String idStr = request.getParameter("d_id");
		int d_id = Integer.valueOf(idStr);
		
		DepServiceImpl ds = new DepServiceImpl();
		ds.depDelete(d_id);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);
	}

	public void dep_update(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Department dep = new Department();					

		String idStr = request.getParameter("d_id");
		int d_id = Integer.valueOf(idStr);
		dep.setD_id(d_id);
		
		String d_name = request.getParameter("d_name");
		String manager = request.getParameter("manager");

		d_name = new String(d_name.getBytes("ISO-8859-1"), "UTF-8");
		manager = new String(manager.getBytes("ISO-8859-1"), "UTF-8");		
		System.out.println(d_name);
		System.out.println(manager);
		out.println(d_name);
		dep.setD_id(d_id);
		dep.setD_name(d_name);
		dep.setManager(manager);

		DepServiceImpl ds = new DepServiceImpl();
		ds.depUpdate(dep);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}
	public void dep_find(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		
		Department dep = new Department();
		String idStr = request.getParameter("d_id");
		int d_id = Integer.valueOf(idStr);

		DepServiceImpl ds = new DepServiceImpl();
		dep = ds.depFind(d_id);
		request.setAttribute("dep", dep);

		rds = request.getRequestDispatcher("/admin/dep_find_show.jsp");
		rds.forward(request, response);
	}
/*
	public void dep_show(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		ArrayList<Department> dep = new ArrayList<Department>();

		DepServiceImpl ds = new DepServiceImpl();
		dep = ds.depShow();
		request.setAttribute("dep", dep);

		rds = request.getRequestDispatcher("/manage/show.jsp");
		rds.forward(request, response);
	}
	*/
}
