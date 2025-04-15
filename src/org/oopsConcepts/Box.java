package org.oopsConcepts;

import java.util.Scanner;

//COnstructor
public class Box {
    // data members
    //usage of constructor
    // to initialize the newly created object
    // to provide data to instance variables
    // to perform any setup steps
    int length;
    int breadth;
    int height;

    Box(){
        length = 10;
        breadth = 20;
        height = 30;
    }
    // constructor with parameters
    Box(int length, int b, int h){
        this.length = length;
        breadth = b;
        height = h;
    }
 //  static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the length, breadth and height of box: ");

        Box box = new Box();
       // System.out.println(box.length   + " " + box.breadth + " " + box.height);
 //       Box box1 = new Box(10,25,35);
  //      System.out.println(box1.length   + " " + box1.breadth + " " + box1.height);
    }
}
