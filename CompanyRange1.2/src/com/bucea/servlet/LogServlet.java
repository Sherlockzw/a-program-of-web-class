package com.bucea.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.bucea.bean.Employee;
import com.bucea.dao.impl.ManDaoImpl;

/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogServlet() {
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
		RequestDispatcher rds = null;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("usName");		
		String password = request.getParameter("usPwd");
		ManDaoImpl md = new ManDaoImpl();
		Employee emp = md.employeeCheck(username);
		if(emp != null) {
			String dbpassword = emp.getPassword();
			int li_id = emp.getLi_id();
			System.out.println(li_id);
			if(password.equals(dbpassword)) {
				request.getSession().setAttribute("employee", emp);
				if(li_id == 1) {
					rds = request.getRequestDispatcher("../employee/employee.jsp");
					rds.forward(request, response);
				}
				else if(li_id == 2) {
					rds = request.getRequestDispatcher("manage/manage.jsp");
					rds.forward(request, response);
				}else if(li_id == 3) {
					rds = request.getRequestDispatcher("admin/admin.jsp");
					rds.forward(request, response);
				}
			}
			else {
				JOptionPane.showMessageDialog(null,"用户名密码错误!","error",JOptionPane.ERROR_MESSAGE);
	        	request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}else {
			JOptionPane.showMessageDialog(null,"用户名不存在!","error",JOptionPane.ERROR_MESSAGE);
        	request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}
}