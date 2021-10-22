package com.company.uber;

public class BlackUberDriver extends UberDriver implements DriverCalculator {
    private int minimum = 10;
    private double ratePerKm = 3;
    @Override
    public double calculatePrice(double km) {
        return Math.max(ratePerKm*km,7);
    }
}
