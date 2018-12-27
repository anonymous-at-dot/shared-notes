package oops;

import java.util.Scanner;

public class Student 		//base class
{
	
	int rno;
	
	String name;
	
	
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rollno,name:");
		
		rno = sc.nextInt();
		
		name = sc.next();
	}
	
	public void showData()
	{
		System.out.println("Name:" + name + "\t Rno:" + rno);
	}
	
}


class Marks extends Student		//derived class
{
	int m1,m2;
	
	public void getMarks()
	{
		
		getData();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 marks:");
		
		m1= sc.nextInt();
		m2 =sc.nextInt();
	}
	
	public void showMarks()
	{
		showData();
		
		System.out.println("Mark1:" + m1 + "\t Mark2:" + m2);
	}
}