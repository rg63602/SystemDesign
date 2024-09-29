package org.example.BehaviouralDesignPattern.CheckoutStrategy.Discount;

public class NoDiscount implements Discount{
    @Override
    public double applyDiscount() {
        System.out.println("NoDiscount :: discount applied.");
        return 0;
    }
}
