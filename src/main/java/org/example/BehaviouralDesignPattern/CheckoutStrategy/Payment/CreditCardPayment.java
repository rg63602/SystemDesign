package org.example.BehaviouralDesignPattern.CheckoutStrategy.Payment;

public class CreditCardPayment implements Payment{
    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("CreditCardPayment :: Rs. " + amount + " Payment is done with Card - " + cardNumber + ".");
    }

}
