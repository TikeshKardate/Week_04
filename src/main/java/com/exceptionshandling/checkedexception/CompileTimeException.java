/*
1. Checked Exception (Compile-time Exception)
💡 Problem Statement:
Create a Java program that reads a file named "data.txt". If the file does not exist, handle the IOException properly and display a user-friendly message.
Expected Behavior:
If the file exists, print its contents.
If the file does not exist, catch the IOException and print "File not found".
*/

package com.exceptionshandling.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompileTimeException {
    public static void main(String[] args) {
        try {
            String path = "D:\\Week_04\\Day_04\\src\\main\\java\\com\\exceptionshandling\\data.txt";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("file is not present!");
            System.out.println("Content present is");
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        }
        catch (IOException e){
            System.out.println("File not Found");
        }
    }
}