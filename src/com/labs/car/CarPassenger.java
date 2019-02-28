package com.labs.car;

public class CarPassenger extends Car {

    public int getCountPassengers() {
        return countPassengers;
    }

    private void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    private int countPassengers;


    public CarPassenger(Modal modal, int fuelRate, int price, int speed, int countPassengers) {
        super(modal, fuelRate, price, speed);
        this.setCountPassengers(countPassengers);

    }

}

