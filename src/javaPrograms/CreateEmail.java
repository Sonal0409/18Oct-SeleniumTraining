package javaPrograms;

public class CreateEmail extends Base {
	
	// open the browser
	//open app
	// login
	//create email
	// logout
	
	public void CreateEmil()
	{
		System.out.println("Compose email");
	}
	
	public static void OpenBrowser()
	{
		System.out.println("Open the browser");
		System.out.println("Open the app URL");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateEmail obj1 = new CreateEmail();
		
		// as it is a static method in Base class.. 
	//and current class is inheriting Base class properties 
		//so no need to give classname.methodname()
		// just give methodname();
		OpenBrowser(); 
		obj1.login();
		obj1.CreateEmil();
		obj1.logout();

	}

}
