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
    @DisplayName("addProduct")
    void addProduct() {

        Product product = new Product("adlkfjs", 20D);
        ShopCart trolley = new ShopCart();
        trolley.addProduct(product);
        assertEquals(1, trolley.getProducts().size());

    }

}