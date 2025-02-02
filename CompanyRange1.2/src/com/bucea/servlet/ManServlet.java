package com.bucea.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bucea.bean.Employee;
import com.bucea.service.IManService;
import com.bucea.service.impl.ManServiceImpl;

@WebServlet(name="manServlet",urlPatterns= {"servlet/manServlet"} )
public class ManServlet extends HttpServlet {	
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
				emp_add(request,response);
			} 
			else if("delete".equals(act)) {
				emp_delete(request,response);
			}
			else if("update".equals(act)) {
				emp_update(request,response);
			}
			else {
				emp_find(request,response);
			}
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void emp_add(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Employee emp = new Employee();

		SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd" ); 
		String e_name = request.getParameter("e_name");

		e_name = new String(e_name.getBytes("ISO-8859-1"), "UTF-8");
		System.out.println(e_name);

		String birthStr = request.getParameter("birth");					
		Date birth = sdf.parse(birthStr);

		String duty = request.getParameter("duty");
		String entry_timeStr = request.getParameter("entry_time");
		Date entry_time = sdf.parse(entry_timeStr);
		String id = request.getParameter("id");
		String password = request.getParameter("password");				

		emp.setE_name(e_name);
		emp.setBirth(birth);
		emp.setDuty(duty);
		emp.setEntry_time(entry_time);
		emp.setId(id);
		emp.setPassword(password);

		ManServiceImpl ms = new ManServiceImpl();
		ms.empAdd(emp);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}

	public void emp_delete(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Employee emp = new Employee();		

		String idStr = request.getParameter("id");
		int e_id = Integer.valueOf(idStr);


		ManServiceImpl ms = new ManServiceImpl();
		ms.empDelete(e_id);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);
	}

	public void emp_update(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		System.out.println("update!!!");
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Employee emp = new Employee();					

		String idStr = request.getParameter("e_id");
		int e_id = Integer.valueOf(idStr);
		emp.setE_id(e_id);

		SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd" ); 
		String e_name = request.getParameter("e_name");

		e_name = new String(e_name.getBytes("ISO-8859-1"), "UTF-8");
		String birthStr = request.getParameter("birth");					
		Date birth = sdf.parse(birthStr);
		String duty = request.getParameter("duty");
		String entry_timeStr = request.getParameter("entry_time");
		Date entry_time = sdf.parse(entry_timeStr);
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		out.println(e_name);
		emp.setE_id(e_id);
		emp.setE_name(e_name);
		emp.setBirth(birth);
		emp.setDuty(duty);
		emp.setEntry_time(entry_time);
		emp.setId(id);
		emp.setPassword(password);


		ManServiceImpl ms = new ManServiceImpl();
		ms.empUpdate(emp);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}
	public void emp_find(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Employee emp = new Employee();

		String idStr = request.getParameter("id");
		int e_id = Integer.valueOf(idStr);

		ManServiceImpl ms = new ManServiceImpl();
		emp = ms.empFind(e_id);
		request.setAttribute("emp", emp);

		rds = request.getRequestDispatcher("/manage/emp_find_show.jsp");
		rds.forward(request, response);
	}
/*
	public void emp_show(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		ArrayList<Employee> emp = new ArrayList<Employee>();

		ManServiceImpl ms = new ManServiceImpl();
		emp = ms.empShow();
		request.setAttribute("emp", emp);

		rds = request.getRequestDispatcher("/manage/show.jsp");
		rds.forward(request, response);
	}
	*/
}
