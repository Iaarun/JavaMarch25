package org.oopsConcepts.abstractionDemo;

public abstract class Shape {
   String color;
    //concrete method
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public Shape(String color) {
        this.color = color;
    }
//concrete method
    public String getColor() {
        return color;
    }
    //abstract method
    public abstract void calculateArea();

}
