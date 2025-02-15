/*
1️⃣2️⃣ Extract Programming Language Names from a Text
🔹 Example Text:
"I love Java, Python, and JavaScript, but I haven't tried Go yet."
🔹 Expected Output:
Java, Python, JavaScript, Go
*/

package com.javaregexproblems;
import java.util.Scanner;
import java.util.regex.*;
import java.util.ArrayList;

public class ExtractProgrammingLanguageNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence containing programming languages:");
        String text = sc.nextLine();

        // List of programming languages (customize as needed)
        String[] languages = {"JavaScript", "Java", "Python", "C\\+\\+", "C#", "Go", "Ruby", "Swift", "Kotlin", "PHP"};

        // Build regex pattern dynamically
        String regex = "\\b(" + String.join("|", languages) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> extractedLanguages = new ArrayList<>();
        while (matcher.find()) {
            extractedLanguages.add(matcher.group());
        }

        if (extractedLanguages.isEmpty()) {
            System.out.println("No programming languages found.");
        } else {
            System.out.println("Extracted Languages:");
            System.out.println(String.join(", ", extractedLanguages));
        }

        sc.close();
    }
}