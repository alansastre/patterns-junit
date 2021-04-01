package com.patterns.errors;

public class InvalidCarException extends Exception{

    public InvalidCarException(){
        super("Car not found.");
    }
}
