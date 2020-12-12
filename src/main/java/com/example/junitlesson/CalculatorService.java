package com.example.junitlesson;

public interface CalculatorService {

    public int multiply(int x, int y);

    public double divide(double dividend, double divisor) throws CalculatorException;

}
