package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Index() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h1 style=\"text-align: center;\">Event Mangement System</h1>");
		writer.println("<form action=\"./Welcome\" method=\"post\";");
		writer.println("<table style='margin-left:40%;'>");
		writer.println("<tr><td>Event Name </td><td><input type='text' name='eventName'></td></tr>");
		writer.println("</table>");
		writer.println("<input type='submit' id='submit' value='Go'>");
		
		writer.close();

	}

}
