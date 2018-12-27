package dharani;

import java.util.Scanner;

public class WhileDemo 
{

	public static void main(String[] args) 
	{

		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		no = sc.nextInt();
		/*
		while(no <=10)
		{
			System.out.println(no);
			no++;
		}*/
		
		do
		{
			System.out.println(no);
			no++;
		}while(no<=10);

	}

}
