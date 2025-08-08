package com.Trisha;

interface ATM1 {
   abstract void checkBalance();
}
class machine implements ATM1 {
	public void checkBalance() {
		System.out.println("check Balance code");
		
	}
	
}

class ATM_Kotak{
	public static void main (String[]args) {
		machine m= new machine();
		m.checkBalance();
	}
}
