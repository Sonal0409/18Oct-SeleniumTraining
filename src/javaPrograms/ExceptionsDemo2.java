package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\sonal\\Desktop\\myfile456.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		finally
		{
			System.out.println("close the file");
		}

	}

}
