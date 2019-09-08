/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.calculator;

import static com.dsl.calculator.Operator.*;

public class CalculatorDemo
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        calculator.setOperator(ADDITION);
        System.out.println(String.format("%.2f + %.2f = %.2f", 1.5, 3.5, calculator.calculate(1.5, 3.5)));
        calculator.setOperator(SUBTRACTION);
        System.out.println(String.format("%.2f - %.2f = %.2f", 4.5, 2.5, calculator.calculate(4.5, 2.5)));
        calculator.setOperator(MULTIPLICATION);
        System.out.println(String.format("%.2f * %.2f = %.2f", 3.0, 2.0, calculator.calculate(3, 2)));
        calculator.setOperator(DIVISION);
        System.out.println(String.format("%.2f / %.2f = %.2f", 11.0, 2.0, calculator.calculate(11, 2)));

        System.out.println(calculator.chain(ADDITION, 3).chain(MULTIPLICATION, 3).chain(3).calculate());
        System.out.println(calculator.chain(ADDITION, 1.5, 3.5).chain(MULTIPLICATION, 3).calculate());
        System.out.println(calculator.chain(ADDITION, 1.5, 3.5).chain(3).calculate());
    }
}
