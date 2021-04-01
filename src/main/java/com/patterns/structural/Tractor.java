package com.patterns.structural;

public class Tractor {

    private double speed;

    void changeMode(int mode){
        switch (mode){
            case 1:
                this.speed = 5; // tortuga
                break;
            case 2:
                this.speed = 15; // liebre
                break;
            default:
                this.speed = 0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
