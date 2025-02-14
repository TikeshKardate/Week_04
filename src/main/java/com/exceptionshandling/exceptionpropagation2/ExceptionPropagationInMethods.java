/*
8. Exception Propagation in Methods
💡 Problem Statement:
Create a Java program with three methods:
method1(): Throws an ArithmeticException (10 / 0).
method2(): Calls method1().
main(): Calls method2() and handles the exception.
Expected Behavior:
The exception propagates from method1() → method2() → main().
Catch and handle it in main(), printing "Handled exception in main".*/

package com.exceptionshandling.exceptionpropagation2;

public class ExceptionPropagationInMethods {
    public static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
    }

    public static void method2() {
        method1(); // Calls method1()
    }

    public static void main(String[] args) {
        try {
            method2(); // Calls method2()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
