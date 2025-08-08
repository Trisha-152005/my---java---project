package com.Trisha;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("enter first number");
			int num1 = sc.nextInt();
			
			System.out.println("enter second number");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			System.out.println("result divisond"+ result);
			
					
		}
		catch(ArithmeticException e) {
			System.out.println(" error cannot divison by zero");
			
			
		}finally {
			System.out.println("thank you for using our calculator");
		}

	}

}
