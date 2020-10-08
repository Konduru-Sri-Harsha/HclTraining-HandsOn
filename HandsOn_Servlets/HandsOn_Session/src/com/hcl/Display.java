package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Display() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		HttpSession session = request.getSession();
		writer.println("<h1 style=\"text-align: center;\">Event Mangement System</h1>");
		writer.println("<div style='text-align:center;'>Event " + session.getAttribute("eventname")
				+ " is planned to held on 2020-10-20 in Rudolfinum.</div>");
		writer.close();

	}

}
