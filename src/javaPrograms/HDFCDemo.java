package javaPrograms;

public class HDFCDemo implements BankBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCDemo obj = new HDFCDemo();
		obj.Account();
		obj.DebitCard();
		obj.Bills();

	}

	
	public void Account() {
		
		System.out.println("Account for HDFC");
	}

	
	public void DebitCard() {
		// TODO Auto-generated method stub
		System.out.println("Debit for HDFC");
	}

	
	public  void Bills() {
		// TODO Auto-generated method stub
		
		System.out.println("Billing for HDFC");
	}

}
