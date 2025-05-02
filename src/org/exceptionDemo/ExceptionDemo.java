package org.exceptionDemo;

import org.session_1._001Variable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
       ExceptionDemo demo = new ExceptionDemo();
        //demo.exceptionDemo();
        demo.exceptionDemo2();

    }

    public void exceptionDemo() {
        //Exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions
        //Exception is an object that describes an exceptional condition that has occurred in a piece of code
        //Exception is a class that extends Throwable class
        //Exception is a checked exception
        //Error is an unchecked exception
        //Error is a class that extends Throwable class
        //Error is a serious problem that a reasonable application should not try to catch
        //Error is a subclass of Throwable class

        System.out.println("Programme Starts");
        System.out.println("Enter the value for a and b");
        Scanner sc = new Scanner(System.in);
        //without exception handling
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c = a/b;
//        System.out.println("Value of c is: " + c);

        //with exception handling
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Value of c is: " + c);
        } catch (ArithmeticException e) {
            //   System.out.println("Arithmetic Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e) {
            //   System.out.println("Input Mismatch Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            //   System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();


        }
        System.out.println("Programme Ends");
    }

    public void exceptionDemo2() {
        //Exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions
        //Exception is an object that describes an exceptional condition that has occurred in a piece of code
        //Exception is a class that extends Throwable class
        //Exception is a checked exception
        //Error is an unchecked exception
        //Error is a class that extends Throwable class
        //Error is a serious problem that a reasonable application should not try to catch
        //Error is a subclass of Throwable class

        System.out.println("Programme Starts");
        System.out.println("Enter the value for a and b");
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("Value of c is: " + c);
        }
        finally {
            //finally block is used to execute the code after try and catch block
            //finally block is always executed whether exception is handled or not
            //finally block is used to close the resources
            System.out.println("Finally block is executed");
        }

        System.out.println("Programme Ends");
    }

    public void checkedExceptionDemo() throws FileNotFoundException, InterruptedException {
        File file = new File("C:\\Users\\user\\Desktop\\test.txt");
        FileInputStream fis = new FileInputStream(file);
        //FileNotFoundException is a checked exception
        Thread.sleep(1000);
    }
}
