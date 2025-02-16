/*
Exercise 1: Use @Override Correctly
✅ Problem Statement:
Create a parent class Animal with a method makeSound(). Then, create a Dog class that overrides this method using @Override.
🔹 Steps to Follow:
Define a makeSound() method in Animal class.
Override it in Dog class with @Override.
Instantiate Dog and call makeSound().
*/

package com.annotation_problems.exerciseproblems;

// Step 1: Define Parent Class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Step 2: Define Child Class That Overrides makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Step 3: Test the Method
public class Problem1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Calls the overridden method in Dog
    }
}