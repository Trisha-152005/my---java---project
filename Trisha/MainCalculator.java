package com.Trisha;

class calculator 
{
	 calculator(int a, int b) {
	int sum = a+b;
	System.out.println("Addtion"+ sum);
	
	}
  calculator(int a, int b, boolean multiply) {
	  int multiplication =a*b;
	  System.out.println("multiplication"+multiplication);
	  
	
}
  calculator(double a,double b){
	  double subtraction =a-b;
	  System.out.println("subtration"+ subtraction);
	  
  }
public class  Maincalculator {
		 public static void main(String [] args ) {
			 
			 new calculator(23,34);
			 calculator obj2 =new calculator(23,34,true);
			 calculator obj3 =new calculator(23.5,28.6);
					 
					 
		 }}}
