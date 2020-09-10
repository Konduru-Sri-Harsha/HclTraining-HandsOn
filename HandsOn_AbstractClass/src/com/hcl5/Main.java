package com.hcl5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Event e= new Event(); 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the event:");
		String eventname= br.readLine();
		e.setName(eventname);
		System.out.println("Enter the detail of the event:");
		String detail=br.readLine();
		e.setDetail(detail);
		System.out.println("Enter the owner name of the event:");
		String owner= br.readLine();
		e.setOwnerName(owner);
		System.out.println("Enter the type of the event:\r\n" +"1.Exhibition\r\n" + "2.StageEvent\r\n" );
		int choice=Integer.parseInt(br.readLine());
		
		switch(choice)
		{
		case 1:
			Exhibition e1= new Exhibition();
			System.out.println("Enter the number of stalls:");
			int s= Integer.parseInt(br.readLine());
			double d=e1.projectedRevenue(s);
			System.out.println("The projected revenue of the event is "+d);
			break;
			
		case 2:
			StageEvent se= new StageEvent();
			System.out.println("Enter the number of shows:");
			int show= Integer.parseInt(br.readLine());
			System.out.println("Enter the number of seats per show:");
			int num = Integer.parseInt(br.readLine());
			double rev =se.projectedRevenue(show, num);
			System.out.println("The projected revenue of the event is "+rev);
			break;
				
		}
		
	}

}
