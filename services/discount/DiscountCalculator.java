package com.fixbot;

public class DiscountCalculator {
    public int apply(int total, int count) {
        // FIX: Prevent division by zero (ArithmeticException)
        if (count == 0) {
            return 0;
        }
        return total / count;
    }
}
