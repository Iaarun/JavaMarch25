package org.session_1;

import java.util.Scanner;

public class _004UserInput {
    public static void main(String[] args) {
        //User input using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
       String name= sc.next();
        System.out.println("Hello "+ name);
        // INteger input
        System.out.println("Enter your age: ");
      int age=  sc.nextInt();
        System.out.println("Your age is: "+age);
        //double input
        System.out.println("Enter any decimal number: ");
        double doubleNumber= sc.nextDouble();
        System.out.println( "Your decimal number is: "+doubleNumber);
        //boolean input
        System.out.println("Enter true or false: ");
        boolean isdata= sc.nextBoolean();
        System.out.println("Your boolean value is: "+isdata);
        //char input
        System.out.println("Enter any character: ");
        char ch= sc.next().charAt(0);
        System.out.println("Your character is: "+ch);


    }
}
