package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Confirm")
public class Confirm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Confirm() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String seatType = request.getParameter("seatType");
		Integer ticketcount = Integer.parseInt(request.getParameter("ticketcount"));

		Integer cost = 0;

		if (seatType.equals("Platinum")) {

			cost = 300 * ticketcount;

		} else if (seatType.equals("Gold")) {

			cost = 250 * ticketcount;

		} else if (seatType.equals("Silver")) {

			cost = 150 * ticketcount;

		} else if (seatType.equals("Bronze")) {

			cost = 100 * ticketcount;

		}
		
		Cookie type= new Cookie("seatType", seatType);
		Cookie count= new Cookie("ticketcount",ticketcount.toString() );
		Cookie ticketcost= new Cookie("cost", cost.toString());
		response.addCookie(type);
		response.addCookie(count);
		response.addCookie(ticketcost);
		
		writer.println("<h1 style='text-align:center;'>Ticket Confirmation</h1>");
		writer.println("<div style='text-align:center;'> The ticket cost is"+cost+"<br>");
		writer.println("Do you want to confirm your ticket?</div>");
		writer.println("<form action='./Display' method='post' style='text-align:center;'>");
		writer.println("<input type='submit' value='Confirm' id='confirm'></form>");
		writer.println("<form action='./Index' method='get' style='text-align:center;'>");
		writer.println("<input type='submit' value='Cancel' id='cancel'></form>");
		writer.close();
	}

}
