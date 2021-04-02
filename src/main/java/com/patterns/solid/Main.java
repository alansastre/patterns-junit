package com.patterns.solid;

import com.patterns.errors.InvalidCarException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    // Define the logger object for this class
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        String carType = "electric";

        ICar car;
        try {
            if ("car".equals(carType)) {
                car = new Car();
            } else if ("electric".equals(carType)) {
                car = new ElectricCar();
            } else{
                throw new InvalidCarException();
            }

            car.accelerate();

        } catch (InvalidCarException e) {
            log.error("Error: ", e);
        }


    }
}
