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

		writer.println("<h1 style=\"text-align: center; color:green;\"> Event Creation </h1>");
		writer.println("<table style='margin-left:40%;'>");
		writer.println("<form action=\"./Validate\" method=\"post\">");
		writer.println("<tr><td>Event Name</td><td><input type=\"text\" name=\"eventName\"></td></tr>");
		writer.println("<tr><td>Hall Name</td><td><input type=\"text\" name=\"hallName\"></td></tr>");
		writer.println(
				"<tr><td>Event Type</td><td><input type=\"radio\"  value='Exhibition' name=\"type\">Exhibition<br>"
						+ "<input type=\"radio\"  value='Stage Event' name=\"type\">Stage Event</td></tr>");
		writer.println("<tr><td>Details</td><td><input type=\"text\" name=\"details\"></td></tr>");
		writer.println("<tr><td>Owner</td><td><input type=\"text\" name=\"owner\"></td></tr>");
		writer.println("<tr><td>Start Date</td><td><input type=\"text\" name=\"startDate\"></td></tr>");
		writer.println("<tr><td>End Date</td><td><input type=\"text\" name=\"endDate\"></td></tr>");
		writer.println("<tr><td></td><td><input type=\"submit\" id=\"submit\" value=\"create\"></td></tr>");
		writer.println("</form>");
		writer.println("</table>");
		writer.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		writer.println("<table style='margin-left:40%;'>");
		writer.println("<form action=\"./Validate\" method=\"post\">");
		writer.println("<tr><td>Event Name</td><td><input type=\"text\" name=\"eventName\"></td></tr>");
		writer.println("<tr><td>Hall Name</td><td><input type=\"text\" name=\"hallName\"></td></tr>");
		writer.println(
				"<tr><td>Event Type</td><td><input type=\"radio\"  value='Exhibition' name=\"type\">Exhibition<br>"
						+ "<input type=\"radio\"  value='Stage Event' name=\"type\">Stage Event</td></tr>");
		writer.println("<tr><td>Details</td><td><input type=\"text\" name=\"details\"></td></tr>");
		writer.println("<tr><td>Owner</td><td><input type=\"text\" name=\"owner\"></td></tr>");
		writer.println("<tr><td>Start Date</td><td><input type=\"text\" name=\"startDate\"></td></tr>");
		writer.println("<tr><td>End Date</td><td><input type=\"text\" name=\"endDate\"></td></tr>");
		writer.println("<tr><td></td><td><input type=\"submit\" id=\"submit\" value=\"create\"></td></tr>");
		writer.println("</form>");
		writer.println("</table>");
		writer.close();

	}

}
