/*
2. Unchecked Exception (Runtime Exception)
💡 Problem Statement:
Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
ArithmeticException if division by zero occurs.
InputMismatchException if the user enters a non-numeric value.
Expected Behavior:
If the user enters valid numbers, print the result of the division.
If the user enters 0 as the denominator, catch and handle ArithmeticException.
If the user enters a non-numeric value, catch and handle InputMismatchException.
*/

package com.exceptionshandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            if (number2 == 0) {
                throw new java.lang.ArithmeticException("Division by zero is not allowed.");
            }

            double result = number1 / number2;
            System.out.printf("Result: %.2f%n", result);

        } catch (InputMismatchException e) {
            System.err.println("Error: Please enter numeric values only.");
        } catch (java.lang.ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
