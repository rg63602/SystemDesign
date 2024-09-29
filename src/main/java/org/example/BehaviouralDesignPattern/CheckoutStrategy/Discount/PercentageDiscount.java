package org.example.BehaviouralDesignPattern.CheckoutStrategy.Discount;

public class PercentageDiscount implements Discount{
    @Override
    public double applyDiscount() {
        System.out.println("PercentageDiscount :: discount applied.");
        return 5.00;
    }
}
