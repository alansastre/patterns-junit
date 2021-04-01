package com.patterns.testexample;


import com.patterns.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        assertEquals(25, calc.multiply(5,5));
    }

}