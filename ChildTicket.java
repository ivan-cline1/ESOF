package org.example;

public class ChildTicket extends Ticket {

    public ChildTicket(){
        priceAttribute = 10.0f;
    }

    public void display(){
        System.out.println("Child Ticket");
    };

    public void displayPrice(){
        System.out.println("This child's Ticket will cost " + discount.showDiscount()*priceAttribute);
    }
}
