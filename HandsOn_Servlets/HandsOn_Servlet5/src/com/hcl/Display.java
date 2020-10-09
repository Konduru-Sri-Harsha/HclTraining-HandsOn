package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		ServletContext context = getServletContext();

		String date = request.getParameter("date");

		Enumeration<String> eventDates = context.getInitParameterNames();
		int j,count=0;

		while (eventDates.hasMoreElements()) {
			String dateParam = (String) eventDates.nextElement();

			if (date.equals(dateParam)) {

				writer.println("<h1 style='text-align:center;'>Event Details</h1>");
				writer.println("<table border='1' id=\"event\" style='margin-left:33%'>");
				writer.println("<tr><th>Event Name</th><th>Hall Name</th><th>Price</th></tr>");
				String value = context.getInitParameter(dateParam);
				String[] details = value.split("/");

				for (int i = 0; i < details.length; i++) {
					String[] eventDetails = details[i].split(",");
					j = 0;
					writer.println("<tr><td>" + eventDetails[j++] + "</td><td>" + eventDetails[j++] + "</td><td>"
							+ eventDetails[j] + "</td></tr>");
				}
				writer.println("</table>");
				count++;
				break;
			}
			
		}

		if(count==0) {
			RequestDispatcher rd = request.getRequestDispatcher("Index");
			writer.println("<h1 style='text-align:center;'>Search Event</h1>");
			writer.println("<p style='color:red; text-align:center;'>No Events are available on that date.</p>");
			writer.println("<p style='color:red; text-align:center;'>*Please Enter the Date between 10-10-2020 to 15-10-2020</p>");
			rd.include(request, response);
		}

	}
	
	
	}

