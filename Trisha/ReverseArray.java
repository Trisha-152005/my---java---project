package com.Trisha;

public class ReverseArray {
	
	    public static void main(String[] args) {
	        int[] original = {10, 20, 30, 40, 50}; // Sample array

	        System.out.print("Original Array: ");
	        for (int num : original) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nReversed Array: ");
	        for (int i = original.length - 1; i >= 0; i--) {
	            System.out.print(original[i] + " ");
	        }
	    }
	}


