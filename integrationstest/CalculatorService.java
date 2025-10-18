package com.example;

public clas CalculatorService {
    private Calculator calculator = new Calculator();

    public int addAndMultiply(int a, int b, int c) {
        int sum = calculator.add(a, b);
        return calculator.multiply(sum, c);
    };
test