package org.example;

public class NoDiscount implements Discount{
    @Override
    public double showDiscount(){
        System.out.println("This ticket has no discount");
        return 1;
    }

}
