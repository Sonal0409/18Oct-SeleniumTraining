package javaPrograms;

import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner my_scan = new Scanner(System.in);
	      String my_str = my_scan.nextLine();
	      System.out.println("The string is "+my_str);
	      int my_val = my_scan.nextInt();
	      System.out.println("The integer is "+my_val);
	      float my_float = my_scan.nextFloat();
	      System.out.println("The float value is "+my_float);
	}

}
