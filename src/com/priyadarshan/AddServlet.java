package com.priyadarshan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	/*
	 * service allows GET and POST request, however GET request shows the parameters which we are passing in the input fields, won't be secure for passwords
	 * 
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { int i = Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * res.getWriter().println(i + j); }
	 */
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		res.getWriter().println(i + j);
		
		/*
		 * RequestDispatcher is an interface which is used to call a another servlet from one servlet
		 * as RequestDispatcher is an interface, to get the object of it, we will use a function called getRequestDispatcher("Servlet Name")
		 * and call it using req object
		 */
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("square");
		requestDispatcher.forward(req, res);
	}
}
