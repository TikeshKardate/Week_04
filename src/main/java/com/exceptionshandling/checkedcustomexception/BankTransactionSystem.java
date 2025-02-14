/*
10. Bank Transaction System (Checked + Custom Exception)
💡 Problem Statement:
Develop a Bank Account System where:
withdraw(double amount) method:
Throws InsufficientBalanceException if withdrawal amount exceeds balance.
Throws IllegalArgumentException if the amount is negative.
Handle exceptions in main().
Expected Behavior:
If valid, print "Withdrawal successful, new balance: X".
If balance is insufficient, throw and handle "Insufficient balance!".
If the amount is negative, throw and handle "Invalid amount!".*/

package com.exceptionshandling.checkedcustomexception;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Insufficient balance!");
    }
}

public class BankTransactionSystem {
    private double balance;

    public BankTransactionSystem(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankTransactionSystem account = new BankTransactionSystem(1000); // Example account with 1000 balance

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}