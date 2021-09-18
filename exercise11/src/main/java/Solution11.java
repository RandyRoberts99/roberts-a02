import java.util.Scanner;

public class Solution11
{
    private static final Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("How many euros are you exchanging? ");
        double euroAmount = reader.nextDouble();

        System.out.print("What is the exchange rate? ");
        double exchangeRate = reader.nextDouble();

        double usdAmount = euroAmount * exchangeRate;

        System.out.printf("%1.0f euros at an exchange rate of %f is \n%1.2f U.S. Dollars.", euroAmount, exchangeRate, usdAmount);
    }
}