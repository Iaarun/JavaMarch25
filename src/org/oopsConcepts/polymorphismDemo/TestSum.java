package org.oopsConcepts.polymorphismDemo;

public class TestSum {
    public static void main(String[] args) {
    //    Sum sumObj = new Sum();

       // System.out.println(sumObj.sum(10, 20)); // Calls the method with two integers
       // sumObj.sum(20.5,32.5);  // Calls the method with two doubles


        Dog dog = new Dog();
    /*    dog.run();
        dog.sleep();
        dog.eat();
        dog.sound();
*/

        Animal animal = new Animal();
        animal.run();

        Dog dog1 = new Dog();
        dog1.run();

     //   Dog dog2 = new Animal(); // Downcasting
        //  dog2.run();

       Animal animal1 = new Dog(); // upcasting
        animal1.run();
    }
}
