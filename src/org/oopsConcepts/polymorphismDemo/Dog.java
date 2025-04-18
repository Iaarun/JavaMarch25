package org.oopsConcepts.polymorphismDemo;

public class Dog extends Animal{

    public void sleep() {
        System.out.println( "Dog sleeps");
    }
  //Method signature should be same
    public void sound() {
        System.out.println("Dog barks");
    }
    public  void run() {
        System.out.println("Dog runs");
    }

    public static void test() {
        System.out.println("Dog runs");
    }

    // method hidden from Animal class
}
