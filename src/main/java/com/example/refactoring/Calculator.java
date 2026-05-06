package com.example.refactoring;

public class Calculator {
    /**
     * Calculates the ratio between the sum and the product of two numbers.
     * Refactored: Renamed methods and variables for better clarity.
     */
    public double calculateSumProductRatio(double num1, double num2) {
        double sum = num1 + num2;
        double product = num1 * num2;
        return sum / product;
    }

    /**
     * Prints the result of a calculation.
     * Refactored: Renamed method for better clarity.
     */
    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}
