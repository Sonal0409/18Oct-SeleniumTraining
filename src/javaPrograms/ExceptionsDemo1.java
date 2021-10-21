package javaPrograms;

public class ExceptionsDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// try & catch block
		
		try
		{
		int a = 10/0; // execution stopped upon exception
		
		System.out.println("Divide the numbers" + a);
		}
		catch (ArithmeticException x)
		{
			System.out.println("Handling exception");
		}
		
		int x = 10 +20;
		
		System.out.println("added the numbers" + x);
		
		//value of s1 to come from webpage
		// when webpage sends no value.. s1 will be set to null
		try
		{
		String s1 = null ;
		
		System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Handling exception");
		}
				
		System.out.println("added the numbers" + x);
	}

}
