/**
 * Creativity: I have added a tip percentage feature that calculates a gratuity amount 
 * based on the subtotal and includes it in the final total calculation.
 */

import java.util.Scanner;

public class MealPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Prices and quantities
        System.out.print("What is the price of a child's meal? ");
        double childMealPrice = scanner.nextDouble();

        System.out.print("What is the price of an adult's meal? ");
        double adultMealPrice = scanner.nextDouble();

        System.out.print("How many children are there? ");
        int numChildren = scanner.nextInt();

        System.out.print("How many adults are there? ");
        int numAdults = scanner.nextInt();

        // Calculation: Subtotal
        double subtotal = (childMealPrice * numChildren) + (adultMealPrice * numAdults);
        System.out.printf("%nSubtotal: $%.2f%n%n", subtotal);

        // Input: Tax Rate
        System.out.print("What is the sales tax rate? ");
        double taxRate = scanner.nextDouble();

        // Calculation: Sales Tax
        double salesTax = subtotal * (taxRate / 100);
        System.out.printf("Sales Tax: $%.2f%n", salesTax);

        // Creativity: Tip Calculation
        System.out.print("What percentage would you like to tip (e.g., 15)? ");
        double tipRate = scanner.nextDouble();
        double tipAmount = subtotal * (tipRate / 100);
        System.out.printf("Tip Amount: $%.2f%n", tipAmount);

        // Calculation: Total
        double total = subtotal + salesTax + tipAmount;
        System.out.printf("Total: $%.2f%n%n", total);

        // Input: Payment
        System.out.print("What is the payment amount? ");
        double payment = scanner.nextDouble();

        // Calculation: Change
        double change = payment - total;

        if (change < 0) {
            System.out.printf("The customer still owes: $%.2f%n", Math.abs(change));
        } else {
            System.out.printf("Change: $%.2f%n", change);
        }

        scanner.close();
    }
}