package com.Trisha;

 
abstract class BankAccount {
 
 abstract void calculateInterest();

 
 public void showBalance() {
     System.out.println("Showing balance...");
 }
}


class SavingsAccount extends BankAccount {
 
 public void calculateInterest() {
     System.out.println("Interest for Savings Account is 4%");
 }
}


class FixedDepositAccount extends BankAccount {
 
 public void calculateInterest() {
     System.out.println("Interest for Fixed Deposit Account is 6.5%");
 }
}

public class AbstractionTask1 {
 public static void main(String[] args) {
     
     BankAccount account1 = new SavingsAccount();
     BankAccount account2 = new FixedDepositAccount();

     
     account1.showBalance();
     account1.calculateInterest();

     account2.showBalance();
     account2.calculateInterest();
 }
}