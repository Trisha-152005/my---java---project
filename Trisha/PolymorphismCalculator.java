package com.Trisha;



class cal{
	public int add (int a,int b) {
		return a+b;
		
	}
}

public class PolymorphismCalculator {

	public static void main(String[] args) {
		cal obj=new cal();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10,20));

	}

}
