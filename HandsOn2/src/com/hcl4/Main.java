package com.hcl4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static int code;
	private static String name;
	private static double price;
	private static int stock;
	private static int choice;
	private static int NOP = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Main m= new Main(); 
		int x;
		Product []p= new Product[NOP];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Menu:");
		System.out.println("1. Add Products\n" + 
				"2. Display Products\n" + 
				"3. Get Discounted Price\n" + 
				"4. Find costly Product\n" + 
				"5. Check Min Stock\n" + 
				"6. Exit\n" + 
				"Enter Choice\n" );
	 choice=Integer.parseInt(br.readLine());
		do {
		switch (choice)
		{
		case 1:
			
			for(x=0;x<NOP;x++)
			{
			p[x]= new Product();
			m.buildProduct();
			p[x].setProduct_code(code);
			p[x].setProduct_name(name);
			p[x].setPrice(price);
			p[x].setStock(stock);
			}p[1].menu();
			choice=Integer.parseInt(br.readLine());
			break;			
			
		case 2:
			for(x=0;x<NOP;x++) 
			{
				System.out.println("Product details are:");
				p[x].getDiscountedPrice();
				p[x].getDiscountedPrice();
				p[x].display();			
			}p[1].menu();
			 choice=Integer.parseInt(br.readLine());
			break;
		case 3:
			
			System.out.println("Discounted Price of products:");
			for(x=0;x<NOP;x++)
			{
				System.out.println("product Name"+"\t\t\t"+"Discount Price");
				System.out.println(p[x].getProduct_name()+"\t\t\t\t"+p[x].getDiscounted_price());
		    }p[1].menu();
		     choice=Integer.parseInt(br.readLine());
		     break;
		case 4:
			Product prod=Product.checkprice(p);
			System.out.println(prod.getProduct_name()+" is costly");
			prod.menu();
			 choice=Integer.parseInt(br.readLine());
			break;
		case 5:
			Product product=Product.checkLessStock(p);
			System.out.println("The product with min stock is");
			System.out.println("L & K Suppliers");
			System.out.println("Name:"+product.getProduct_name());
			System.out.println("Stock:"+product.getStock());
			product.menu();
		    choice=Integer.parseInt(br.readLine());
			break;
		case 6:
			break;
		}
		}while(choice<=6);	
		
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

