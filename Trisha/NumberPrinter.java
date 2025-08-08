package com.Trisha;

public class NumberPrinter {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 9, 23, 11}; // Sample array
        int largest = numbers[0]; // Assume first element is the largest

        for (int num : numbers) {
            if (num > largest) {
                largest = num; // Update if a bigger number is found
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
