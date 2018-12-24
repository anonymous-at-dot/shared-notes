package javabasics;

public class MultiDimArray {

	public static void main(String[] args) 
	{
		//static
		
		int [][]mat = new int[2][2];
		
		mat[0][0] = 1;
		mat[0][1] = 2;
		mat[1][0] = 3;
		mat[1][1] = 4;
		
		//dynamic
		
		int [][]mat2 = { {1,2}, {3,4} };
		

		for(int row=0; row <2 ; row++)
		{
			for(int col=0; col<2; col++)
			{
				System.out.print(mat[row][col] + "\t");
			}
			System.out.println("");
		}
	
	}

}
