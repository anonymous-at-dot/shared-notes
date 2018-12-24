package javabasics;

public class ForLoopDemo {

	public static void main(String[] args) 
	{
		
		for(int i=1; i<=5; i++)
			System.out.println("Welcome");
		
		for(int no=1; no<=10; no++)
			System.out.println(no);

		System.out.println("Reverse:");
		
		for(int no=10; no>=1; no--)
			System.out.print(no + "\t");
		
		System.out.println();
		
		int j =5;
		for(;j<=5;)
		{
			System.out.println("j val: " + j);
			j++;
		}
	}

}
