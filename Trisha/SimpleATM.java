package com.Trisha;


	abstract class ATM{
		abstract void checkBalance();
		abstract void withdrawCash(double amount);
		abstract void depositeCash(double amount);
	}

	class BankATM extends ATM{
		private double balance = 1000.0;
		
		public void checkBalance() {
			System.out.println("Your Current Balance is :" + balance);
			
		}
		public void withdrawCash(double amount) {
			if(amount>balance) {
				System.out.println("Insufficient Balance");
			}else {
				balance -= amount;
				System.out.println("withdrawl of $" + amount + "successful");
			}
		}
		void deposite(double amount) {
			System.out.println("Deposited" + amount + "Sucessfully");
		}
		@Override
		void depositeCash(double amount) {
			
			
		}
	}


	public class SimpleATM {
		public static void main(String[] args) {
			ATM obj = new BankATM();
			obj.checkBalance();
			obj.withdrawCash(500);
			obj.depositeCash(200);
			obj.checkBalance();
			
		}

	}
