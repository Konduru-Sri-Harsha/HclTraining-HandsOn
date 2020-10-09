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

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h1 style='text-align:center;'>Search Event</h1>");
		
		writer.println("<form action=\"./Display\" method=\"POST\" style='text-align:center;'>");
		writer.println("<p style='color: red'>*Enter the Date between 10-10-2020 to 15-10-2020</p>");
		writer.println("Enter Date <input type=\"text\" name=\"date\"><br>");
		writer.println("<br><input type=\"submit\" id=\"search\" value=\"Search\">");
		writer.println("</form>");
		writer.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<form action=\"./Display\" method=\"POST\" style='text-align:center;'>");
		writer.println("Enter Date <input type=\"text\" name=\"date\"><br>");
		writer.println("<br><input type=\"submit\" id=\"search\" value=\"Search\">");
		writer.println("</form>");
		writer.close();
	}

}
