package com.patterns.mockito.state1Salvi;

import com.patterns.behavioral.state.state1.DeviceContext;
import com.patterns.behavioral.state.state1.OffState;
import com.patterns.behavioral.state.state1.OnState;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class State1Test {


    @InjectMocks
    DeviceContext deviceContext;


    @Test
    @DisplayName("testDeviceContext")
    public void testDeviceContext() {
    deviceContext = new DeviceContext();
    assertNotNull(deviceContext);
    }
    @Test
    @DisplayName("testDeviceisTestDeviceContext")
    public void testDeviceisTestDeviceContext() {
        deviceContext = new DeviceContext();
        assertTrue(deviceContext instanceof DeviceContext);
    }
    @Test
    @DisplayName("start not null")
    public void startNotNull() {
        OnState on = new OnState();
        assertNotNull(on);
    }
    @Test
    @DisplayName("stop not null")
    public void stopNotNull() {
        OffState off = new OffState();
        assertNotNull(off);
    }
    @Test
    @DisplayName("offIsOFF")
    public void offIsOFF() {
        OffState off = new OffState();
        assertTrue(off instanceof OffState);
    }
    @Test
    @DisplayName("onIsOn")
    public void onIsOn() {
        OnState on = new OnState();
        assertTrue(on instanceof OnState);
    }









}
