package com.patterns.solid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements ICar{

    // Define the logger object for this class
    private final Logger log = LoggerFactory.getLogger(Car.class);

    @Override
    public void accelerate() {
        log.debug("accelerating the car");
    }

    @Override
    public void stop() {
        log.debug("stopping the car");
    }
}
