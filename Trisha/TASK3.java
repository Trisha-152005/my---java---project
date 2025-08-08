package com.Trisha;
public class TASK3 {

   
    public TASK3() {
        System.out.println("No values provided");
    }

    
    public TASK3(int value) {
        System.out.println("Value: " + value);
    }

    
    public TASK3(int value1, int value2) {
        int sum = value1 + value2;
        System.out.println("Sum: " + sum);
    }
    


    public static void main(String[] args) {


        TASK3 obj1 = new TASK3();

        TASK3 obj2 = new TASK3(5);

        
        TASK3 obj3 = new TASK3(1,2);
    }
}
