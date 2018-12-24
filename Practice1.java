package javabasics;

import java.util.Scanner;

public class Practice1
{
	public static void main(String[] args) 
	{
		
		int no1,no2,result,choice;
		int yesorno;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter 2 nos:");
			no1 = sc.nextInt();
			no2 = sc.nextInt();
			
			System.out.println("\n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n Enter ur Choice:");
						
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
					result = no1+no2;
					System.out.println(no1 + " + " + no2 + " = " + result);
					break;
			case 2:
					result = no1-no2;
					System.out.println(no1 + " - " + no2 + " = " + result);
					break;	
			case 3:
					result = no1*no2;
					System.out.println(no1 + " * " + no2 + " = " + result);
					break;
			case 4:
					result = no1/no2;
					System.out.println(no1 + " / " + no2 + " = " + result);
					break;
			
			default:
					System.out.println("Invalid Choice. Try again");
					
			}
			
			System.out.println("Do u wish to continue ? 1. yes / 2. no");
			
			yesorno = sc.nextInt();
			
		}while(yesorno ==1);
		
		
	}

}
