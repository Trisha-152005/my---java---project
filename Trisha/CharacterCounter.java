package com.Trisha;

import java.util.Scanner;

public class CharacterCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        
	        int characterCount = sentence.length();

	        
	        System.out.println("The sentence has " + characterCount + " characters (including spaces).");
	    }
	}

