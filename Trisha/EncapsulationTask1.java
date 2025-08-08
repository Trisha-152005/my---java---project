package com.Trisha;

class Employee {
   
    private String name;
    private int id;
    private double salary;

    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EncapsulationTask1 {
    public static void main(String[] args) {
        
        Employee emp = new Employee();

        
        emp.setName("Trisha Sambari");
        emp.setId(101);
        emp.setSalary(75000.00);

        
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: ₹" + emp.getSalary());
    }
}