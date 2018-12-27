package javabasics;

public class StringMethods
{

	public static void main(String[] args) 
	{
	
		//string can be created in 2 ways
		String str1 = "REFINEMENT";
		
		String str2 = new String("java");
		
		System.out.println(str1);
		
		System.out.println(str2);
		
		//length - returns an integer (length of the string)
		
		String name ="Sujithra";
		
		int len = name.length();
		
		System.out.println("Length of " + name + " is:" + len);
		
		System.out.println("Uppercase:" + name.toUpperCase());//convert to uppercase
		
		System.out.println("Lowercase:" + str1.toLowerCase());//convert string into lowercase
		
		String s1="abc";
		String s2 = "ABC";
		
		//equals - return true/false : compares 2 strings which eqauls or not
		
		
		if(s1.equals(s2))
			System.out.println(s1 + " and " + s2 + " are equal");
		else
			System.out.println(s1 + " and " + s2 + " are not equal");
		// ASCII - American Standard Code for Information Interchange
		
		//to print the ASCII value of a character
		char ch = 'a';
		System.out.println((int)ch);
		
		
		//equalsignorecase () // it dont consider case
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println(s1 + " and " + s2 + " are equal");//true
		else
			System.out.println(s1 + " and " + s2 + " are not equal");//false
	
		String temp="welcome";
		
		//charAt() - returns the character at the specified index
		
		System.out.println(temp.charAt(1));
		
		//substring - returns a string ( extract a string from another string, from the specified index)
		
		System.out.println(temp.substring(3));
		
		System.out.println(temp.substring(0, 3));
		
		temp = "   hai   welcome   ";
		
		System.out.println(temp);
		
		//trim - removes the unwanted blank spaces 
		
		System.out.println(temp.trim());
		
		s1="abc";
		s2="ABC";
		
		
		if(s1.compareTo(s2) > 0)
			
			System.out.println(s1 + " is greater than " + s2);
		
		else if(s1.compareTo(s2) < 0)
			
			System.out.println(s1 + " is less than " + s2);
		
		else if(s1.compareTo(s2) == 0)
			
			System.out.println(s1 + " is equal to " + s2);
		
		
		//without case - comparetoignorecase
		
		if(s1.compareToIgnoreCase(s2) > 0)
			
			System.out.println(s1 + " is greater than " + s2);
		
		else if(s1.compareToIgnoreCase(s2)  < 0)
			
			System.out.println(s1 + " is less than " + s2);
		
		else if(s1.compareToIgnoreCase(s2)  == 0)
			
			System.out.println(s1 + " is equal to " + s2);
		
		s1="refinement ";
		s2="Software solutions";
		
	//	System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));
		
		//replace - with new char/char sequence
		String s = "Hard";
		System.out.println(s2.replace("Soft", s));
		
		//startswith, endswith : true/false
		
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.endsWith("ent "));
		
	}

}
