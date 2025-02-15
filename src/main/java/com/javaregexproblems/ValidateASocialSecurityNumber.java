/*
1️⃣5️⃣ Validate a Social Security Number (SSN)
🔹 Example Input:
"My SSN is 123-45-6789."
🔹 Expected Output:
✅ "123-45-6789" is valid
❌ "123456789" is invalid
*/

package com.javaregexproblems;
import java.util.Scanner;
import java.util.regex.*;

public class ValidateASocialSecurityNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Social Security Number (SSN):");
        String ssn = sc.nextLine();

        String regex = "^(\\d{3}-\\d{2}-\\d{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ssn);

        if (matcher.matches()) {
            System.out.println( ssn + "\" is valid");
        } else {
            System.out.println(ssn + "\" is invalid");
        }

        sc.close();
    }
}
