import java.text.DecimalFormat;
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

        double compoundInterestTotal = principal * Math.pow(1 + (interestRate/100 / yearsCompounded), numYears * yearsCompounded);

        System.out.print("$" + (int)principal + " invested at " + String.format("%.1f", interestRate) + "% for " + (int)numYears + " years compounded " + (int)yearsCompounded + " times per year is $" + String.format("%.2f", compoundInterestTotal) + ".");
    }
}