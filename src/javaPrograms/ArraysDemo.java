package javaPrograms;

public class ArraysDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 100;
		String s1 ="sonal";
		
		// Arrays : Object in java that store multiple values of same datatype
		
		// Synatx of Array
		
		// datatype [] objectname = {"value","value2","value3","value4"}
		
		String [] coffee = {"Black", "With sugar", "With cream & sugar" ,"Crisp (har har...)"};
		
		System.out.println(coffee[3]);
		
		
		for(int i=2;i<4;i++)
		{
			System.out.println(coffee[i]);
		}
	
		// for each lopp  
		for(String temp : coffee)
		{
			if(temp == "With cream & sugar")
			{
		System.out.println(temp);
			}
		}

	}

}
