package com.hcl3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	private static int code;
	private static String name;
	private static double price;
	private static int stock;
	private static int NOP = 2;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Main m= new Main(); 
		int x;
		Product []p= new Product[NOP];
		
		for(x=0;x<NOP;x++) {
		p[x]= new Product();
		m.buildProduct();
		p[x].setProduct_code(code);
		p[x].setProduct_name(name);
		p[x].setPrice(price);
		p[x].setStock(stock);
		}
	
		for(x=0;x<NOP;x++) 
		{
			System.out.println("Product details are:");
			p[x].getDiscountedPrice();
			p[x].display();			
		
		}
		Product pro= Product.checkLessStock(p);
	
	System.out.println("The product with min stock is");
	System.out.println("L & K Suppliers");
	System.out.println("Name:"+pro.getProduct_name());
	System.out.println("Stock:"+pro.getStock());
	
		
		
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
	
	//i think it came yes
	}
	
	}


