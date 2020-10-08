package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Validate() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String eventName = request.getParameter("eventName");
		String hallName = request.getParameter("hallName");
		String eventType = request.getParameter("type");
		String details = request.getParameter("details");
		String owner = request.getParameter("owner");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		if (eventName.isEmpty() || hallName.isEmpty() || eventType==null || details.isEmpty() || owner.isEmpty()
				|| startDate.isEmpty() || endDate.isEmpty()) {
			RequestDispatcher rd= request.getRequestDispatcher("./Index");
			writer.println("<h1 style=\"text-align: center; color:green;\"> Event Creation </h1>");
			writer.println("<div style='text-align: center; border: 2px solid red;'>");
			if(eventName.isEmpty()) {
				writer.println("<p style='color:red;'>Event name must not be empty</p>");
			}
			if(hallName.isEmpty()) {
				writer.println("<p style='color:red;'>Hall name must not be empty</p>");
			}
			if(eventType==null) {
				writer.println("<p style='color:red;'>Event Type must not be empty</p>");
			}
			if(details.isEmpty()) {
				writer.println("<p style='color:red;'>Details must not be empty</p>");
			}
			if(owner.isEmpty()) {
				writer.println("<p style='color:red;'>Owner must not be empty</p>");
			}
			if(startDate.isEmpty()) {
				writer.println("<p style='color:red;'>Start Date must not be empty</p>");
			}
			if(endDate.isEmpty()) {
				writer.println("<p style='color:red;'>End Date must not be empty</p>");
			}
			writer.println("</div>");
			writer.close();
			rd.include(request, response);

		} else {
			writer.println("<h1 style=\"text-align: center; color:green;\">Events Created Successfully!!!</h1>");
			writer.println("<h3 style='text-align:center;'>Event Details</h3>");
			writer.println("<table id='event' border='1' style='margin-left:44%;'>");
			writer.println("<tr><td>Event Name</td><td>" + eventName + "</td></tr>");
			writer.println("<tr><td>Hall Name</td><td>" + hallName + "</td></tr>");
			writer.println("<tr><td>Event Type</td><td>" + eventType + "</td></tr>");
			writer.println("<tr><td>Details</td><td>" + details + "</td></tr>");
			writer.println("<tr><td>Owner</td><td>" + owner + "</td></tr>");
			writer.println("<tr><td>Start Date</td><td>" + startDate + "</td></tr>");
			writer.println("<tr><td>End Date</td><td>" + endDate + "</td></tr>");
			writer.close();
		}
	}

}
