package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopCartTest {

    @BeforeEach
    void setUp() {
        ShopCart trolley = new ShopCart();
    }




    @Test
    @DisplayName("TestNotNull")
    void testNotNull()
    {
        ShopCart trolley = new ShopCart();
        assertNotNull(trolley);

    }



}