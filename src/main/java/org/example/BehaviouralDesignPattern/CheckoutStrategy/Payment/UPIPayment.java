package org.example.BehaviouralDesignPattern.CheckoutStrategy.Payment;

public class UPIPayment implements Payment{
    String UPIId;

    public UPIPayment(String UPIId) {
        this.UPIId = UPIId;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("PaypalPayment :: Rs. " + amount + " Payment is done with UPI id - " + UPIId + ".");
    }
}
