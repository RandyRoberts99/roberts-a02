/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that calculates compound interest given the principal, number of years,
// and interest rate and print the result.

import java.util.Scanner;

public class Solution12
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the principal: ");
        double principal = reader.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interestRate = reader.nextDouble();

        System.out.print("Enter the number of years: ");
        double numYears = reader.nextDouble();

        printInterestTotal(principal, interestRate, numYears);
    }
    private static void printInterestTotal(double principal, double interestRate, double numYears)
    {
        double compoundInterestTotal = principal * (1 + ((interestRate/100) * numYears));

        System.out.print("After " + (int)numYears + " years at " + interestRate + "%, the investment will be worth $" + (int)compoundInterestTotal + ".");
    }
}