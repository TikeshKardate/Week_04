/*
3️⃣ Validate a Hex Color Code
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)
*/

package com.javaregexproblems;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateAHexColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hex Color Code Format: Starts with '#' followed by exactly six hexadecimal characters (0-9, A-F, a-f).");

        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);

        while (true) {
            System.out.print("Enter a hex color code: ");
            String hexColor = sc.nextLine();
            Matcher matcher = pattern.matcher(hexColor);

            if (matcher.matches()) {
                System.out.println("Valid hex color code!");
                break;
            } else {
                System.out.println("Invalid hex color code! Please follow the format #RRGGBB.");
            }
        }

        sc.close();
    }
}