package com.myclass.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Groupwork
 */
@WebServlet(urlPatterns = {"/groupwork.html","/groupwork-add.html","/groupwork-details.html"})
public class Groupwork extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		switch (action) {
		case "/groupwork.html":
			request.getRequestDispatcher("/views/groupwork/groupwork.jsp").forward(request, response);
			break;
		case "/groupwork-add.html":
			request.getRequestDispatcher("/views/groupwork/groupwork-add.jsp").forward(request, response);
			break;
		case "/groupwork-details.html":
			request.getRequestDispatcher("/views/groupwork/groupwork-details.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
