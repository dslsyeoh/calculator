/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.calculator;

import static com.dsl.calculator.Operator.*;

class Calculator
{
    private double total;

    Calculator() {}

    Calculator add(double value)
    {
        return chain(ADDITION, total, value);
    }

    Calculator subtract(double value)
    {
        return chain(SUBTRACTION, total, value);
    }

    Calculator multiply(double value)
    {
        return chain(MULTIPLICATION, total, value);
    }

    Calculator divide(double value)
    {
        return chain(DIVISION, total, value);
    }

    Calculator add(double v1, double v2)
    {
        return chain(ADDITION, v1, v2, true);
    }

    Calculator subtract(double v1, double v2)
    {
        return chain(SUBTRACTION, v1, v2, true);
    }

    Calculator multiply(double v1, double v2)
    {
        return chain(MULTIPLICATION, v1, v2, true);
    }

    Calculator divide(double v1, double v2)
    {
        return chain(DIVISION, v1, v2, true);
    }

    private Calculator chain(Operator operator, double v1, double v2)
    {
        return chain(operator, v1, v2, false);
    }

    private Calculator chain(Operator operator, double v1, double v2, boolean isAccumulate)
    {
        if(isAccumulate)
        {
            total += operator.getEvaluator().evaluate(v1, v2);
        }
        else
        {
            total = operator.getEvaluator().evaluate(v1, v2);
        }
        return this;
    }

    double getTotal()
    {
        return total;
    }

    void clear()
    {
        total = 0;
    }
}
