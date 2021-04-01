package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.function.DoubleBinaryOperator;

import static org.junit.jupiter.api.Assertions.*;

@Tag("")
class ProductTest {

    @Test
    @DisplayName("Check, Product instance created is not null")
    void test1(){
        Product product = new Product("10845",25);
        assertNotNull(product);
    }


}