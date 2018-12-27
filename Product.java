package oops;

public class Product 
{

	int productid;
	
	String prodname;
	
	float price;
	
	//Default constructor
	
	Product()
	{
		productid=0;
		
		prodname=null;
		
		price =0.0f;
	}
	
	//parameterized constructor
	/*
	Product(int pid, String pname, float rate)
	{
		productid = pid;
		
		prodname = pname;
		
		price = rate;
		
	}*/
	
	
	//this - denotes current instance or class
	
	Product(int productid, String prodname, float price)
	{
		this.productid = productid;
		
		this.prodname = prodname;
		
		this.price = price;
		
	}
	
	public void showProducts()
	{
		System.out.println("Product id:" + productid);
		
		System.out.println("Product name:" + prodname);
		
		System.out.println("Product Price:" + price);
	}
	
	
}
