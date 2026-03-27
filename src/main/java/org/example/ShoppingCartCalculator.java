package org.example;

public class ShoppingCartCalculator {

    public static double calculateItemTotal(double price, int quantity) {
        return price * quantity;
    }

    public static double calculateCartTotal(double[] prices, int[] quantities) {
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
            total += calculateItemTotal(prices[i], quantities[i]);
        }
        return total;
    }
}