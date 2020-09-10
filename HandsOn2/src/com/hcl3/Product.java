package com.hcl3;

public class Product {
	private int product_code;
	private String product_name;
	private double price;
	private int stock;
	private double discounted_price;
	private final static String staticname = "L & K Suppliers";
	
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
	
void checkprice(Product p[]) 
		{
		Product prod= new Product();
		double Min=99999;
		int j;
		for(j=1;j< p.length;) {
			if(p[j].price< Min)
			{
				prod= p[j];
				Min= prod.price;
				j++;
			}	
			else
				j++;
		}System.out.println(prod.getProduct_name()+"is cheapest");
		}

public static Product checkLessStock(Product p[]) 
	{
	Product pro =new Product();
	int min=99999;
	int x;
	for (x=0;x< p.length;x++)
		{
		if (p[x].stock < min) 
		{
			pro = p[x];	
			min=pro.stock;			
		}	
	
	}
	return pro;

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
	System.out.println("Discounted Price:"+discounted_price+"\n");
	
}
}




