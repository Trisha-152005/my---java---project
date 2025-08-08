package com.Trisha;

class parentz{
	void car() {
		System.out.println("Bmw");
		
	}
	
}
class Son extends parentz{
	void car() {
		super.car();
		System.out.println("G-wagon");
		
	}
}

public class SuperDemo {
	 

	public static void main(String[] args) {
		Son obj=new Son();
		obj.car();

	}

}
