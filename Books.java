package oops;

import java.util.Scanner;

public class Books 
{
	
	private int bookid;
	
	private String bookname;
	
	private float price;
	
	//user defined methods
	public void getBooks()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bookid, name and price:");
		
		bookid = sc.nextInt();
		
		bookname = sc.next();
		
		price = sc.nextFloat();
	}
	
	public void showBooks()
	{
		System.out.println("Book id:" + bookid);
		
		System.out.println("Book Name:" + bookname);
		
		System.out.println("Price:" + price);
	}
}
