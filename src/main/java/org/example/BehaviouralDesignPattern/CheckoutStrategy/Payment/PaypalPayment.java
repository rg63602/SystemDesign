package org.example.BehaviouralDesignPattern.CheckoutStrategy.Payment;

public class PaypalPayment implements Payment{
    String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("PaypalPayment :: Rs. " + amount + " Payment is done with email - " + email + ".");
    }
}
