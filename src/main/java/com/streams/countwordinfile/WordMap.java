package com.streams.countwordinfile;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordMap {
    public static Map<String, Integer> countWords(File filePath){
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            HashMap<String, Integer> wordCount =new HashMap<>();
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Print the word frequency
            //System.out.println("Word Frequency: " + wordCount);
            return wordCount;

        } //handling the exception
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return null;
    }
}
