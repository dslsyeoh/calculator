/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.calculator;

public class CalculatorDemo
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        System.out.println(String.format("%.2f + %.2f = %.2f", 1.5, 3.5, calculator.add(1.5, 3.5).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f - %.2f = %.2f", 4.5, 2.5, calculator.subtract(4.5, 2.5).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f * %.2f = %.2f", 3.0, 2.0, calculator.multiply(3, 2).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f / %.2f = %.2f", 11.0, 2.0, calculator.divide(11, 2).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f * %.2f * %.2f = %.2f", 3.0, 3.0, 3.0, calculator.add(3).multiply(3).multiply(3).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f + %.2f * %.2f = %.2f", 1.5, 3.5, 3.0, calculator.add(1.5, 3.5).multiply(3).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f + %.2f + %.2f = %.2f", 1.5, 3.5, 3.0, calculator.add(1.5, 3.5).add(3).getTotal()));
        calculator.clear();
        System.out.println(String.format("%.2f + %.2f - %.2f * %.2f / %.2f = %.2f", 10.0, 5.0, 5.0, 3.0, 10.0, calculator.add(10, 5).subtract(5).multiply(3).divide(10).getTotal()));
        System.out.println(String.format("%.2f + %.2f - %.2f * %.2f / %.2f = %.2f", 10.0, 5.0, 5.0, 3.0, 10.0, calculator.add(10, 5).subtract(5).multiply(3).divide(10).getTotal()));
        System.out.println(String.format("%.2f + %.2f - %.2f * %.2f / %.2f = %.2f", 10.0, 5.0, 5.0, 3.0, 10.0, calculator.add(10, 5).subtract(5).multiply(3).divide(10).getTotal()));
    }
}
