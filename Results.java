package oops;

public class Results extends Marks
{
	int total;
	
	String result;
	
	public void showResults()
	{
		getMarks();
		showMarks();
		
		total = m1+m2;
		
		if(m1>=40 && m2 >=40)
			result = "Pass";
		else
			result = "Fail";
		
		System.out.println("Total:" + total + "\t Result:" + result);
		
	}

}
