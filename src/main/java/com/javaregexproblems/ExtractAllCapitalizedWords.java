/*
5️⃣ Extract All Capitalized Words from a Sentence
🔹 Example Text:
"The Eiffel Tower is in Paris and the Statue of Liberty is in New York."
🔹 Expected Output:
Eiffel, Tower, Paris, Statue, Liberty, New, York
*/

package com.javaregexproblems;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> capitalizedWords = new ArrayList<>();
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        if (capitalizedWords.isEmpty()) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println("Extracted Capitalized Words:");
            System.out.println(String.join(", ", capitalizedWords));
        }

        sc.close();
    }
}