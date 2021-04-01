package com.patterns.structural.adapter;

import com.patterns.structural.Motorcycle;
import com.patterns.structural.Tractor;
import com.patterns.structural.TractorAdapter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("database")
class AdapterTest {

    @Test
    @DisplayName("Comprobar velocidad por defecto 0.0")
    void checkSpeedZero () {

       TractorAdapter tractor = new TractorAdapter();
        assertNotNull(tractor);
        assertEquals(0.0, tractor.getSpeed());


        System.out.println(tractor.getSpeed());
    }
    @Test
    @DisplayName("Comprobar velocidad modo 1")
    void speedUpTest () {
        TractorAdapter tractor = new TractorAdapter();
        tractor.speedUp(10);
        assertEquals(5.0,tractor.getSpeed());

    }
    @Test
    @DisplayName("Comprobar velocidad modo 2")
    void speedUpTest2 () {
        TractorAdapter tractor = new TractorAdapter();
        tractor.speedUp(20);
        assertEquals(15.0,tractor.getSpeed());
        tractor.speedUp(300); //Comprobar si se mantiene en 15
        assertEquals(15.0,tractor.getSpeed());

    }
    @Test
    @DisplayName("Comprobar velocidad de la moto")
    void speedUpMotorcycle () {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.setSpeed(200);
        assertEquals(200, motorcycle.getSpeed());
    }
    @Test
    @DisplayName("Comprobar velocidad de frenado del tractor")
    void brakeTractor () {
        TractorAdapter tractor = new TractorAdapter();
        tractor.speedUp(10);
        tractor.brake(5);
        assertEquals(0,tractor.getSpeed());



    }

}
