package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;
public class ThirdServlet extends HttpServlet{
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		System.out.println("This is get method of http protocol which is run by ThirdServlet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1> This is Third Servlet created by extending HttpServlet class. This class can give response to doGet() method</h1>");
		out.println(new Date().toString());
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		System.out.println("This is post method of http protocol which is run by ThirdServlet");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<h1> This is Third Servlet created by extending HttpServlet class. This class can give response to doPost() method</h1>");
		out.println(new Date().toString());
	}
}
