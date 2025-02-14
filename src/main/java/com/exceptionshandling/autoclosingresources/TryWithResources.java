/*
5. try-with-resources (Auto-closing Resources)
💡 Problem Statement:
Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
Use try-with-resources to ensure the file is automatically closed after reading.
Handle any IOException that may occur.
Expected Behavior:
If the file exists, print its first line.
If the file does not exist, catch IOException and print "Error reading file".
*/

package com.exceptionshandling.autoclosingresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        String path="D:\\Week_04\\Day_04\\src\\main\\java\\com\\exceptionshandling\\data.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.println("First line: " + br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
