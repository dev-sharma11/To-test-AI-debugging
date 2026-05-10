package com.fixbot;

public class DiscountCalculator {
    public int apply(int total, int count) {
        // BUG: Division by zero if count is 0
        return total / count;
    }
}
