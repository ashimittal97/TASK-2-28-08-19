package com.worldpay.ATMCards;

public class AtmMachine {
	ATMCard atmCard;

	public void setCard(ATMCard atmCard) {
		this.atmCard = atmCard;

	}

	public void checkBal() {
		if (atmCard != null) {
			atmCard.checkBalance();

		} else {
			System.out.println("insert card properly");
		}
	}

	public void pin() {
		if (atmCard != null) {
			atmCard.changePin();
		} else {
			System.out.println("insert card properly");

		}

	}

	public void miniStatement() {
		if (atmCard != null) {
			atmCard.miniStatement();
		} else {
			System.out.println("insert card properly");

		}

	}

	public void withdrawal() {
		if (atmCard != null) {
			atmCard.withdrawl();
		} else {
			System.out.println("insert card properly");

		}

	}

	public static void main(String args[]) {
		AtmMachine atmMachine = new AtmMachine();
		atmMachine.setCard(new HdfcCard());
		atmMachine.checkBal();
		atmMachine.pin();
		atmMachine.withdrawal();
		atmMachine.miniStatement();
		
		atmMachine.setCard(new SbiCards());
		atmMachine.checkBal();
		atmMachine.pin();
		atmMachine.withdrawal();
		atmMachine.miniStatement();
		
	}
}
