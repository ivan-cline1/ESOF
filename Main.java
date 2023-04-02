package org.example;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean flag = true;
        int counter = 0;
        Scanner myScan = new Scanner(System.in);
        //menu logic
        while (flag) {
            try {
                System.out.println("Please enter the age: ");
                int age = Integer.parseInt(myScan.nextLine());

                boolean discount;

                //childTicket
                if (age < 16) {
                    ChildTicket childTicket = new ChildTicket();
                    childTicket.displayPrice();
                }
                //SeniorTicket
                else if (age > 64) {
                    System.out.println("Will this ticket have a discount?(enter 'yes' or enter 'no'): ");
                    discount = (myScan.nextLine().toUpperCase().equals("YES"));
                    SeniorTicket seniorTicket = new SeniorTicket();
                    if (discount) {
                        seniorTicket.discount = new AARPMember();
                        seniorTicket.displayPrice();
                    } else {
                        seniorTicket.displayPrice();
                    }
                }
                //AdultTicket
                else if (age < 64 && age > 15) {
                    System.out.println("Will this ticket have a discount?(enter 'yes' or enter 'no'): ");
                    discount = (myScan.nextLine().toUpperCase().equals("YES"));
                    AdultTicket adultTicket = new AdultTicket();
                    if (discount) {
                        adultTicket.discount = new InMilitary();
                        adultTicket.displayPrice();
                    } else {
                        adultTicket.displayPrice();

                    }
                }
                //Continue or quit, menu option
                System.out.println("to Continue(enter 'c'), to Quit(enter 'q'): ");
                if (myScan.nextLine().equalsIgnoreCase("Q")) {
                    flag = false;
                    System.out.println("Quitting...");
                } else {
                    flag = true;
                }
            } catch (Exception E) {
                System.out.println("Error " + E.getLocalizedMessage());
            }
        }


    }
}
