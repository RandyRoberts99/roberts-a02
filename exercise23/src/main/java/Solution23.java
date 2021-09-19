/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Randall Roberts
 */

// Write a program that takes multiple responses as a tree and outputs according to your responses.

import java.util.Scanner;

public class Solution23
{
    private static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        String response1;
        String response2;
        String response3;
        String response4;
        String response5;

        System.out.print("Is the car silent when you turn the key? ");
        response1 = reader.next();

        if (response1.equalsIgnoreCase("yes"))
        {
            System.out.print("Are the battery terminals corroded? ");
            response2 = reader.next();

            if (response2.equalsIgnoreCase("yes"))
            {
                System.out.print("Clean terminals and try starting again.");
            }
            else
            {
                System.out.print("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            response2 = reader.next();

            if (response2.equalsIgnoreCase("yes"))
            {
                System.out.print("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                response3 = reader.next();

                if (response3.equalsIgnoreCase("yes"))
                {
                    System.out.print("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    response4 = reader.next();

                    if (response4.equalsIgnoreCase("yes"))
                    {
                        System.out.print("Does you car have fuel injection? ");
                        response5 = reader.next();

                        if (response5.equalsIgnoreCase("yes"))
                        {
                            System.out.print("Get it in for service.");
                        }
                        else
                        {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}