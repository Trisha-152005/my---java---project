package com.Trisha;


	import java.util.Scanner;

	public class UserInfo {
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter your favorite color: ");
	        String favoriteColor = scanner.nextLine();

	        
	        System.out.println("\n--- User Info ---");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Favorite Color: " + favoriteColor);

	        
	        scanner.close();
	    }
	}

