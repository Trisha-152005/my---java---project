package com.Trisha;

	public class EvenNumberPrinter {
	    public static void main(String[] args) {
	        int[] numbers = {3, 10, 7, 8, 15, 22, 4, 9}; 

	        System.out.println("Even numbers in the array:");
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                System.out.println(num);
	            }
	        }
	    }
	}

