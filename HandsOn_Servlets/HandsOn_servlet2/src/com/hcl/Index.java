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
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<body>");
		printWriter.println("<h1 style=\"text-align: center; color:green;\"> Welcome to Popular Paradise </h1>");
		printWriter.println("<div style=\"text-align: center;\">");
		printWriter.println("<a href=\"./Exhibition\">Exhibition</a><br>");
		printWriter.println("<a href=\"./StageShow\">StageShow</a>");
		printWriter.println("</div>");
		printWriter.println("</body>");
		printWriter.close();
	}

}
