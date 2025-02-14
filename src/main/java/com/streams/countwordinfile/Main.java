//Count Words in a File
//📌 Problem Statement:
//Write a Java program that counts the number of words in a given text file and displays the top
// 5 most frequently occurring words.
//Requirements:
//Use FileReader and BufferedReader to read the file.
//Use a HashMap<String, Integer> to count word occurrences.
//Sort the words based on frequency and display the top 5.

package com.streams.countwordinfile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        File filePath = new File("D:\\Week_04\\Day_03\\src\\main\\java\\com\\streams\\countwordinfile\\TestingFile.txt");
        Map<String, Integer> wordMap =WordMap.countWords(filePath);

        //converting map to list
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordMap.entrySet());

        //Sorting the list in descending order based on word frequency
        wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Printing the top 5 most frequent words
        System.out.println("Top 5 Most Frequent Words:");
        for (int i = 0; i < Math.min(5, wordList.size()); i++) {
            System.out.println(wordList.get(i).getKey() + ": " + wordList.get(i).getValue());
        }
    }
}
