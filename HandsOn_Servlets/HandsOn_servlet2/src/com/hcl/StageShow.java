package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public StageShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1 style=\"text-align: center; color:green;\">New year eve</h1>");
		printWriter.println("<table id=\"StageShow\"; border='1'; style=\"margin-left:42%\">");
		printWriter.println("<tr><td>Name</td><td>New Year Eve</td></tr>");
		printWriter.println("<tr><td>Hall Name</td><td>Pvr Lulu mall</td></tr>");
		printWriter.println("<tr><td>Date</td><td>31-12-2020</td></tr>");
		printWriter.println("<tr><td>Start Time</td><td>10:00 PM</td></tr>");
		printWriter.println("<tr><td>End Time</td><td>1:00 AM</td></tr>");
		printWriter.println("</table>");
		printWriter.close();
	}

}
