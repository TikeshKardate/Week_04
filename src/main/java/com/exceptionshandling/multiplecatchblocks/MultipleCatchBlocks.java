/*
4. Multiple Catch Blocks
💡 Problem Statement:
Create a Java program that performs array operations.
Accept an integer array and an index number.
Retrieve and print the value at that index.
Handle the following exceptions:
ArrayIndexOutOfBoundsException if the index is out of range.
NullPointerException if the array is null.
Expected Behavior:
If valid, print "Value at index X: Y".
If the index is out of bounds, display "Invalid index!".
If the array is null, display "Array is not initialized!".
*/

package com.exceptionshandling.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50}; // Example array

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        sc.close();
    }
}
