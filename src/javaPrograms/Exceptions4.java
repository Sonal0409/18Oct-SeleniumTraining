package javaPrograms;

public class Exceptions4 {
	
	// throw keyword : define your own exception message
	
	public void driving(int age)
	{
		if(age <18)
		{
			throw new ArithmeticException("Age is less than 18");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Exceptions4 obj = new Exceptions4();
		
		obj.driving(13);
		
		Thread.sleep(2000);
				
		

	}

}
