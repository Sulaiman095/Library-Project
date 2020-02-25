package com.killer.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.killer.beans.LibrarianBean;
import com.killer.dao.LibrarianDao;


@WebServlet("/ViewLibrarians")
public class ViewLibrarians extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibrarianDao ld = new LibrarianDao();
		ArrayList<LibrarianBean> list = ld.viewLibrarian();
		request.setAttribute("view", list);
		RequestDispatcher rd = request.getRequestDispatcher("ViewLibrarian.jsp");
		rd.forward(request, response);
	}

}
