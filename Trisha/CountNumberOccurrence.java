package com.Trisha;

	import java.util.Scanner;

	public class CountNumberOccurrence {
	    public static void main(String[] args) {
	        int[] arr = {3, 5, 7, 3, 9, 3, 10}; // Sample array
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number to count: ");
	        int target = scanner.nextInt();

	        int count = 0;
	        for (int num : arr) {
	            if (num == target) {
	                count++;
	            }
	        }

	        System.out.println("The number " + target + " appears " + count + " time(s) in the array.");
	    }
	}

