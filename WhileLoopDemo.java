package javabasics;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) 
	{
	
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no:");
		
		no = sc.nextInt();
		
		while(no <=10)
		{
			System.out.println(no);
			no++;
		}
		
		

	}

}
