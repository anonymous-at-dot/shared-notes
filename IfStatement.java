package dharani;

import java.util.Scanner;

public class IfStatement 
{

	public static void main(String[] args) 
	{
		
		int mark;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur mark:");
		
		mark = sc.nextInt();
		
		if(mark >=40 )
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		// else if ladder
		char grade;
		
		if (mark >=80)
			grade ='O';
		
		else if(mark >=60 && mark<80)
			grade='A';
		
		else if(mark >=50 && mark<60)
			grade='B';
		else if(mark >=40 && mark<50)
			grade='A';
		
		else
			grade='F';
		
		System.out.println(mark + " :" + grade);
		
	}

}
