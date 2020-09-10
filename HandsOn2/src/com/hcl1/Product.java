package com.hcl1;

public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	

	
public Product(int product_code, String product_name, double price, int stock) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}

public Product() {
	
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
void compare(Product p1,Product p2) {
	if(p1.getPrice()>p2.getPrice()) 
		System.out.println(p2.getProduct_name()+" is cheaper than "+p1.getProduct_name());
	else
		System.out.println(p1.getProduct_name()+" is cheaper than "+p2.getProduct_name());
	
}

void display() {
	
	System.out.println("Product code:"+ product_code);
	System.out.println("Name:"+ product_name);
	System.out.println("Price:"+price);
	System.out.println("Stock:"+stock);
	
}
	
}
