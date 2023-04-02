package org.example;

public class AARPMember implements Discount {

    @Override
    public double showDiscount(){
        System.out.println("This ticket has a 20% discount");
        return 1-.2;
    }

}

