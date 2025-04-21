package org.oopsConcepts.abstractionDemo;

public class Square extends Shape {
    double side;

  public  Square(double side, String color) {
        super(color);
        this.side = side;
    }


    @Override
   public  void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
