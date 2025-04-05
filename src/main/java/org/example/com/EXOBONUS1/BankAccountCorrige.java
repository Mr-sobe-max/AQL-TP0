package org.example.com.EXOBONUS1;

/* classe bank account avec correction */
public class BankAccountCorrige {
    private double balance;
    private double interestRate;

    public BankAccountCorrige(double balance, double interestRate) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance must be non-negative");
        }
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate must be non-negative");
        }
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= amount;
    }

    public void transfer(double amount, BankAccount other) {
        if (other == null) {
            throw new NullPointerException("Other account must not be null");
        }
        withdraw(amount);
        other.deposit(amount);
    }

    public void addInterest() {
        balance = balance * (1 + interestRate);
    }

    public double getBalance() {
        return balance;
    }
}
