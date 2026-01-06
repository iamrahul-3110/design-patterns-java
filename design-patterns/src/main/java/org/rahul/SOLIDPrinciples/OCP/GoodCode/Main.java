package org.rahul.SOLIDPrinciples.OCP.GoodCode;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod upi = new UPI();
        PaymentMethod paypal = new PayPal();

        processor.processPayment(creditCard,100);
        processor.processPayment(upi,120);
        processor.processPayment(paypal, 400);
    }
}
