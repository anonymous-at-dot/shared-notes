package oops;

public class MultiLevelInheritance {

	public static void main(String[] args)
	{
		Results r = new Results();
		
		r.showResults();
		
		two obj = new two();
		
		

	}

}

//hierarchical
class dept extends Student
{
	
}
class Sports extends Student
{
	
}



class one
{
	void disp()
	{
		
	}
}

class two extends one
{
	void show()
	{
		
	}
}

class three extends one,two	//multiple 
{
	
}
