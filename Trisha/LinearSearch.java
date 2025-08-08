package com.Trisha;

	import java.util.Scanner;

	public class LinearSearch {
	    public static void main(String[] args) {
	        int[] numbers = {4, 7, 12, 9, 5, 3}; // Sample array
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number to search for: ");
	        int target = scanner.nextInt();

	        boolean found = false;
	        for (int num : numbers) {
	            if (num == target) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println(target + " is present in the array.");
	        } else {
	            System.out.println(target + " is not found in the array.");
	        }
	    }
	}

