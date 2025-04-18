package org.session_1;

import java.util.Scanner;

public class _010ReturnTypeDemo {

    public static void main(String[] args) {
        _010ReturnTypeDemo rtd = new _010ReturnTypeDemo();
    //   int c= rtd.add(10, 20);
      //  System.out.println("Addition is: " + c);
       // rtd.subtract(c, 10);
     //   System.out.println( rtd.whatisyourName());
     int[] roll=   rtd.printRollNum();

     for(int num:roll){
         System.out.println(num);
     }
    }
 // return type method
    public int add(int a, int b) {
     return a + b;
    }

    // nonreturn type method
    public void subtract(int a, int b) {
        System.out.println("Subtraction is: " + (a - b));

    }

    public String whatisyourName(){
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        return "My Name is "+name;
    }

    public int[] printRollNum(){
        Scanner sc = new Scanner(System.in);
       int[] rollNum = new int[5];
        System.out.println("Enter 5 roll numbers of students: ");
        for(int i=0; i<rollNum.length; i++){
            rollNum[i]=sc.nextInt();
        }
      return rollNum;
    }
}
