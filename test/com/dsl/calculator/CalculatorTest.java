package com.dsl.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest
{
    private Calculator calculator;

    @BeforeAll
    void initialize()
    {
        calculator = new Calculator();
    }

    @BeforeEach()
    void clear()
    {
        calculator.clear();
    }

    @Test
    void testAddition()
    {
        assertEquals(5, calculator.add(1.5, 3.5).getTotal());
    }

    @Test
    void testSubtraction()
    {
        assertEquals(2, calculator.subtract(4.5, 2.5).getTotal());
    }

    @Test
    void testMultiplication()
    {
        assertEquals(6, calculator.multiply(3, 2).getTotal());
    }

    @Test
    void testDivision()
    {
        assertEquals(5.5, calculator.divide(11, 2).getTotal());
    }

    @Test
    void testMixOperations_1()
    {
        assertEquals(27, calculator.add(3).multiply(3).multiply(3).getTotal());
    }

    @Test
    void testMixOperations_2()
    {
        assertEquals(15, calculator.add(1.5, 3.5).multiply(3).getTotal());
    }

    @Test
    void testMixOperations_3()
    {
        assertEquals(8, calculator.add(1.5, 3.5).add(3).getTotal());
    }
}