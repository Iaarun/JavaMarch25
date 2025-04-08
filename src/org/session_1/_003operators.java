package org.session_1;

public class _003operators {
    public static void main(String[] args) {
      // arithmeticOperators();
      //  relationalOperators();
      //    logicalOperators();
        ternaryOperator();
    }

   public static void arithmeticOperators() {
        // Arithmetic Operators
        // +, -, *, /, %
        int a = 10;
        int b = 21;
        System.out.println("Addition: " + (a + b));//31
        System.out.println("Subtraction: " + (a - b)); //
        System.out.println("Multiplication: " + (a * b));//
        System.out.println("Division: " + (b / a));// 2
        System.out.println("Modulus: " + (b % a)); //1
    }

    public static void relationalOperators() {
        // Relational Operators
        // ==, !=, >, <, >=, <=
        int a = 10;
        int b = 20;
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Less than: " + (a < b)); // true
        System.out.println("Greater than: " + (a > b)); // false
        System.out.println("Less than or equal to: " + (a <= b)); // true
        System.out.println("Greater than or equal to: " + (a >= b)); // false


    }

    public static void logicalOperators() {
        // Logical Operators
        // &&, ||, !
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND: " + (a && b)); // false
        System.out.println("Logical AND: " + (b && a)); // false
        System.out.println("Logical OR: " + (a || b)); // true
        System.out.println("Logical OR: " + (b || a)); // true
        System.out.println("Logical NOT: " + (!a)); // false
    }

    public static void bitwiseOperators() {
        // Bitwise Operators
        // &, |, ^, ~
    }

    public static void assignmentOperators() {
        // Assignment Operators
        // =, +=, -=, *=, /=, %=
        int a = 10;
        int b = 20;
    //    a= a+b; // 30
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);//-10
        a*=b;
        System.out.println(a);  //-200
        b/=a;
        System.out.println(b);
        b%=a;
        System.out.println(b);

    }

    public static void ternaryOperator() {
        // Ternary Operator
        // ? :
        int a = 30;
        int b = 20;
      String data=  (a>b)? "A is greater than B" : "B is greater than A";
        System.out.println(data);
    }

    public static void ternaryOperatorQue() {
       int a = 30;
        int b = 20;
        int c=40;

        int max = (a>b)?(a>c)?a:c :(b>c)?  b:c;
        System.out.println("Max is: "+max);
    }
}
