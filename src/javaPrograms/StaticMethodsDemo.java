package javaPrograms;

public class StaticMethodsDemo {
	
	// static 
	
	// methods which return value
	public static int mul()
	{
		int x=2;
		int y=3;
		return x*y;
	}
	
	// Methods which dont return value
	
	public static void learning()
	{
		mul();
		System.out.println("learning sleenium with java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int var1 =mul();
	   
	   System.out.println(var1);
	   
	   System.out.println(mul());
		
		learning();
		
	

	}

}
