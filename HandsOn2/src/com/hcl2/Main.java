package com.hcl2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	
	private static int code;
	private static String name;
	private static double price;
	private static int stock;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Main m= new Main(); 
		int x;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of products:");
		int i= Integer.parseInt(br.readLine());
		Product []p= new Product[i];
		for(x=1;x<=i;x++) {
		p[x]= new Product();
		m.buildProduct();
		p[x].setProduct_code(code);
		p[x].setProduct_name(name);
		p[x].setPrice(price);
		p[x].setStock(stock);
		}
		for(x=1;x<=i;x++) 
		{
			System.out.println("Product details are:");
			p[x].getDiscountedPrice();
			p[x].getDiscountedPrice();
			p[x].display();			
		
		}
		p[1].checkprice(p[1], p[2]);
		
	}
void buildProduct() throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter details of product:");
	System.out.println("Enter product code:");
	code = Integer.parseInt(br.readLine());
	
	System.out.println("Enter name:");
	 name=br.readLine();
	
	
	System.out.println("Enter price:");
	 price= Double.parseDouble(br.readLine());
	
	
	System.out.println("Enter stock:");
	 stock= Integer.parseInt(br.readLine());
	
	
	}
	
	}

