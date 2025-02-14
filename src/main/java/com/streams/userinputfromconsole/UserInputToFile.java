/*
3. Read User Input from Console
📌 Problem Statement:
Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.
Requirements:
Use BufferedReader for console input.
Use FileWriter to write the data into a file.
Handle exceptions properly.
 */

package com.streams.userinputfromconsole;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class UserInputToFile {
    public static void main(String[] args) {
        // Create a file to store user input
        File filepath = new File("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\userinputfromconsole\\output.txt");

        // Use try-with-resources to manage input and output
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filepath, true)) {
            // Append mode: true means data will be added to the file

            // Asking user for their name
            System.out.print("Enter your name: ");
            String name = br.readLine();

            // Asking user for their age
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine()); // Convert age from text to number

            // Asking user for their favorite programming language
            System.out.print("Enter your favorite programming language: ");
            String programming = br.readLine();

            // Write the user input to the file
            fw.write("Your name is: " + name + "\n");
            fw.write("Your age is: " + age + "\n");
            fw.write("Your favorite programming language is: " + programming + "\n");
            fw.write("-----------------------------------------\n");

            // Confirm that the data has been saved
            System.out.println("Data saved successfully.");

        } catch (Exception e) {
            // Print an error message if something goes wrong
            System.out.println("Error: " + e.getMessage());
        }
    }
}

