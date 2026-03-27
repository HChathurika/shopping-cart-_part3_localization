package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartCalculatorTest {

    @Test
    void testCalculateItemTotal() {
        assertEquals(50.0, ShoppingCartCalculator.calculateItemTotal(10.0, 5), 0.001);
    }

    @Test
    void testCalculateItemTotalWithDecimal() {
        assertEquals(22.5, ShoppingCartCalculator.calculateItemTotal(7.5, 3), 0.001);
    }

    @Test
    void testCalculateItemTotalWithZeroQuantity() {
        assertEquals(0.0, ShoppingCartCalculator.calculateItemTotal(10.0, 0), 0.001);
    }

    @Test
    void testCalculateCartTotal() {
        double[] prices = {10.0, 20.0, 5.0};
        int[] quantities = {2, 1, 4};
        assertEquals(60.0, ShoppingCartCalculator.calculateCartTotal(prices, quantities), 0.001);
    }

    @Test
    void testCalculateCartTotalSingleItem() {
        double[] prices = {15.0};
        int[] quantities = {2};
        assertEquals(30.0, ShoppingCartCalculator.calculateCartTotal(prices, quantities), 0.001);
    }

    @Test
    void testCalculateCartTotalWithZeroValues() {
        double[] prices = {0.0, 10.0};
        int[] quantities = {5, 0};
        assertEquals(0.0, ShoppingCartCalculator.calculateCartTotal(prices, quantities), 0.001);
    }
}