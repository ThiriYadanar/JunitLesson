package com.example.junitlesson;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(double dividend, double divisor) throws CalculatorException {
        if (divisor == 0) {
            throw new CalculatorException("除数に0は指定できません。");
        }

        return dividend / divisor;
    }
}