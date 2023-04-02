package org.example;

public class InMilitary implements Discount {

    @Override
    public double showDiscount(){
        System.out.println("This ticket has a 10% discount");
        return 1-.1;
    }

}
