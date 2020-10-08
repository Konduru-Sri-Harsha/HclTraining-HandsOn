package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
		
		writer.println("<h1 style='text-align:center;'>Ticket Booking done successfully<h1>");
		writer.println("<table border='1' id='ticketDetails' style='margin-left:43%;'>");
		Cookie cookies[]= request.getCookies();
		writer.println("<tr><td>Ticket Type</td><td>"+cookies[0].getValue()+"</td></tr>");
		writer.println("<tr><td>Number of Tickets</td><td>"+cookies[1].getValue()+"</td></tr>");
		writer.println("<tr><td>Ticket Cost</td><td>"+cookies[2].getValue()+"</td></tr></table>");
		
		
	
	}

}
