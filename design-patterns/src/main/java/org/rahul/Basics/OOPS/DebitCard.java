package org.rahul.Basics.OOPS;

public class DebitCard extends Card{
    public DebitCard(String cardNo, String name) {
        super(cardNo, name); // inheriting constructor from parent class Card
    }

    @Override
    public void pay() {
        System.out.println("Making payment via Debit Card " + cardNo);
    }
}
