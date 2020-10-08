package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Exhibition() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h1 style=\"text-align: center; color:green;\">Text Fair 2020 Expo</h1>");
		printWriter.println("<table id=\"exhibition\"; border='1'; style=\"margin-left:42%\">");
		printWriter.println("<tr><td>Name</td><td>Text Fair 2020 Expo</td></tr>");
		printWriter.println("<tr><td>Hall Name</td><td>Pvr Superplex</td></tr>");
		printWriter.println("<tr><td>Start Date</td><td>10-10-2020</td></tr>");
		printWriter.println("<tr><td>End Date</td><td>20-10-2020</td></tr>");
		printWriter.println("</table>");
		printWriter.close();
	}

}
