package com.Trisha;

abstract class BankAccount1{
	abstract void calculateInterest();
	
	public void showBalance() {
		System.out.println("Showing Balance");
	}
}

class SavingAccount extends BankAccount1 {
	public void calculateInterest() {
		System.out.println("Interest for Savings Account is 4%");
	}
}

class FixedDepositAccount1 extends BankAccount1 {
	public void calculateInterest() {
		System.out.println("Interest for Savings Account is 6.5%");
	}
}

public class BankSimulation {

	public static void main(String[] args) {
		BankAccount1 acc1 = new SavingAccount();
		BankAccount1 acc2 = new FixedDepositAccount1();
		
		acc1.showBalance();
		acc1.calculateInterest();
		
		acc2.showBalance();
		acc2.calculateInterest();
	}
}