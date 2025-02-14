/*
1. File Handling - Read and Write a Text File
📌 Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
 */

package com.streams.readingwritingafile;
import java.io.*;

public class ReadingAndWritingAFile {
    public static void main(String[] args) {
        // File to read from
        File readFile = new File("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\redingwritingafile\\input.txt");

        //File to write to
        File writeFile = new File("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\redingwritingafile\\output.txt");

        try (FileInputStream fis = new FileInputStream(readFile);
             FileOutputStream fos = new FileOutputStream(writeFile, true)) { // Append mode

            int byteData;

            //Read each byte from input file and write to output file
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }
}
