package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Wisconsin residents must be changed 5% sales tax with an additional county-level charge. For Wisconsin residents, prompt for the county of residence.
 * For Eau Claire county residents, add an additional 0.005 tax.
 * For Dunn county residents, add an additional 0.004 tax.
 * Illinois residents must be charged 8% sales tax with no additional county-level charge.
 * All other states are not charged tax.
 *
 *What is the order amount? 10
 * What state do you live in? Wisconsin
 * What county do you live in? Dane
 * The tax is $0.50.
 * The total is $10.50.
 *
 *
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */


public class App 
{
    public static void main( String[] args )
    {
        Scanner in=new Scanner(System.in);
        double order;
        String states,county;
        double tax,total;

        System.out.print( "What is the order amount? " );
        order=in.nextInt();
        System.out.print( "What state do you live in? " );
        states=in.next();
        if(states.equals("Illinois")){
            tax= 0.08;
        }
        else {
            tax=0.00;
        }
        if(states.equals("Wisconsin")) {
            tax = 0.05;
            System.out.print("What county do you live in? ");
            county=in.next();
            if(county.equals("Eau Claire"))
                tax=tax+ 0.005;
            else if(county.equals("Dunn")){
                tax=tax+0.004;
            }
            else {
                tax=0.05;
            }
        }

        total=(tax*order)+order;
        DecimalFormat f=new DecimalFormat("0.00");
        total=Math.round(total*100.0)/100.0;
        System.out.println( "The tax is $"+f.format(tax*order)+".\n" +
                "The total is $"+f.format(total)+"." );

    }
}
