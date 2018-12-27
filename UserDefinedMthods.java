package oops;

import java.util.Scanner;

public class UserDefinedMthods 
{
	//method with arguments with return value - bidirectional communication
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	
	//method with no arguments with return value - unidirectional communication
	public int doubleNo()
	{
		return 5*5;
	}

	public static void main(String[] args)
	{
	
		int a,b,res;
		
		String firstname;
		
		String lastname="afdsfdsf";
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 nos");
		
		a = sc.nextInt();
		
		b= sc.nextInt();
		
		
		UserDefinedMthods udm = new UserDefinedMthods();
		
		res=udm.add(a,b);  //method calling
		
		System.out.println(res);
		
		res= udm.doubleNo(); // method calling
		
		System.out.println(res);
	
		
	}
	
	

}
