package com.hcl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Product p1= new Product();
		Product p2=new Product();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter details of product1:");
			System.out.println("Enter product code:");
			int code=Integer.parseInt(br.readLine());
			p1.setProduct_code(code);
			System.out.println("Enter name:");
			String name=br.readLine();
			p1.setProduct_name(name);
			System.out.println("Enter price:");
			double price= Double.parseDouble(br.readLine());
			p1.setPrice(price);
			System.out.println("Enter stock:");
			int stock= Integer.parseInt(br.readLine());
			p1.setStock(stock);
			
			System.out.println("Enter details of product2:");
			System.out.println("Enter product code:");
			int cod=Integer.parseInt(br.readLine());
			p2.setProduct_code(cod);
			System.out.println("Enter name:");
			String nam=br.readLine();
			p2.setProduct_name(nam);
			System.out.println("Enter price:");
			double pric= Double.parseDouble(br.readLine());
			p2.setPrice(pric);
			System.out.println("Enter stock:");
			int stoc= Integer.parseInt(br.readLine());
			p2.setStock(stoc);
		
			System.out.println("Product details:");
			p1.display();
			p2.display();
			p1.compare(p1, p2);

	}

}
