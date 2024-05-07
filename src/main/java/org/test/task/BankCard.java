package org.test.task;

public abstract class BankCard {
    private double balance;

    public BankCard(double balance) {
        this.balance = balance;
    }

    public void topUp(double amount) {
        if (amount > 0) {
            balance += amount;
        } else
            System.out.println("Incorrect amount!");
    }

    public boolean pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        System.out.println("Incorrect amount or overdraft!");
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getAvailableFunds();
}
