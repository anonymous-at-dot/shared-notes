package oops;

public class SingleInheritance {

	public static void main(String[] args) 
	{
		
		/*Marks m = new Marks();
		
		m.getMarks();
		
		m.showMarks();*/
		
		/*Marks suji = new Marks();
		
		Marks dharani = new Marks();
		
		Marks srijith = new Marks();
		
		
		suji.getMarks();
		suji.showMarks();
		
		srijith.getMarks();
		srijith.showMarks();
		
		dharani.getMarks();
		dharani.showMarks();*/
		
		//Array of objects
		
		Marks []stud = new Marks[5];
		
		for(int i=0; i<5; i++)
		{
			stud[i] = new Marks();
			
			stud[i].getMarks();
		}
		
		for(int i=0; i<5; i++)
		{
					
			stud[i].showMarks();
		}
	}

}
