package org.example;

public abstract class Ticket {
    float priceAttribute;
    Discount discount= new NoDiscount();

    public Ticket() {}

    public abstract void display();

    public void displayPrice(){
        System.out.println(discount.showDiscount()*priceAttribute);
    }

}
