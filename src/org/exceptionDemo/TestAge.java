package org.exceptionDemo;

public class TestAge {

    public static void validateAge(int age) throws InvalidAgeException{

        //Custom exception class
        //InvalidAgeException is a subclass of Exception class
        //InvalidAgeException is a checked exception
        //InvalidAgeException is a user-defined exception
        //InvalidAgeException is a class that extends Exception class
        if(age<18){
            throw new InvalidAgeException("Age is not Valid");
        }else{
            System.out.println("Age is Valid");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        validateAge(15);

    }

    public void test(){
      final   int age =10;
//       age = 20; //error: cannot assign a value to final variable age (immutable)
    //    age = 20;
        System.out.println(age);
    }
}
// throw and throws keywords
//final finally and finalize
