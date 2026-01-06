package org.rahul.Basics.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("RahulDebitCard",new DebitCard("1234","Rahul Narang"));
        ps.addPaymentMethod("RahulCreditCard",new CreditCard("5678","Rahul Narang"));
        ps.addPaymentMethod("RahulUPI",new UPI("Rahul27"));
        ps.addPaymentMethod("RahulWallet",new Wallet());
        ps.makePayment("RahulUPI");
        ps.makePayment("RahulDebitCard");
        ps.makePayment("RahulWallet");

    }
}
