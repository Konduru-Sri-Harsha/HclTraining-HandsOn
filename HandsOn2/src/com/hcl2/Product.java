package com.hcl2;


public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	private double discounted_price;
	private final String staticname = "L & K Suppliers";
	
	
	
public Product() {
	
}
	public Product(int product_code, String product_name, double price, int stock) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
		
		
	}
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getDiscounted_price() {
		return discounted_price;
	}
	public  void setDiscounted_price(double discounted_price) {
		this.discounted_price = discounted_price;
	}
	
	
	
void checkprice(Product p1,Product p2) 
		{
		if(p1.getPrice()>p2.getPrice()) 
			System.out.println(p2.getProduct_name()+" is cheaper than "+p1.getProduct_name());
		else
			System.out.println(p1.getProduct_name()+" is cheaper than "+p2.getProduct_name());
		}
void getDiscountedPrice()
	{
		if(price>=80000)
			discounted_price= (0.3*price);
		else if(price>=60000)
			discounted_price= (0.2*price);
		else if(price>=50000)
			discounted_price= (0.1*price);
		else if(price<50000)
			discounted_price= (0.05*price);
			
	}
void display() {
	System.out.println(staticname);
	System.out.println("Product code:"+ product_code);
	System.out.println("Name:"+ product_name);
	System.out.println("Stock:"+stock);
	System.out.println("Price:"+price);
	System.out.println("Discounted Price:"+discounted_price);
	
}
}
