package org.exceptionDemo;

public class InvalidAgeException extends Exception {
    //Custom exception class
    //InvalidAgeException is a subclass of Exception class
    //InvalidAgeException is a checked exception
    //InvalidAgeException is a user-defined exception
    //InvalidAgeException is a class that extends Exception class

    public InvalidAgeException(String message) {
        super(message);
    }

}
