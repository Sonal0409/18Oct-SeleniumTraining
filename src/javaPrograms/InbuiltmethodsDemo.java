package javaPrograms;

public class InbuiltmethodsDemo {
	
	
	// Inbuilt methods: method with logic is already avaiable
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to call inbuilt method you need an object
		
		// Classname objectname  -- Object
		
		// Class - String
		
		String s1 = "selenium";   // s1 here is an object
		
		if(s1.equals("SELENIUM"))
		{
			System.out.println("two string are equal");
		}
		else
			System.out.println("two string are not equal");
		
		
		String title = "edureka";
		
		if(title.equalsIgnoreCase("Edureka"))
		{
			System.out.println("title is available");
		}
		else
			System.out.println("title is not available");
		
		
		String url = "https://www.edureka.co/";
		
		
		
		if(url.contains("edureka.co"))
		{
			System.out.println("URL is correct");
		}
		else
			System.out.println("URL is not correct");
		
		
		// static inbuilt methods
		
		// classname.methodname
		
		System.out.println(Math.abs(-36));
		
		System.out.println(	Math.min(10, 5));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
