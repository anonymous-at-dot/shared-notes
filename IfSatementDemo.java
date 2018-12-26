//Session 3 - if loop

package javabasics;

import java.util.Scanner;

public class IfSatementDemo 
{

	public static void main(String[] args) 
	{
		int mark;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a mark");
		
		mark = sc.nextInt();
		
		//simple if
		
		if(mark >=35)
			System.out.println("Pass");
		
		// if -else
		String result;
		if(mark >=35)
			result="pass";
		else
			result="fail";
		
		//else if ladder 
		
		if(mark >=80)
			grade='O';
		else if(mark>=60 && mark <80)
			grade='A';
		else if(mark >=50 && mark < 60)
			grade='B';
		else if(mark >=40 && mark <50)
			grade='C';
		else
			grade ='F';
					
		System.out.println("Mark:" + mark + " \t Result:" + result + "\t Grade:" + grade );
		
		int age;
		
		System.out.println("Enter age");
		
		age = sc.nextInt();//reads the integer value
		
		if(age > 20)
		{
			if(age <30)
			{
				System.out.println("Entered age lies between 20 & 30");
			}
			else
			{
				System.out.println("Age is greater than or equal to 30");
			}
		}
		else
		{
			System.out.println("Age is less than or equal to 20");
		}
	}

}
