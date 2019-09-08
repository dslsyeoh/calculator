/*
 * Author Steven Yeoh
 * Copyright (c) 2019. All rights reserved.
 */

package com.dsl.calculator;

import java.util.Arrays;
import java.util.Objects;

public enum Operator
{
    ADDITION("ADD", Double::sum),
    SUBTRACTION("SUB", (v1, v2) -> v1 - v2),
    MULTIPLICATION("MULTIPLY", (v1, v2) -> v1 * v2),
    DIVISION("DIV", (v1, v2) -> v1 / v2),
    ;

    private String id;
    private Evaluator<Double> evaluator;

    Operator(String id, Evaluator<Double> evaluator)
    {
        this.id = id;
        this.evaluator = evaluator;
    }

    public static Operator parse(String id)
    {
        return Arrays.stream(values()).filter(operator -> Objects.equals(operator.id, id)).findFirst().orElse(null);
    }

    public Evaluator<Double> getEvaluator()
    {
        return evaluator;
    }

    @FunctionalInterface
    public interface Evaluator<T>
    {
        T evaluate(T v1,  T v2);
    }
}
