/*
🔟 Validate an IP Address
A valid IPv4 address consists of four groups of numbers (0-255) separated by dots.
*/

package com.javaregexproblems;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateAnIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IP address:");
        String ip = sc.nextLine();

        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            System.out.println("Valid IPv4 address!");
        } else {
            System.out.println("Invalid IPv4 address!");
        }

        sc.close();
    }
}