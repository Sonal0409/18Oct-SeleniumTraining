package javaPrograms;

public class MethodsReturnValueDemo {
	
	
	// modifer returntype methodname(){
	 // }
	
	
	// methods which return value
	
	
	public int add()
	{
		int a =10;
		int b=20;
		int c= a+b;  // c=30
		return c;
	}

	
	public String concatName()
	{
		String s1 = "selenium";
		String s2= "training";
		String s3 = s1+s2;  // s3 = seleniumtraining
		return s3;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to call any method
		// Create an Object of the class that has your method 
	// syntax : classname objectname = new 	classname();
		
		MethodsReturnValueDemo obj = new MethodsReturnValueDemo();
		
		System.out.println(" the output of method add() is : " + obj.add());
		
		// store the output of method in a variable
		
		
        String var1=  obj.concatName();
		System.out.println(var1);
		
	int	val1 = obj.add();
		
		System.out.println(val1);
		
		
		
		
		
		
		
		
		

	}

}
