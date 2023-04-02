package org.example;

public class AdultTicket extends Ticket{

    public AdultTicket(){
        priceAttribute = 20.0f;
    }
    public void display(){
        System.out.println("Adult Ticket");
    };

    public void displayPrice(){
        System.out.println("This adult Ticket will cost " + discount.showDiscount()*priceAttribute);
    }

}
