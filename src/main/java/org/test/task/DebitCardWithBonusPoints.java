package org.test.task;

public class DebitCardWithBonusPoints extends DebitCard {
    private double bonusPoints;
    private final double bonusPointsPercentage = 0.01;

    public DebitCardWithBonusPoints(double balance) {
        super(balance);
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 0) {
            calculateBonusPoints(amount, bonusPointsPercentage);
        }
        return super.pay(amount);
    }

    private void calculateBonusPoints(double amount, double bonusPointsPercentage) {
        bonusPoints = amount * bonusPointsPercentage;
    }

    @Override
    public String getAvailableFunds() {
        return super.getAvailableFunds() +
                "\nYour bonus points: " + bonusPoints;
    }
}
