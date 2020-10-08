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
		PrintWriter printWriter= response.getWriter();
		printWriter.println("<body>");
		printWriter.println("<h1 style=\"text-align: center; color:hotpink;\"> Welcome to Hall Paradise </h1>");
		printWriter.println(" <p style=\"text-align: center;\">The type of events are</p> ");
		printWriter.println("<ul style=\"padding-left: 48%;\"><li>Exhibition</li>");
		printWriter.println("<li>Stage Show</li><ul>");
		printWriter.println("</body>");
		printWriter.close();
	}

}
