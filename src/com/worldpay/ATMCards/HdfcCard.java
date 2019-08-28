package com.worldpay.ATMCards;

public class HdfcCard implements ATMCard {

	public void checkBalance() {
		System.out.println("WELCOME TO HDFC" + "..." + "YOUR BALANCE IS 20,000");
		System.out.println("---------------------------------------------------------------------------------");
	}

	public void miniStatement() {
		System.out.println("WELCOME TO HDFC" + "..." + "mini statement proccesed kindly check the slip");
		System.out.println("---------------------------------------------------------------------------------");

	}

	public void withdrawl() {
		System.out.println("WELCOME TO HDFC" + "..." + "Please collect the amount..!");
		System.out.println("---------------------------------------------------------------------------------");

	}

	public void changePin() {
		System.out.println("WELCOME TO HDFC" + "..." + "PIN changed Successfully...!");
		System.out.println("---------------------------------------------------------------------------------");

	}

}
