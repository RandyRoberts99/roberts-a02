import java.util.Scanner;

public class Solution10
{
    private static final Scanner reader = new Scanner(System.in);
    private static final double taxRate = 0.055;

    public static void main(String[] args)
    {
        System.out.print("Enter the price of item 1: ");
        String itemOnePrice = reader.next();
        System.out.print("Enter the quantity of item 1: ");
        String itemOneQuantity = reader.next();

        System.out.print("Enter the price of item 2: ");
        String itemTwoPrice = reader.next();
        System.out.print("Enter the quantity of item 2: ");
        String itemTwoQuantity = reader.next();

        System.out.print("Enter the price of item 3: ");
        String itemThreePrice = reader.next();
        System.out.print("Enter the quantity of item 3: ");
        String itemThreeQuantity = reader.next();

        double itemOnePriceDouble = Double.parseDouble(itemOnePrice);
        double itemOneQuantityDouble = Double.parseDouble(itemOneQuantity);
        double itemOneTotal = itemOnePriceDouble * itemOneQuantityDouble;

        double itemTwoPriceDouble = Double.parseDouble(itemTwoPrice);
        double itemTwoQuantityDouble = Double.parseDouble(itemTwoQuantity);
        double itemTwoTotal = itemTwoPriceDouble * itemTwoQuantityDouble;

        double itemThreePriceDouble = Double.parseDouble(itemThreePrice);
        double itemThreeQuantityDouble = Double.parseDouble(itemThreeQuantity);
        double itemThreeTotal = itemThreePriceDouble * itemThreeQuantityDouble;

        double itemSubtotal = itemOneTotal + itemTwoTotal + itemThreeTotal;
        double tax = itemSubtotal * taxRate;
        double itemCompleteTotal = tax + itemSubtotal;

        String output = ("Subtotal: $" + String.format("%1.2f", itemSubtotal) + "\nTax: $" + String.format("%1.2f", tax) + "\nTotal: $" + String.format("%1.2f", itemCompleteTotal));
        System.out.print(output);
    }
}
