package org.example;

public class SeniorTicket extends Ticket{

    public SeniorTicket() {
        priceAttribute = 15.0f;
    }

    public void display(){
        System.out.println("Senior Ticket");
    };
    public void displayPrice(){
        System.out.println("This senior Ticket will cost " + discount.showDiscount()*priceAttribute);
    }
}
