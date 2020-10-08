package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		String name= request.getParameter("name");
		String phoneNumber= request.getParameter("phoneNumber");
		String email= request.getParameter("email");
		String city= request.getParameter("city");
		
		writer.println("<h1 style=\"text-align: center;\">User Details</h1>");
		writer.println("<table id=\"user\" border='1' style=\"margin-left:43.5%\"><tr><td>Name</td><td>"+name+"</td></tr>");
		writer.println("<tr><td>Phone Number</td><td>"+phoneNumber+"</td></tr>");
		writer.println("<tr><td>Email</td><td>"+email+"</td></tr>");
		writer.println("<tr><td>city</td><td>"+city+"</td></tr></table>");
		writer.close();
		
	}

}
