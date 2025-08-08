package com.Trisha;

class person{
	String name;
	int age ;
	public void displayDetails() {
		System.out.println("Name"+" "+ name);
		System.out.println("Age"+" "+age);
		
	}
}
class student extends person{
	String studentID;
	public void displaystudentInfo() {
		displayDetails();
		System.out.println("student Id"+" "+studentID);
	}
}
public class Main {
	public static void main (String[] args) {
		student obj=new student();
		obj.name="Trisha";
		obj.age =20;
		obj.studentID ="dypu";
		obj.displaystudentInfo();
	}

}
