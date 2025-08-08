package com.Trisha;

public class AverageCalculator {
	
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50}; // Example array
	        int sum = 0;

	        // Summing up the array elements
	        for (int num : numbers) {
	            sum += num;
	        }

	        // Calculating the average
	        double average = (double) sum / numbers.length;
	        System.out.println("Average: " + average);
	    }
}
