package com.patterns.solid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {


    @Test
    @DisplayName("carnotNull")
    void carnotNull() {
        Car car = new Car();
        assertNotNull(car);

    }




}