package org.example.BehaviouralDesignPattern.CheckoutStrategy.Shipping;

public class StandardShipping implements Shipping{
    @Override
    public double shippingCharges() {
        System.out.println("StandardShipping :: charges applied.");
        return 5.00;
    }
}
