package javabasics;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) 
	{

		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no:");
		
		no = sc.nextInt();
		
		do
		{
			System.out.println(no);
			no++;
		}while(no <=10);

	}

}
