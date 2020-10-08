package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String eventname = request.getParameter("eventName");

		HttpSession session = request.getSession();
		session.setAttribute("eventname", eventname);
		writer.println("<form action=\"./Display\" method='post'>");
		writer.println("<h1 style=\"text-align: center;\">Event Mangement System</h1>");
		writer.println("<div style='text-align:center; color:green;'>Welcome to this Event " + eventname + "</div><br>");
		writer.println("<input style='margin-left:45%;' type='submit' id='tag' value= 'Get Details'></form>");
		writer.close();

	}

}
