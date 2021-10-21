package javaPrograms;

public class CitiBankDemo implements BankBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call static method already implemented in Interface
		
		BankBase.add(10,20);
		
		
		// one object that call methods from interface as well as child class
		
		BankBase obj;  // call method already implement in base
		
		obj = new CitiBankDemo(); // also call methods that are implmented in CitiBankDemo
		
		obj.display();
		
	 // call methods from interface
	
	 // driver object call methods from implementing class
		

	}

	@Override
	public void Account() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DebitCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Bills() {
		// TODO Auto-generated method stub
		
	}

}
