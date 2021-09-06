package com.bridgelabz;

public class EmployeeWage { // Creating Employee Wage class

    public static void main(String[] args) {
        //Constants
        int IS_PRESENT = 1;
        System.out.println("Welcome to Employee Wage");
        double echEmp = Math.floor(Math.random()* 10) %2;
        // Using random class to Get random number
        if (echEmp == IS_PRESENT){ //echEmp get 1 when first condition is true and showing employee present
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
