package com.patterns.prueba.TestJavier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.patterns.behavioral.state.state2.Device;
import com.patterns.behavioral.state.state2.Off;
import com.patterns.behavioral.state.state2.On;

import static org.junit.jupiter.api.Assertions.*;

class State2Test {


    @BeforeAll
    static void setupClass() {
        System.out.println("init test");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("AfterAll");
    }


    @Test
    @DisplayName("test de on")
    void testOn() {
        On onState = new On();
        Device device = new Device(onState);
        assertNotNull(device.getState());
    }

    @Test
    @DisplayName("test de off")
    void testOff() {
        Off offState = new Off();
        Device device = new Device(offState);
        assertNotNull(device.getState());
    }

    @Test
    @DisplayName("test de get state")
    void testGetState() {
        Off initialState = new Off();
        Device device = new Device(initialState);
        assertNotNull(device.getState());
    }

    @Test
    @DisplayName("test de press button")
    void testPress(){
        Device device = new Device(new Off());

        device.setState(new On());
        assertTrue(device.getState() instanceof On);

        device.pressButton();
        assertTrue(device.getState() instanceof Off);
    }

}