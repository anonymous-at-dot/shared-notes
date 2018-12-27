package oops;

public class ClassAndObjects 
{

	public static void main(String[] args)
	{
		
		//object creation / instantiation
		
		Customer cust1 = new Customer();
		
		//accessing class members
		
			//	cust1.reg_no  = 101; // it cannot be accessible  - bec of private
		
		cust1.customer_name = "Raja";
		
		cust1.customer_id = 101;
		
		cust1.address="Coimbatore";
		
		
		System.out.println("Customer ID:" + cust1.customer_id);
		
		System.out.println("Customer Name:" + cust1.customer_name);
		
		System.out.println("Customer Address:" + cust1.address);
		
		
	}

}

class Customer
{
	//variables 
	
	private int reg_no;
	
	int customer_id;
	
	String customer_name, address;
	
	
	
}
