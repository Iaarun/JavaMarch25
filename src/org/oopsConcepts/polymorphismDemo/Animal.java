package org.oopsConcepts.polymorphismDemo;

public class Animal {
    protected void sound() {
        System.out.println("Animal makes a sound");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    public void sleep() {
        System.out.println("Animal sleeps");
    }
    public  void run() {
        System.out.println("Animal runs");
    }
    public static void test() {
        System.out.println("Dog runs");
    }
}
