package com.killer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.killer.dao.LoginDao;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String email = request.getParameter("aemail");
		String password = request.getParameter("apassword");

		LoginDao ld = new LoginDao();
		String name = ld.validateAdmin(email, password);
		if (ld.validateAdmin(email, password) != null) {
			HttpSession sess = request.getSession();
			sess.setAttribute("name", email);
			request.setAttribute("adminname", name);
			RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
			rd.include(request, response);
			rd.forward(request, response);
		} else {
			response.sendRedirect("AdminLogin.jsp");
		}

		
	}

}
