/*
1️⃣ Basic JUnit Test: Testing a Calculator Class
Problem:
Create a Calculator class with methods add(int a, int b), subtract(int a, int b), multiply(int a, int b), and divide(int a, int b). Write JUnit test cases for each method.
👉 Bonus: Test for division by zero and handle exceptions properly.
*/

package com.junit_problems;

public class TestingACalculatorClass
{
    public static int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public float divide(int a, int b) {
        return (float)a / b;
    }


    public static void main(String[] args) {
        int ans=add(5,5);
        System.out.println(ans);
    }
}