import java.util.Scanner;

public class Solution14
{
    private static final Scanner reader = new Scanner(System.in);
    private static final double wisTaxRate = 0.055;

    public static void main(String[] args)
    {
        System.out.print("What is the order amount? ");
        double orderAmount = reader.nextInt();

        System.out.print("What is the state? ");
        String state = reader.next();

        double taxedOrderAmount = orderAmount;

        if (state.equals("WI"))
        {
            taxedOrderAmount *= (1 + wisTaxRate);
            System.out.print("The subtotal is $" + String.format("%.2f", orderAmount) + "." + "\nThe tax is $" + String.format("%.2f", 10 * wisTaxRate) + "." + "\nThe total is $" + String.format("%.2f", taxedOrderAmount) + ".");
            System.exit(0);
        }

        System.out.print("The total is $" + String.format("%.2f", orderAmount) + ".");
    }
}