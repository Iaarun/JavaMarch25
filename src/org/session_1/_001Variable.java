package org.session_1;
/*
Local variable
instance variable
static variable
 */
public class _001Variable {
    // instance variable
    String studentName;
  static  String courseName;
    public static void main(String[] args) {
        // datatype identifier;
//        int $myVariable=15;
//        String name="Selenium With Java";
//
//        System.out.println($myVariable);
//        System.out.println(name);

        _001Variable std1 = new _001Variable();
        _001Variable std2 = new _001Variable();

        std1.studentName="Rohit";
        std2.studentName="Abhishek";


        _001Variable.courseName="Selenium with Java";
        _001Variable.courseName="Selenium with Python";

        System.out.println(std1.studentName);//Amit
        System.out.println(std2.studentName);//Abhishek

        System.out.println(courseName); //Selenium with Java
        System.out.println(courseName); //Selenium with Java

    }


    public static void testLocalVariable() {
       String name="Virat";

    }

}
