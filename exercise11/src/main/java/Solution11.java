/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in a euro amount, an exchange rate, and converts the amount to USD and prints the outcome.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11
{
    private static final Scanner reader = new Scanner(System.in);
    private static final DecimalFormat decFormatter = new DecimalFormat("0.####");

    public static void main(String[] args)
    {
        System.out.print("How many euros are you exchanging? ");
        double euroAmount = reader.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = reader.nextDouble();

        printUsdAmount(euroAmount, exchangeRate);
    }
    private static void printUsdAmount(double euroAmount, double exchangeRate)
    {
        double usdAmount = euroAmount * exchangeRate;

        System.out.printf("%1.0f euros at an exchange rate of " + decFormatter.format(exchangeRate) + " is \n%1.2f U.S. Dollars.", euroAmount, usdAmount);
    }
}