/*
Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
*/

package org.collectionsframework.mapinterface.wordfrequencycounter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMain {
    public static void main(String[] args) {
        // Defining the file path for reading input
        String filePath = "D:\\Week_04\\Day_02\\src\\main\\java\\org\\collectionsframework" +
                "\\mapinterface\\wordfrequencycounter\\large_file_1_MB.txt";

        //Calling the word frequency counting method
        Map<String, Integer> wordCount = WordFrequencyCounter.countWordFrequency(filePath);

        //Printing the word frequency count
        System.out.println("Word Frequency Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

class WordFrequencyCounter {
    // Defining a method for counting word frequency from a file
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        // Reading the file using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Iterating through each line of the file
            while ((line = br.readLine()) != null) {
                // Removing punctuation and converting to lowercase
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                // Splitting words by spaces
                String[] words = line.split("\\s+");

                // Iterating through words and updating frequency count
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            // Printing an error message if file reading fails
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Returning the word frequency map
        return wordCount;
    }
}
