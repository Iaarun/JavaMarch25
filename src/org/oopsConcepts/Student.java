package org.oopsConcepts;

public class Student {
    // data members
    // methods/functions
    //constructors
    // nested classes
    //interfaces

    int rollNumber;
    String name;
    String UID;
 static  String courseName = "Selenium with Java";
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "John Doe";
        student1.UID = "UID12345";
        System.out.println("Student 1: " + student1.rollNumber + ", " + student1.name + ", " + student1.UID + ", " + Student.courseName);
        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Jane Smith";
        student2.UID = "UID67890";
        System.out.println("Student 2: " + student2.rollNumber + ", " + student2.name + ", " + student2.UID + ", " + Student.courseName);



    }

}
