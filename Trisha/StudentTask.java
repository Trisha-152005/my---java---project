package com.Trisha;


	class Student {
	    String name;
	    int age;

	    
	    void displayDetails() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	    }

	    public static void main(String[] args) {
	       
	        Student s = new Student();
	        s.name = "Trisha";
	        s.age = 20;

	        
	        s.displayDetails();
	    }
	}

