package org.example.BehaviouralDesignPattern.CheckoutStrategy.Shipping;

public class ExpressShipping implements Shipping{
    @Override
    public double shippingCharges() {
        System.out.println("ExpressShipping :: charges applied.");
        return 20.00;
    }
}
