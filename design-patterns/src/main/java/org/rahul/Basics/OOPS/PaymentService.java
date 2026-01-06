package org.rahul.Basics.OOPS;

import java.util.HashMap;

// this clss shows assotiation relationship with PaymentMethod interface
public class PaymentService { // implement abstraction and polymorphism in this class you can see below makePayment method
    //Storing + Making payments
    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name,PaymentMethod pm){
          paymentMethods.put(name,pm);
    }
    public void makePayment(String name){ // abstracting the payment method details from the user
            PaymentMethod pm = paymentMethods.get(name); //Dynamic Binding using HashMap
            pm.pay(); //Run Time Polymorphism
    }
}
