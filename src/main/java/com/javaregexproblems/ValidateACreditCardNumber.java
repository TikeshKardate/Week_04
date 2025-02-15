/*
1️⃣1️⃣ Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.
*/

package com.javaregexproblems;

import java.util.Scanner;

public class ValidateACreditCardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a credit card number:");
        String cardNumber = sc.nextLine();

        String visaRegex = "^4[0-9]{15}$";  // Visa: Starts with 4, 16 digits
        String masterCardRegex = "^5[1-5][0-9]{14}$"; // MasterCard: Starts with 51-55, 16 digits

        if (cardNumber.matches(visaRegex)) {
            System.out.println("Valid Visa Card!");
        } else if (cardNumber.matches(masterCardRegex)) {
            System.out.println("Valid MasterCard!");
        } else {
            System.out.println("Invalid Credit Card Number!");
        }

        sc.close();
    }
}