package com.Trisha;

	import java.util.Scanner;

	public class UppercaseName {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        String uppercasedName = name.toUpperCase();
	        System.out.println("Your name in uppercase: " + uppercasedName);
	    }
	}
	  

	