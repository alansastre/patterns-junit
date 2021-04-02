package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("")
class ProductTest {

    @Test
    @DisplayName("Check, Product instance created is not null")
    void test1(){
        Product product = new Product("10845",25);
        assertNotNull(product);
    }


    static class PaypalStrategyTest {

        @Test
        @DisplayName("Check paypal instanceof PaymenyStrategy")
        void test1(){
            PaymentStrategy usePaypal = new PaypalStrategy("API paypal","shenshin@gmail.com","1276x1");
            assertTrue(usePaypal instanceof PaymentStrategy);
        }

    }
}