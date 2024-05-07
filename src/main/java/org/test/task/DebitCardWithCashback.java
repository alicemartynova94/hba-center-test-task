package org.test.task;

public class DebitCardWithCashback extends DebitCard {
    private double cashback;
    private final double cashbackPersantage = 0.05;

    public DebitCardWithCashback(double balance) {
        super(balance);
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 5000) {
            cashback += calculateCashBack(amount, cashbackPersantage);
        }
        return super.pay(amount);
    }

    private double calculateCashBack(double amount, double cashbackPercentage) {
        return amount * cashbackPercentage;
    }

    @Override
    public String getAvailableFunds() {
        return super.getAvailableFunds()
                + "\nYour potential cash back: " + cashback;
    }
}
