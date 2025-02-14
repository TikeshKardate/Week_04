/*.
Filter Streams - Convert Uppercase to Lowercase
📌 Problem Statement:
Create a program that reads a text file and writes its contents into another file,
converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.
*/

package com.streams.filterstream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class UpperCaseToLowerCase {
    public static void main(String[] args) {
       //Creating FileReader and FileWriter object for reading and writing in the file
        try(FileReader fr = new FileReader("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\filterstream\\read.txt");
            FileWriter fw = new FileWriter("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\filterstream\\output.txt")){

            // read method to read the file character by character
            int line = fr.read();
            while(line!=-1){

                char ch = (char)line;
                // converting the uppercase character into lowercase and writing into output file
                fw.write(Character.toLowerCase(ch));
                // updating to new character
                line = fr.read();
            }
            System.out.println("File converted from uppercase to lower case using FileReader and FileWriter");


        } // catching the error that will occur
        catch (Exception e) {
            // if the error occur printStackTrace method will print the error detail
            e.printStackTrace();
        }
    }
}
