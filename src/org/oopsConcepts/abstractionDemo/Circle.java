package org.oopsConcepts.abstractionDemo;
// multiple inheritance because of interfaces
public class Circle extends Shape implements TestInterface, TestInterface2 {
    double radius;
    // Constructor
    public Circle(double radius, String color) {

        super(color);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        //cannot change the value of as it is final because it is declared in interface
      //  TestInterface.a=25;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);

    }

    @Override
    public void display() {
        System.out.println("Display method from TestInterface");
    }
}
