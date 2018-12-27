package dharani;

import java.util.Scanner;

public class SwitchDemo 
{
	
	public static void main(String []a)
	{
		
		int no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		no = sc.nextInt();
		
		switch(no)
		{
		case 1:
				System.out.println("Sunday");
				break;
		case 2:
			
				System.out.println("Monday");
				break;
			
		default:	//optional
				System.out.println("Invalid option");
		}
		
	}

}
