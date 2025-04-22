package org.oopsConcepts.encapsulationDemo;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
       person.setName("null null null");
       person.setAge(-222);


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}
