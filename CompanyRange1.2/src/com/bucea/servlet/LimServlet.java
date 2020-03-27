package com.bucea.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bucea.bean.Employee;
import com.bucea.bean.Limit;
import com.bucea.service.impl.LimServiceImpl;


/**
 * Servlet implementation class LimServlet
 */
@WebServlet(name="limServlet",urlPatterns= {"servlet/limServlet"})
public class LimServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException {
		doPost(request,response);		
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		String act = request.getParameter("act");
		try {
			if("update".equals(act)) {
				lim_update(request,response);
			} 
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void lim_update(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		
		Limit lim = new Limit();
		Employee emp =new Employee();

		String idStr = request.getParameter("e_id");
		int e_id = Integer.valueOf(idStr);				
		String duty = request.getParameter("duty");	
		String li_idStr = request.getParameter("li_id");
		int li_id = Integer.valueOf(li_idStr);
		emp.setDuty(duty);
		emp.setE_id(e_id);
		emp.setLi_id(li_id);
		LimServiceImpl ls = new LimServiceImpl();
		ls.dutyUpdate(emp);

		rds = request.getRequestDispatcher("success.jsp");
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
