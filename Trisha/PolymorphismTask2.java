package com.Trisha;


class Printer {
 public void print() {
     System.out.println("Printing from a generic printer...");
 }
}


class InkjetPrinter extends Printer {

 public void print() {
     System.out.println("Printing with an Inkjet Printer: Smooth and colorful output!");
 }
}


class LaserPrinter extends Printer {
 @Override
 public void print() {
     System.out.println("Printing with a Laser Printer: Fast and precise results!");
 }
}

public class PolymorphismTask2 {
 public static void main(String[] args) {
     

     Printer printer1 = new InkjetPrinter();  
     Printer printer2 = new LaserPrinter();  

     
     printer1.print();  
     printer2.print();  
 }
}