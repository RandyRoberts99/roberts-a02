/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes in an integer and prints if the user
// is old enough to drive based on the integer comparison.

import java.util.Scanner;

public class Solution16
{
    private static final Scanner reader = new Scanner(System.in);
    private static final int drivingAge = 18;

    public static void main(String[] args)
    {
        System.out.print("What is your age? ");
        int age = reader.nextInt();

        System.out.print(age >= drivingAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}