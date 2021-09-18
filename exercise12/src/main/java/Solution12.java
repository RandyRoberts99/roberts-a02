import java.text.DecimalFormat;
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

        double compoundInterestTotal = principal * (1 + ((interestRate/100) * numYears));

        System.out.print("After " + (int)numYears + " years at " + interestRate + "%, the investment will be worth $" + (int)compoundInterestTotal + ".");
        // After 4 years at 4.3%, the investment will be worth $1758.
    }
}