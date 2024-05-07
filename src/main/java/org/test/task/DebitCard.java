package org.test.task;

public class DebitCard extends BankCard {
    public DebitCard(double balance) {
        super(balance);
    }

    @Override
    public String getAvailableFunds() {
        return "Your available funds: " + getBalance();
    }
}
