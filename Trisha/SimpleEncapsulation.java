package com.Trisha;

class Student0{
	private  String name;
	private int age;
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class SimpleEncapsulation {

	public static void main(String[] args) {
		Student0 obj =new Student0();
		obj.setName("Trisha");
		obj.setAge(20);
       System.out.println(obj.getName());
       System.out.println(obj.getAge());

	}

}



