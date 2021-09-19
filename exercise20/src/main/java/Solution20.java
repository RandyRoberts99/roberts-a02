/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes an order amount, a state location, a county location, and processes
// a tax amount based on the three variables given, and prints the result.

import java.util.Scanner;

public class Solution20
{
    private static final Scanner reader = new Scanner(System.in);

    private static final double wisconsinTaxAmt = 0.05;
    private static final double illinoisTaxAmt = 0.08;
    private static final double eauClaireCountyTaxAmt = 0.05;
    private static final double dunnCountyTaxAmt = 0.04;

    public static void main(String[] args)
    {
        double finalTaxAmount = 0;
        System.out.print("What is the order amount? ");
        double orderAmount = reader.nextDouble();

        System.out.print("What state do you live in? ");
        String state = reader.next();

        System.out.print("What county do you live in? ");
        String county = reader.next();

        processLocationInfo(orderAmount, state, county, finalTaxAmount);
    }
    private static void processLocationInfo(double orderAmount, String state, String county, double finalTaxAmount)
    {
        if (state.equalsIgnoreCase("wisconsin"))
        {
            finalTaxAmount += wisconsinTaxAmt;
            if (county.equalsIgnoreCase("eau"))
            {
                finalTaxAmount += eauClaireCountyTaxAmt;
            }
            else if (county.equalsIgnoreCase("dunn"))
            {
                finalTaxAmount += dunnCountyTaxAmt;
            }
        }
        else if (state.equalsIgnoreCase("illinois"))
        {
            finalTaxAmount += illinoisTaxAmt;
        }
        System.out.print("The tax is $" + String.format("%.2f", orderAmount * finalTaxAmount) + ".\nThe total is $" + String.format("%.2f", orderAmount + (orderAmount * finalTaxAmount)) + ".");
    }
}