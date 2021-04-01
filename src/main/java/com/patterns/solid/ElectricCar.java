package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectricCar implements ICar{

    // Define the logger object for this class
    private final Logger log = LoggerFactory.getLogger(ElectricCar.class);

    private int battery;

    @Override
    public void accelerate() {
        if (hasBattery()) {
            log.debug("accelerating the car");
        } else {
            log.debug("I can not accelerate the car");
        }
    }

    @Override
    public void stop() {
        log.debug("accelerating the car");
    }

    public boolean hasBattery() {

        log.debug("checking battery");

        if (battery < 95) {
            log.debug("the battery is very low :(");
            return false;
        } else {
            log.debug("battery OK :)");
            return true;
        }
    }
}
