package javabasics;

import java.util.Scanner;

public class OneDimArray 
{
	public static void main(String[] args) 
	{
		//declaratoin of array
		
		//#1 : static
		// #2 : dynamic
		
		//static
		
		int[] marks = new int[5];
		
		//initialization
		
		marks[0] = 80;
		
		marks[1] = 90;
		
		marks[2] = 85;
		
		marks[3] = 90;
		
		marks[4] = 78;
		
		
		System.out.println(marks[2]);
		
		//dynamic
		
		String []names = {"Srijith", "Sujithra", "Dharani"};
		
		//this can be written as
		
		String []str = new String[3];
		
		str[0] = "Srijith";
		str[1] = "Sujithra";
		str[2] = "Dharani";
		
		//display all the array elements
		
		for(int index=0; index <5; index++)
			
			System.out.println("marks[" + index + "] = " + marks[index]);
		
		
		
		for(int mark : marks)
			System.out.println(mark);
		
		for(String name : str)
			System.out.println(name);
		
		
		//getting input from user
		 
		float []hikes = new float[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur 3 hikes percentage:");
		
		for(int i=0;i<3; i++)
			hikes[i]=sc.nextFloat();
		
		for(int i=0;i<3; i++)
			System.out.println("hikes[" + i + "]=" + hikes[i]);
		
		
	}
}
