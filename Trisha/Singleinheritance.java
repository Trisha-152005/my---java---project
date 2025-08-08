package com.Trisha;
class father{
	public void property()
{
		System.out.println("3Bhk");
	}
}
class child extends father{
	
}
public class Singleinheritance {

	public static void main(String[] args) {
		child obj=new child();
		obj.property();

	}

}
