package com.worldpay.ATMCards;

public class SbiCards implements ATMCard {

	
	public void checkBalance() {
		System.out.println("WELCOME TO SBI" + "..." + "YOUR BALANCE IS 40,000");
		System.out.println("---------------------------------------------------------------------------------");
	}

	
	public void miniStatement() {
		System.out.println("WELCOME TO SBI" + "..." + "mini statement proccesed kindly check the slip");
		System.out.println("---------------------------------------------------------------------------------");

		
	}

	
	public void withdrawl() {
		System.out.println("WELCOME TO SBI" + "..." + "Please collect the amount..!");
		System.out.println("---------------------------------------------------------------------------------");
		
	}

	
	public void changePin() {
		System.out.println("WELCOME TO SBI" + "..." + "PIN changed Successfully...!");
		System.out.println("---------------------------------------------------------------------------------");

		
	}
	

}
