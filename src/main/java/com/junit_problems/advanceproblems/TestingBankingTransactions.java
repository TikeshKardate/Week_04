/*
1️⃣ Testing Banking Transactions
📌 Problem:
Create a BankAccount class with:
deposit(double amount): Adds money to the balance.
withdraw(double amount): Reduces balance.
getBalance(): Returns the current balance.
✅ Write JUnit tests to check correct balance updates.
✅ Ensure withdrawals fail if funds are insufficient.
*/

package com.junit_problems.advanceproblems;

public class TestingBankingTransactions {
    private double balance;

    public TestingBankingTransactions(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
