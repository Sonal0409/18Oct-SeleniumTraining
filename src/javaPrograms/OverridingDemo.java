package javaPrograms;

public class OverridingDemo  extends Base{
	// open browser
	 // login the app
	// check on checkbox for remember password 
	
	public void login()
	{
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("click on remeber password");
		System.out.println("Enter Email");
		System.out.println("Click Sign button");
	}
	// buy products
	
	public void buyProducts()
	{
		System.out.println("Enter code for Buy products");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingDemo obj = new OverridingDemo();
		//Base obj1 = new Base();
		//obj1.login();
		
		OpenBrowser();
		obj.login();  // OVER riding --rule
		obj.buyProducts();
		obj.logout();
	}

}
