package org.example;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCartApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select language:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");
        System.out.println("5. Arabic");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();
        Locale locale;

        switch (choice) {
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("sv", "SE");
                break;
            case 4:
                locale = new Locale("ja", "JP");
                break;
            case 5:
                locale = new Locale("ar", "AR");
                break;
            default:
                locale = new Locale("en", "US");
                break;
        }

        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.print(rb.getString("itemCount") + ": ");
        int itemCount = input.nextInt();

        double cartTotal = 0.0;

        for (int i = 1; i <= itemCount; i++) {
            System.out.print(rb.getString("price") + " " + i + ": ");
            double price = input.nextDouble();

            System.out.print(rb.getString("quantity") + " " + i + ": ");
            int quantity = input.nextInt();

            double itemTotal = ShoppingCartCalculator.calculateItemTotal(price, quantity);
            cartTotal += itemTotal;
        }

        System.out.println(rb.getString("cartTotal") + ": " + cartTotal);
        input.close();
    }
}