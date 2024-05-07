package org.test.task;

public class Main {
    public static void main(String[] args) {

        System.out.println("Debit card:");
        DebitCard debitCard = new DebitCard(1000);
        System.out.println("Initial funds (1000):");
        System.out.println(debitCard.getAvailableFunds());
        debitCard.topUp(300);
        System.out.println("After top up (300):");
        System.out.println(debitCard.getAvailableFunds());
        debitCard.pay(800);
        System.out.println("After payment (800):");
        System.out.println(debitCard.getAvailableFunds());
        System.out.println("Incorrect payment (-100):");
        debitCard.pay(-100);
        System.out.println(debitCard.getAvailableFunds());
        System.out.println("Incorrect top up (-100):");
        debitCard.topUp(-100);
        System.out.println(debitCard.getAvailableFunds());

        //________________________________________________________________

        System.out.println("Credit card:");
        CreditCard creditCard1 = new CreditCard(10_000);
        System.out.println("Initial funds for credit card # 1 (10_000):");
        System.out.println(creditCard1.getAvailableFunds());
        creditCard1.topUp(5000);
        System.out.println("Credit card # 1 after top up (5000):");
        System.out.println(creditCard1.getAvailableFunds());

        CreditCard creditCard2 = new CreditCard(5000);
        System.out.println("Initial funds for credit card # 2 (5000):");
        System.out.println(creditCard2.getAvailableFunds());
        System.out.println("Credit card #2 after incorrect payment (8000):");
        creditCard2.pay(8000);
        System.out.println(creditCard2.getAvailableFunds());

        CreditCard creditCard3 = new CreditCard(15_000);
        System.out.println("Initial funds for credit card # 3 (15_000):");
        System.out.println(creditCard3.getAvailableFunds());
        System.out.println("Credit card #3 after incorrect top up (-100):");
        creditCard3.topUp(-100);
        System.out.println(creditCard3.getAvailableFunds());
        System.out.println("Credit card #3 after payment (8000):");
        creditCard3.pay(8000);
        System.out.println(creditCard3.getAvailableFunds());

        //________________________________________________________________

        System.out.println("Debit card with bonus points:");
        DebitCardWithBonusPoints debitCardWithBonusPoints = new DebitCardWithBonusPoints(1000);
        System.out.println("Initial funds (1000):");
        System.out.println(debitCardWithBonusPoints.getAvailableFunds());
        System.out.println("After top up (300):");
        debitCardWithBonusPoints.topUp(300);
        System.out.println(debitCardWithBonusPoints.getAvailableFunds());
        System.out.println("After payment (800):");
        debitCardWithBonusPoints.pay(800);
        System.out.println(debitCardWithBonusPoints.getAvailableFunds());
        System.out.println("Incorrect payment (-100):");
        debitCardWithBonusPoints.pay(-100);
        System.out.println(debitCardWithBonusPoints.getAvailableFunds());
        System.out.println("Incorrect top up (-100):");
        debitCardWithBonusPoints.topUp(0);
        System.out.println(debitCardWithBonusPoints.getAvailableFunds());

        //________________________________________________________________

        System.out.println("Debit card with cash back:");
        DebitCardWithCashback cardWithCashback = new DebitCardWithCashback(100_000);
        System.out.println("Initial funds (100_000):");
        System.out.println(cardWithCashback.getAvailableFunds());
        System.out.println("After top up (300):");
        cardWithCashback.topUp(300);
        System.out.println(cardWithCashback.getAvailableFunds());
        System.out.println("After payment (800):");
        cardWithCashback.pay(800);
        System.out.println(cardWithCashback.getAvailableFunds());
        System.out.println("After payment (8000):");
        cardWithCashback.pay(8000);
        System.out.println(cardWithCashback.getAvailableFunds());
        System.out.println("After payment (8000) # 2:");
        cardWithCashback.pay(8000);
        System.out.println(cardWithCashback.getAvailableFunds());
        System.out.println("Incorrect payment (-100):");
        cardWithCashback.pay(-100);
        System.out.println(cardWithCashback.getAvailableFunds());
        System.out.println("Incorrect top up (-100):");
        cardWithCashback.topUp(0);
        System.out.println(cardWithCashback.getAvailableFunds());

        //________________________________________________________________

        System.out.println("Credit card with accumulation:");
        CreditCardWithAccumulation creditCardWithAccumulation1 = new CreditCardWithAccumulation(10_000);
        System.out.println("Initial funds for credit card # 1 (10_000):");
        System.out.println(creditCardWithAccumulation1.getAvailableFunds());
        System.out.println("Credit card # 1 after top up (5000):");
        creditCardWithAccumulation1.topUp(5000);
        System.out.println(creditCardWithAccumulation1.getAvailableFunds());
        System.out.println("Credit card # 1 after top up # 2 (5000):");
        creditCardWithAccumulation1.topUp(6000);
        System.out.println(creditCardWithAccumulation1.getAvailableFunds());

        CreditCardWithAccumulation creditCardWithAccumulation2 = new CreditCardWithAccumulation(5000);
        System.out.println("Initial funds for credit card # 2 (5000):");
        System.out.println(creditCardWithAccumulation2.getAvailableFunds());
        System.out.println("Credit card #2 after incorrect payment (8000):");
        creditCardWithAccumulation2.pay(8000);
        System.out.println(creditCardWithAccumulation2.getAvailableFunds());

        CreditCardWithAccumulation creditCardWithAccumulation3 = new CreditCardWithAccumulation(15_000);
        System.out.println("Initial funds for credit card # 3 (15_000):");
        System.out.println(creditCardWithAccumulation3.getAvailableFunds());
        System.out.println("Credit card #3 after incorrect top up (-100):");
        creditCardWithAccumulation3.topUp(-100);
        System.out.println(creditCardWithAccumulation3.getAvailableFunds());
        System.out.println("Credit card #3 after payment (8000):");
        creditCardWithAccumulation3.pay(8000);
        System.out.println(creditCardWithAccumulation3.getAvailableFunds());
    }
}
