package com.killer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.killer.beans.LibrarianBean;
import com.killer.dao.LibrarianDao;

@WebServlet("/AddLibrarian")
public class AddLibrarian extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name = request.getParameter("lname");
		String email = request.getParameter("lemail");
		String password = request.getParameter("lpassword");
		int number = Integer.parseInt(request.getParameter("lnumber"));
		LibrarianBean lb = new LibrarianBean(name, email, password, number);
		LibrarianDao ld = new LibrarianDao();
		int status = ld.addLibrarian(lb);
		out.print("<h4>Librarian added successfully</h4>");
		out.print(status+" Row(s) affected</br>");
		out.print("<a href=\"AddLibrarian.jsp\">Add More Librarians</a><br>");
		out.print("<a href=\"AdminHome.jsp\">Home</a>");
	}

}
