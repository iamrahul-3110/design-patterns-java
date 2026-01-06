package org.rahul.Basics.OOPS;

public class CreditCard extends Card{
    public CreditCard(String cardNo, String name) { // encapsulation of cardNo and name
        super(cardNo, name); // calling parent class constructor to initialize cardNo and userName
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Credit Card");
    }
}
