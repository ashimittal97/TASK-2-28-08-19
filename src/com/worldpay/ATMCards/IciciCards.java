package com.worldpay.ATMCards;

public class IciciCards implements ATMCard {

	public void checkBalance() {
		System.out.println("WELCOME TO ICICI" + "..." + "YOUR BALANCE IS 50,000");
		System.out.println("---------------------------------------------------------------------------------");

	}

	public void miniStatement() {
		System.out.println("WELCOME TO ICICI" + "..." + "mini statement proccesed kindly check the slip");
		System.out.println("---------------------------------------------------------------------------------");

	}

	public void withdrawl() {
		System.out.println("WELCOME TO ICICI" + "..." + "Please collect the amount..!");
		System.out.println("---------------------------------------------------------------------------------");

	}

	public void changePin() {
		System.out.println("WELCOME TO ICICI" + "..." + "PIN changed Successfully...!");
		System.out.println("---------------------------------------------------------------------------------");

	}

}
