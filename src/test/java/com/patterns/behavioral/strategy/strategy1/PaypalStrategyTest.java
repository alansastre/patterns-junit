package com.patterns.behavioral.strategy.strategy1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaypalStrategyTest {

    @Test
    @DisplayName("Check paypal instanceof PaymenyStrategy")
    void test1(){
        PaymentStrategy usePaypal = new PaypalStrategy("API paypal","shenshin@gmail.com","1276x1");
        assertTrue(usePaypal instanceof PaymentStrategy);
    }

}