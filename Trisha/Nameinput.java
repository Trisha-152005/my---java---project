package com.Trisha;

import java.util.Scanner;

 
public class Nameinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		 String name =sc.nextLine();
		 System.out.println(" enter your number");
		 long ph = sc.nextLong();
		 
		 System.out.println("your name is"+ name);
		 System.out.println("yoyr phone number is"+ph);
		 sc.close();
				 
		

	}

}