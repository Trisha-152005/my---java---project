package com.Trisha;

 class Animal{
	 public void eat() {
		 System.out.println("Animal can eat");
		 
	 }
 }
 class cat extends Animal{
	 public void Meow() {
		 System.out.println("Meowwwww");
		 
	 }
 }
 class kitten extends cat{
	 public void jump() {
		 System .out.println("jump like rabbit");
	  } 
 public static void main(String [] args) 
 {
	 kitten k= new kitten();
	 k.eat();
	 k.Meow();
	 k.jump();
 }}