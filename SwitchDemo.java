package javabasics;

import java.util.Scanner;

public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		num = sc.nextInt();
		
		switch(num)
		{
		case 1:
				System.out.println("Sunday");
				break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
				System.out.println("Thursday");
				break;
		case 6:
				System.out.println("Friday");
				break;
		case 7:
			System.out.println("Satday");
			break;
			default:
				System.out.println("Invalid number");
		}
		System.out.println("done");
	}

}
