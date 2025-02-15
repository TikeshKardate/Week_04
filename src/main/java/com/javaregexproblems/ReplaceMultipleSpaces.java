/*
8️⃣ Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."
*/

package com.javaregexproblems;
import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String text = sc.nextLine();

        String modifiedText = text.replaceAll("\\s+", " ");

        System.out.println("Modified Text:");
        System.out.println(modifiedText);

        sc.close();
    }
}