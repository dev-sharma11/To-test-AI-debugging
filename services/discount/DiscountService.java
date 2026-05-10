package com.fixbot;

public class DiscountService {
    private DiscountCalculator calculator = new DiscountCalculator();

    public void getFinalPrice(int total, int count) {
        calculator.apply(total, count);
    }
}
