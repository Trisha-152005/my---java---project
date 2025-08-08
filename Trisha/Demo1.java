package com.Trisha;

public class Demo1 {

	public static void main(String[] args) {
		try {
			int x=2/0;
			System.out.println(x);
		}catch(Exception e) {
			
			System.out.println("zero cannot divide");
			
		}finally {
			System.out.println("Thanks");
		}
	}

}
