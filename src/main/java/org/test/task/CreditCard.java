package org.test.task;

public class CreditCard extends BankCard {
    private final double creditLimit = 10_000;

    public CreditCard(double balance) {
        super(balance);
    }

    public double getOwnFunds() {
        double balance = getBalance();
        double yourOwnFunds = balance - creditLimit;
        if (yourOwnFunds > 0) {
            return yourOwnFunds;
        }
        return 0;
    }

    public double getCreditFunds() {
        double balance = getBalance();
        if (balance < creditLimit) {
            return balance;
        }
        return creditLimit;
    }

    @Override
    public String getAvailableFunds() {
        return "Credit card limit: " + creditLimit
                + "\nYour credit funds: " + getCreditFunds()
                + "\nYour own funds: " + getOwnFunds();
    }
}
