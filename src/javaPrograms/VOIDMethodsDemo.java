package javaPrograms;

public class VOIDMethodsDemo {
	
	
	// 2nd type Methods which do not return a value -- return type is void
	
	
	public void login()
	{
		System.out.println("loginto application");
	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VOIDMethodsDemo obj = new VOIDMethodsDemo();
		
		obj.add();
		
		obj.login();
		
		
		
		
		
		
		

	}

}
