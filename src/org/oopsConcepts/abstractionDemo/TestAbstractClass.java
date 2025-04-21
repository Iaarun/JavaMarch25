package org.oopsConcepts.abstractionDemo;

public class TestAbstractClass {
    public static void main(String[] args) {
     //   Shape shape = new Shape("Red");

        Circle circle = new Circle(5, "Blue");
        circle.draw();
        circle.calculateArea();
    }
}
