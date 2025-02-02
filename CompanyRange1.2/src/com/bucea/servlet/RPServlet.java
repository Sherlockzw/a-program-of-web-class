package com.bucea.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bucea.bean.Award;
import com.bucea.bean.Award2;
import com.bucea.bean.Employee;
import com.bucea.dao.impl.RPDaoImpl;
import com.bucea.service.impl.ManServiceImpl;

/**
 * Servlet implementation class RPServlet
 */
@WebServlet("/RPServlet")
public class RPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RPServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act = request.getParameter("act");
		try {
			if("add".equals(act)) {
				awa_add(request,response);
			} 
			else if("delete".equals(act)) {
				awa_delete(request,response);
			}
			else if("update".equals(act)) {
				awa_update(request,response);
			}
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void awa_add(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Award2 awa2 = new Award2();

		String awa_idStr = request.getParameter("awa_id");
		int awa_id = Integer.valueOf(awa_idStr);
		String e_idStr = request.getParameter("e_id");
		int e_id = Integer.valueOf(e_idStr);
		
		awa2.setAwa_id(awa_id);
		awa2.setE_id(e_id);
		RPDaoImpl rd = new RPDaoImpl();
		rd.awardAdd(awa2);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}
	public void awa_delete(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Award2 awa2 = new Award2();

		String awa_idStr = request.getParameter("awa_id");
		int awa_id = Integer.valueOf(awa_idStr);
		String e_idStr = request.getParameter("e_id");
		int e_id = Integer.valueOf(e_idStr);

		RPDaoImpl rd = new RPDaoImpl();
		rd.awardDelete(e_id, awa_id);
		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}
	public void awa_update(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException, ParseException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestDispatcher rds = null;
		PrintWriter out = response.getWriter();
		Award awa = new Award();

		String awa_idStr = request.getParameter("awa_id");
		int awa_id = Integer.valueOf(awa_idStr);
		String awa_name = request.getParameter("awa_name");
		
		awa.setAwa_id(awa_id);
		awa.setAwa_name(awa_name);
		
		RPDaoImpl rd = new RPDaoImpl();
		rd.awardUpdate(awa);

		rds = request.getRequestDispatcher("success.jsp");
		rds.forward(request, response);

	}
}
