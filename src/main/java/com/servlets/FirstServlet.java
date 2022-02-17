package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
public class FirstServlet implements Servlet 
{
	
	ServletConfig cong;
	//override life-cycle methods every time server will call them
	public void init(ServletConfig cong)  {
		this.cong=cong;
		// if we want to initialize any the we write here
		System.out.println("initializing servlet object");
	}
	public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException{
		//whatever logic want to execute we write here
		System.out.println("Servicing......");
		System.out.println("This is first servlet application created by implementing servlet interface");
		// set content type of response it is of type html because browser will understand html
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>This is output from FirstServlet method:java is able to give html page(resposne object has getWriter() method and return type of this methos is PrintWriter and this is able to print on frontend)</h1>");
		out.println("<h1>Today's Date and Time is "+new Date().toString()+ "</h1>");
		out.println("<h1>Define lifecycle methods of servlet \r\n"
				+ "\r\n"
				+ "When server creates servlet object than to initialize it run init() method, when some request comes to it(server) to  process it, it runs service() method. Finally when our object is going to destroy it(server) runs destroy() method  \r\n"
				+ "\r\n"
				+ " </h1>");
		
	}
	public void destroy() {
		System.out.println("going to destroy servlet object.....");
	}
	//overriding non life-cycle methods which not called by server we call them
	public ServletConfig getServletConfig() {
		return cong;
	}
	public String getServletInfo() {
		return "This servlet is created by aalam";
		
	}
	
}
