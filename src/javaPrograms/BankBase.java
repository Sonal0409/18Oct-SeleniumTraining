package javaPrograms;

public interface BankBase {
	
	public void Account();
	public void DebitCard();
	public void Bills() ;
	
	public static void  method1()
	{
		System.out.println("implement here itself");
	}
	public static int add(int a, int b) {
		return a+b;
	}
	
	default public void display()
	{
		System.out.println("My logo");
	}

}
