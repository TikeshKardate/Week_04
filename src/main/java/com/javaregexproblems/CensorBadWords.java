/*
9️⃣ Censor Bad Words in a Sentence
Given a list of bad words, replace them with ****.
🔹 Example Input:
"This is a damn bad example with some stupid words."
🔹 Expected Output:
"This is a **** bad example with some **** words."
*/

package com.javaregexproblems;
import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // List of bad words to censor
        String[] badWords = {"damn", "stupid"};

        // Replace each bad word with ****
        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        System.out.println("Censored Sentence:");
        System.out.println(text);

        sc.close();
    }
}