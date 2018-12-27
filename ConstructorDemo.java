package oops;

public class ConstructorDemo
{

	public static void main(String[] args)
	{
		Product p1= new Product();
		
		p1.showProducts();
		
		Product p2 = new Product(101,"Lux", 25.30f);

		p2.showProducts();
		
		
		//passing data 
		Product p3 = p2;
		
		p3.showProducts();
				
	}

}
