package org.example.BehaviouralDesignPattern.CheckoutStrategy;

import org.example.BehaviouralDesignPattern.CheckoutStrategy.Discount.NoDiscount;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Discount.PercentageDiscount;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Payment.PaypalPayment;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Payment.UPIPayment;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Shipping.ExpressShipping;
import org.example.BehaviouralDesignPattern.CheckoutStrategy.Shipping.StandardShipping;

public class Main {
    public static void main(String[] args) {
        CheckoutContext checkoutContext = new CheckoutContext();
//        checkoutContext.setShippingStrategy(new StandardShipping());
//        checkoutContext.setDiscountStrategy(new PercentageDiscount());
//        checkoutContext.setPaymentStrategy(new UPIPayment("rishabh.gupta@upi"));
//        checkoutContext.setAmount(1000.00);
//        checkoutContext.checkout();

        checkoutContext.setShippingStrategy(new ExpressShipping());
        checkoutContext.setDiscountStrategy(new NoDiscount());
        checkoutContext.setPaymentStrategy(new PaypalPayment("rishabh.gupta@paypal.com"));
        checkoutContext.setAmount(1000.00);
        checkoutContext.checkout();
    }
}
