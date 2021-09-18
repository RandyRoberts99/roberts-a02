import java.util.Scanner;

public class Solution16
{
    private static final Scanner reader = new Scanner(System.in);
    private static final int legalDrivingAge = 18;

    public static void main(String[] args)
    {
        System.out.print("What is your age? ");
        int age = reader.nextInt();

        System.out.print(age >= 18 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}