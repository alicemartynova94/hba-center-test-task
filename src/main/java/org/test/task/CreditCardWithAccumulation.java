package org.test.task;

public class CreditCardWithAccumulation extends CreditCard {
    private double topUpAccumulation;
    private final double topUpAccumulationPercentage = 0.005;

    public CreditCardWithAccumulation(double balance) {
        super(balance);
    }

    @Override
    public void topUp(double amount) {
        if (amount > 0) {
            topUpAccumulation += calculateAccumulation(amount, topUpAccumulationPercentage);
        }
        super.topUp(amount);
    }

    public double calculateAccumulation(double amount, double topUpAccumulationPercentage) {
        return (amount / 100) * topUpAccumulationPercentage;
    }

    @Override
    public String getAvailableFunds() {
        return super.getAvailableFunds()
                + "\nYour accumulation: " + topUpAccumulation;
    }
}
