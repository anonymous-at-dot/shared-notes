package oops;

public class EncapsulationDemo {

	public static void main(String[] args)
	{
		Medicine m = new Medicine();
		
		//m.tid=101;
		
		//m.tname="dolo650";
		
		m.setTid(101);
		
		m.setTname("dolo650");
		
		
		System.out.println(m.getTid());
		
		System.out.println(m.getTname());
		
		

	}

}
