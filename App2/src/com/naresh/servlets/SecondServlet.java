package com.naresh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SecondServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		ServletConfig config =this.getServletConfig();
		String dog = config.getInitParameter("dog");
		String cat = config.getInitParameter("cat");
		writer.println("******init param data*******");
		writer.println("<br>");
		writer.println("first init parameter"+dog);
		writer.println("<br>");
		writer.println("second init parameter"+cat);
		writer.println("<br>");
		
		ServletContext context = config.getServletContext();
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		
		writer.println("******context param data*******");
		writer.println("<br>");
		writer.println("first init parameter"+username);
		writer.println("<br>");
		writer.println("second init parameter"+password);
		writer.println("<br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
