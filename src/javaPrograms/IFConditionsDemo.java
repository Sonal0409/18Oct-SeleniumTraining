package javaPrograms;

public class IFConditionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String expectevalue ="selenium";
		
		String actualValue = "selenium1234";
	
		// if expectevalue equals actualValue then print testcase pass
		// if expectevalue equals actualValue then print testcase failed
		
		if(expectevalue==actualValue)
		{
			System.out.println("if condition executed");
			System.out.println("testcase passsed");
		}
		else
		{
			System.out.println("Else condition executed");
			System.out.println("testcase has failed");
			
		
		}
		
		
		
		

	}

}
