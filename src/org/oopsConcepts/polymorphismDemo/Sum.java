package org.oopsConcepts.polymorphismDemo;

public class Sum {
    // Method to calculate the sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }
    // changing the number of parameters
    private void sum(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));

    }

    private void sum(int a, int b, double c) {
        System.out.println("Sum of three integers: " + (a + b + c));

    }
    //  changing the data type of parameters
    public void sum(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    // changing the order of parameters
    public static void sum(int a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    public static void sum(double a, int b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }

    //  changing the return type
//    public double sum(int a, int b, int c) {
//        return a + b + c;
//    }

    //can we overload the main method - yes
    public static void main(String[] args) {

    }

    public static void main(String args) {

    }





}
