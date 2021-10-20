package javaPrograms;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weather=1;
		
	      //passing variable to the switch
	      switch (weather) 
	      {
	          //comparing value of variable against each case
	        case 0:
	          System.out.println("It is Sunny today!");
	          break;
	        case 1:
	          System.out.println("It is Raining today!");
	          break;
	        case 2:
	          System.out.println("It is Cloudy today!");
	          break;
	        //optional
	        default:
	          System.out.println("Invalid Input!");
	    }
	   

	}

}
