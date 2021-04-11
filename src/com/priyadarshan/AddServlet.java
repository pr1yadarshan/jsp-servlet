package com.priyadarshan;

import java.io.IOException;

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
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		res.getWriter().println(i + j);
	}
}
