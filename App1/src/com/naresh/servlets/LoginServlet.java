package com.naresh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("hii this is my first application");
		writer.println("<br>");
		writer.println("this is post request");
	
       String uname = request.getParameter("uname");	
      
       String upwd = request.getParameter("upwd");
		 
		if(uname.equals("naresh")&&upwd.equals("reddy"))
		{
			writer.println("login success");
			 writer.println("<br>");
//			writer.println("user name:"+uname);
//			 writer.println("<br>");
//			writer.println("upwd:"+upwd);
			 //writer.println("<a href='http://www.facebook.com'>click here to redirect to fb</a>");
//			 
//			 response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
//			 response.setHeader("location", "http://www.facebook.com");
			 response.sendRedirect("http://www.facebook.com");
		}
		else
		{
			//writer.println("login failed");
			response.sendError(808, "Something went wrong!");
		}
		
		
		
		
		
		
		
		
	}

}
