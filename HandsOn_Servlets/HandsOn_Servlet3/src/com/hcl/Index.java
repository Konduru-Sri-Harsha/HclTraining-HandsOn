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
		PrintWriter writer= response.getWriter();
		writer.println("<form action=\"./Display\" method=\"post\">");
		writer.println("<h1>User Details</h1>");
		writer.println("Name :<input type=\"text\"; name=\"name\"><br><br>");
		writer.println("Phone Number :<input type=\"text\"; name=\"phoneNumber\"><br><br>");
		writer.println("Email :<input type=\"text\"; name=\"email\"><br><br>");
		writer.println("City :<input type=\"text\"; name=\"city\"><br><br>");
		writer.println("<input type=\"submit\"; id=\"submit\" value=\"submit\"><br><br></form>");
		writer.close();
	}

}
