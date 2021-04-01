package com.patterns.solid;

import com.patterns.errors.InvalidCarException;

public class Main {

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
            e.printStackTrace();
        }


    }
}
