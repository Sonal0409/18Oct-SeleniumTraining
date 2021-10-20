package javaPrograms;

public class DeleteEmail extends CreateEmail{
	
	// openbrowser() --- Base clas
	//login  --------Base class
	// create email ----- CreateEmail clas
	// delete an email  -- current class
	//logout -- base class
	
	public static void delete()
	{
		System.out.println("Delete an email");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeleteEmail obj = new DeleteEmail();
		
		OpenBrowser();
		obj.login();
		obj.CreateEmil();
		delete();
		obj.logout();
		
		
		
		
		
		
		
		
		
		

	}

}
