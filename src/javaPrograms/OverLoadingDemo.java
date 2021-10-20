package javaPrograms;

public class OverLoadingDemo {
	
	public int add(int a, int b)
	{
		
		return a+b;
	}
	
	public String add(String a, String b)
	{
		
		return a+b;
	}
	
	
	public int add(int a, int b, int c)
	{
		
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingDemo obj = new OverLoadingDemo();
		
		System.out.println(obj.add(10, 20));
		
		System.out.println(obj.add(100, 200));
		
		System.out.println(obj.add(1, 2, 3));
		
		System.out.println(obj.add("sonal","mittal"));
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
