/*
Get Class Information: Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.
*/


package com.reflection_problems.basicproblems;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            // Load the class
            Class<?> clazz = Class.forName(className);

            // Display class name
            System.out.println("Class Name: " + clazz.getName());

            // Display constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor);
            }

            // Display fields
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            // Display methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
