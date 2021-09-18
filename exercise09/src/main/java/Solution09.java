import java.util.Scanner;

public class Solution09
{
    public static final Scanner reader = new Scanner(System.in);
    public static final int gallonAmount = 350;

    public static void main(String[] args)
    {
        System.out.print("What is the length of your ceiling? ");
        int length = reader.nextInt();
        System.out.print("What is the width of your ceiling? ");
        int width = reader.nextInt();

        int ceilArea = length * width;
        int numGallons = ceilArea / gallonAmount;

        if (ceilArea % gallonAmount != 0)
        {
            numGallons++;
        }
        System.out.print("You will need to purchase " + numGallons + " gallons of paint to cover "+ ceilArea + " square feet.");
    }
}