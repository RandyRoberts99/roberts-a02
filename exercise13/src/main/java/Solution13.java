/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in four variables and calculates the compounded interest and prints the result.

import java.util.Scanner;

public class Solution13
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

        System.out.print("What is the number of times the interest is compounded per year? ");
        double yearsCompounded = reader.nextDouble();

        printCompoundedInterestTotal(principal, interestRate, numYears, yearsCompounded);
    }
    private static void printCompoundedInterestTotal(double principal, double interestRate, double numYears, double yearsCompounded)
    {
        double compoundInterestTotal = principal * Math.pow(1 + (interestRate/100 / yearsCompounded), numYears * yearsCompounded);

        System.out.print("$" + (int)principal + " invested at " + String.format("%.1f", interestRate) + "% for " + (int)numYears + " years compounded " + (int)yearsCompounded + " times per year is $" + String.format("%.2f", compoundInterestTotal) + ".");
    }
}