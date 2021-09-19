/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

// Write a program that takes in an age and a retirement age, and calculates how long it will take to retire and
// how much longer from the current year it will take to retire, and print the result.

import java.util.Calendar;
import java.util.Scanner;

public class Solution06
{
    private static final Scanner reader = new Scanner(System.in);
    private static final int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public static void main(String[] args)
    {
        System.out.print("What is your age? ");
        String age = reader.next();

        System.out.print("When would you like to retire? ");
        String retirementAge = reader.next();

        calculateAndPrintOutput(age, retirementAge);
    }
    private static void calculateAndPrintOutput(String age, String retirementAge)
    {
        int numAge = Integer.parseInt(age);
        int numRetirementAge = Integer.parseInt(retirementAge);
        int ageDiff = numRetirementAge - numAge;

        System.out.println("You have " + ageDiff + " years until you can retire.");
        System.out.print("The year is " + currentYear + ", so you can retire in " + (currentYear + ageDiff) + ".");
    }
}
