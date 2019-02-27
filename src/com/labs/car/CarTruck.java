package com.labs.car;

public class CarTruck extends Car {

    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    private void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public CarTruck(int fuelRate, int price, int speed, int tonnage) {
        super(fuelRate, price, speed);
        this.setTonnage(tonnage);
    }
}
