/*
3. Custom Exception (User-defined Exception)
💡 Problem Statement:
Create a custom exception called InvalidAgeException.
Write a method validateAge(int age) that throws InvalidAgeException if the age is below 18.
In main(), take user input and call validateAge().
If an exception occurs, display "Age must be 18 or above".
Expected Behavior:
If the age is >=18, print "Access granted!".
If age <18, throw InvalidAgeException and display the message.
*/

package com.exceptionshandling.customexception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Age must be 18 or above");
    }
}

public class UserDefinedException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException();
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
