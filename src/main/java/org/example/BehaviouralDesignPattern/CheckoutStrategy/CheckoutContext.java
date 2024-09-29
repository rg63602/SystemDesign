package org.example.BehaviouralDesignPattern.CheckoutStrategy;

import org.example.BehaviouralDesignPattern.CheckoutStrategy.Discount.Discount;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Payment.Payment;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Shipping.Shipping;

public class CheckoutContext {
    Payment paymentStrategy;
    Discount discountStrategy;
    Shipping shippingStrategy;
    double amount;

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDiscountStrategy(Discount discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void setShippingStrategy(Shipping shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void checkout(){
        double discount = (amount*discountStrategy.applyDiscount())/100;
        double shippingCharges = shippingStrategy.shippingCharges();
        double totalAmount = amount - discount + shippingCharges;
        paymentStrategy.pay(totalAmount);
    }
}
